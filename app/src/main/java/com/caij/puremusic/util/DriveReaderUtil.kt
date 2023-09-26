package com.caij.puremusic.util

import androidx.core.net.toUri
import com.caij.puremusic.App
import com.caij.puremusic.ThreadManager
import com.caij.puremusic.db.model.Folder
import com.caij.puremusic.db.model.ServerArtistCover
import com.caij.puremusic.db.model.ServerLyrics
import com.caij.puremusic.db.model.ServerSongCover
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.drive.DriveFactorys
import com.caij.puremusic.drive.SyncCallback
import com.caij.puremusic.drive.model.DriveFile
import com.caij.puremusic.drive.model.MediaInfoWrapper
import com.caij.puremusic.drive.util.Auth20Util
import com.caij.puremusic.extensions.nameWithoutSuffix
import com.caij.puremusic.extensions.parentName
import com.caij.puremusic.extensions.parentPath
import com.caij.puremusic.extensions.populateFromMetadataCompat
import com.caij.puremusic.extensions.suffix
import com.caij.puremusic.extensions.toSong
import com.caij.puremusic.util.meta.OkhttpDataReader
import com.google.android.exoplayer2.Format
import com.google.android.exoplayer2.MediaMetadata
import com.google.android.exoplayer2.extractor.DefaultExtractorInput
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory
import com.google.android.exoplayer2.extractor.Extractor
import com.google.android.exoplayer2.extractor.ExtractorOutput
import com.google.android.exoplayer2.extractor.ExtractorsFactory
import com.google.android.exoplayer2.extractor.PositionHolder
import com.google.android.exoplayer2.extractor.SeekMap
import com.google.android.exoplayer2.extractor.TrackOutput
import com.google.android.exoplayer2.upstream.DataReader
import com.google.android.exoplayer2.util.Assertions
import com.google.android.exoplayer2.util.ParsableByteArray
import java.io.EOFException

object DriveReaderUtil {

    suspend fun addSongServerSource(folder: Folder, syncCallback: SyncCallback): MediaInfoWrapper {
        val allSongs = ArrayList<Song>()
        val serverLyricss = ArrayList<ServerLyrics>()
        val serverSongCovers = ArrayList<ServerSongCover>()
        val serverArtistCovers = ArrayList<ServerArtistCover>()
        val driveSongs = ArrayList<Song>()

        val driveSongFiles = ArrayList<DriveFile>()
        val factory = DriveFactorys.getFactory(folder.type)
        if (factory != null) {
            val driveEngine = factory.createDriveEngine(folder)
            val mediaType = MediaTypeUtil.getAllowMediaType()
            val types = ArrayList<String>(mediaType)
            val imageType = ArrayList<String>()
            imageType.add("png")
            imageType.add("jpg")
            imageType.add("jpeg")
            imageType.add("webp")
            types.addAll(imageType)

            types.add("lrc")
            types.add("LRC")

            val isReadMetadata = Auth20Util.isReadMetadata(folder)
            val formatNameRule = Auth20Util.getFormatNameRule(folder)

            val files = driveEngine.getFiles(4, types, syncCallback)
            val copySongs = ArrayList<Long>()
            for (file in files) {
                if (com.caij.puremusic.drive.util.FileUtil.allowedType(mediaType, file.fileName)) {
                    driveSongFiles.add(file)
                    val song = file.toSong(isReadMetadata, formatNameRule)
                    driveSongs.add(song)
                    copySongs.add(song.id)
                }
            }

            if (isReadMetadata && copySongs.isNotEmpty()) {
                val lock = Object()
                val pool = ThreadManager.create(4)
                for (position in driveSongs.indices) {
                    val song = driveSongs[position]
                    val songFile = driveSongFiles[position]
                    pool.execute(Runnable {
                        readFileMeta(songFile, song, copySongs, lock)
                    })
                }
                synchronized(lock) {
                    lock.wait()
                }
            }

            for (lrcFile in files) {
                if (lrcFile.fileName.endsWith(".lrc")) {
                    for (position in driveSongs.indices) {
                        val song = driveSongs[position]
                        val songFile = driveSongFiles[position]
                        if (lrcFile.nameWithoutSuffix() == songFile.nameWithoutSuffix()) {
                            val serverLyrics = ServerLyrics(song.id, folder.id, lrcFile.url)
                            serverLyricss.add(serverLyrics)
                            break
                        }
                    }
                }
            }

            for (file in files) {
                if (com.caij.puremusic.drive.util.FileUtil.allowedType(imageType, file.fileName)) {
                    if (file.fileName.startsWith("cover.")) {
                        for (position in driveSongs.indices) {
                            val song = driveSongs[position]
                            val songFile = driveSongFiles[position]
                            if (songFile.filePath.parentPath() == file.filePath.parentPath()) {
                                val serverSongCover = ServerSongCover(song.albumId.toString(), file.sourceId, file.url)
                                serverSongCovers.add(serverSongCover)
                                break
                            }
                        }
                    } else if (file.parentName == "artist") {
                        val name = file.fileName.nameWithoutSuffix()
                        val serverArtistCover = ServerArtistCover(name, file.sourceId, file.url)
                        serverArtistCovers.add(serverArtistCover)
                    }
                }
            }

            allSongs.addAll(driveSongs)
        }

        val albums = BaseAlbumUtil.splitIntoAlbums(allSongs)
        val artists = ArtistUtil.splitIntoArtists(allSongs)

        return MediaInfoWrapper(allSongs, albums, artists, null, null,
            serverLyricss, serverSongCovers, serverArtistCovers)
    }


    private fun readFileMeta(driveFile: DriveFile,
                             song: Song, copySongs: ArrayList<Long>, lock: Object) {
        var okhttpDataReader: OkhttpDataReader? = null
        var runExtractor: Extractor? = null
        var extractorInput: DefaultExtractorInput? = null
        try {
            okhttpDataReader = OkhttpDataReader(driveFile.url, MediaHttp.getOkHttpClient())
            val defaultExtractorsFactory: ExtractorsFactory = DefaultExtractorsFactory()
            val extractors = defaultExtractorsFactory.createExtractors(driveFile.url.toUri(), okhttpDataReader.getHeaders())
            extractorInput = DefaultExtractorInput(okhttpDataReader, 0, okhttpDataReader.getLength())

            if (extractors.size == 1) {
                runExtractor = extractors[0]
            } else {
                for (extractor: Extractor in extractors) {
                    try {
                        if (extractor.sniff(extractorInput)) {
                            runExtractor = extractor
                            break
                        }
                    } catch (e: EOFException) {
                        // Do nothing.
                    } finally {
                        Assertions.checkState(runExtractor != null)
                        extractorInput.resetPeekPosition()
                    }
                }
            }

            if (runExtractor != null) {
                val cancel = ArrayList<String>()
                cancel.add("format")
                cancel.add("during")
                var formatResult: Format? = null
                var durationResult: Long? = null
                runExtractor.init(object : ExtractorOutput {
                    override fun track(id: Int, type: Int): TrackOutput {
                        return object : TrackOutput {
                            override fun format(format: Format) {
                                logD("on format ${driveFile.fileName}")
                                if (cancel.contains("format")) {
                                    formatResult = format
                                }
                            }

                            override fun sampleData(
                                input: DataReader,
                                length: Int,
                                allowEndOfInput: Boolean,
                                sampleDataPart: Int
                            ): Int {
                                return 1
                            }

                            override fun sampleData(
                                data: ParsableByteArray,
                                length: Int,
                                sampleDataPart: Int
                            ) {}

                            override fun sampleMetadata(
                                timeUs: Long,
                                flags: Int,
                                size: Int,
                                offset: Int,
                                cryptoData: TrackOutput.CryptoData?
                            ) {}
                        }
                    }

                    override fun endTracks() {}

                    override fun seekMap(seekMap: SeekMap) {
                        logD("on seekMap ${driveFile.fileName}")
                        durationResult = seekMap.durationUs / 1000
                        synchronized(cancel) {
                            cancel.remove("during")
                        }
                    }
                })
                var result: Int = Extractor.RESULT_CONTINUE
                val start = System.currentTimeMillis()
                val watchDog = Runnable {
                    synchronized(cancel) {
                        cancel.clear()
                    }
                }
                ThreadManager.getInstance().mainHandler.postDelayed(watchDog, 10 * 1000)
                while (result == Extractor.RESULT_CONTINUE && cancel.isNotEmpty()) {
                    result = runExtractor.read(extractorInput, PositionHolder())
                }

                ThreadManager.getInstance().mainHandler.removeCallbacks(watchDog)


                val dt = System.currentTimeMillis() - start
                logD("on end ${driveFile.fileName} $dt")

                var mediaMetadata: MediaMetadata? = null
                if (formatResult != null) {
                    AlbumUtil.rateSong(song, formatResult!!, driveFile.suffix())
                    val metadata = formatResult!!.metadata
                    if (metadata != null) {
                        mediaMetadata = MediaMetadata.Builder()
                            .populateFromMetadataCompat(metadata)
                            .build()
                        SongAuthUtil.saveSongLyrics(song, metadata, false)
                    }
                }
                saveSongMetadata(song, mediaMetadata, durationResult)
            }
        } catch (th : Exception) {
            logD("song load meta info error ${driveFile.fileName} ${th.message}")
        } finally {
            synchronized(lock) {
                copySongs.remove(song.id)
                if (copySongs.isEmpty()) {
                    lock.notifyAll()
                }
            }
            runExtractor?.release()
            okhttpDataReader?.close()
        }
    }


    private fun saveSongMetadata(song: Song, mediaMetadata: MediaMetadata?, duration: Long?): Song {
        var title: String? = null
        if (mediaMetadata != null) {
            if (!mediaMetadata.title.isNullOrEmpty()) {
                title = mediaMetadata.title.toString()
            }
        }
        var artistName: String? = null
        var artistId: String? = null
        if (mediaMetadata != null) {
            if (!mediaMetadata.artist.isNullOrEmpty()) {
                artistName = mediaMetadata.artist.toString()
                artistId = BaseSongUtil.parseArtistId(song.artistName)
            }
        }
        var albumName: String? = null
        var albumId: Long? = null
        if (mediaMetadata != null) {
            if (!mediaMetadata.albumTitle.isNullOrEmpty()) {
                albumName = mediaMetadata.albumTitle.toString()
                albumId = albumName.hashCode().toLong()
            }
        }
        var albumArtist: String? = null
        if (mediaMetadata != null) {
            if (!mediaMetadata.albumArtist.isNullOrEmpty()) {
                albumArtist = mediaMetadata.albumArtist.toString()
            }
        }
        var year: Int? = null
        if (mediaMetadata != null) {
            if (mediaMetadata.recordingYear != null) {
                year = mediaMetadata.recordingYear!!
            }
        }
        var trackNumber: Int? = null
        if (mediaMetadata != null) {
            if (mediaMetadata.trackNumber != null) {
                trackNumber = mediaMetadata.trackNumber!!
            }
        }
        var composer: String? = null
        if (mediaMetadata != null) {
            if (!mediaMetadata.composer.isNullOrEmpty()) {
                composer = mediaMetadata.composer.toString()
            }
        }

        val newSong: Song = if (title != null || artistName != null || albumName != null || albumArtist != null
            || year != null || trackNumber != null || composer != null) {
            Song(song.id, title ?: song.title, trackNumber ?: song.trackNumber,
                year ?: song.year, duration ?: song.duration, song.url, song.path, song.dateModified, albumId ?: song.albumId, albumName ?: song.albumName,
                artistId ?: song.artistId, artistName ?: song.artistName, composer ?: song.composer, albumArtist ?: song.albumArtist,
                song.dateAdded, song.sourceType, song.sourceId, song.size)
        } else {
            song
        }

        if (mediaMetadata?.artworkData != null) {
            ThreadManager.getInstance().DISK_IO_EXECUTOR.execute(Runnable {
                CustomSongMeteImageUtil.getInstance(App.getContext()).saveImage(song, mediaMetadata.artworkData!!)
                CustomAlbumMetaImageUtil.getInstance(App.getContext()).saveImage(song.albumId, mediaMetadata.artworkData!!)
            })
        }
        return newSong
    }
}