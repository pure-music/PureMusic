package com.caij.puremusic

import com.caij.puremusic.auto.AutoMusicProvider
import com.caij.puremusic.cast.RetroWebServer
import com.caij.puremusic.db.*
import com.caij.puremusic.fragments.LibraryViewModel
import com.caij.puremusic.fragments.albums.AlbumDetailsViewModel
import com.caij.puremusic.fragments.artists.ArtistDetailsViewModel
import com.caij.puremusic.fragments.genres.GenreDetailsViewModel
import com.caij.puremusic.fragments.playlists.PlaylistDetailsViewModel
import com.caij.puremusic.model.Genre
import com.caij.puremusic.network.provideDefaultCache
import com.caij.puremusic.network.provideLastFmRest
import com.caij.puremusic.network.provideLastFmRetrofit
import com.caij.puremusic.network.provideOkHttp
import com.caij.puremusic.providers.MusicPlaybackQueueStore
import com.caij.puremusic.repository.*
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val networkModule = module {

    factory {
        provideDefaultCache()
    }
    factory {
        provideOkHttp(get(), get())
    }
    single {
        provideLastFmRetrofit(get())
    }
    single {
        provideLastFmRest(get())
    }
}

private val roomModule = module {

    single {
        DatabaseUtil.pureMusicDatabase
    }

    factory {
        get<PureMusicDatabase>().playlistDao()
    }

    factory {
        get<PureMusicDatabase>().songDao()
    }

    factory {
        get<PureMusicDatabase>().playCountDao()
    }

    factory {
        get<PureMusicDatabase>().historyDao()
    }

    factory {
        get<PureMusicDatabase>().albumDao()
    }

    factory {
        get<PureMusicDatabase>().artistDao()
    }

    factory {
        get<PureMusicDatabase>().songEntityDao()
    }

    factory {
        get<PureMusicDatabase>().playbackDao()
    }

    factory {
        get<PureMusicDatabase>().serverAudioFormatDao()
    }

    factory {
        get<PureMusicDatabase>().serverLyricsDao()
    }

    factory {
        get<PureMusicDatabase>().serverSongCoverDao()
    }

    factory {
        get<PureMusicDatabase>().serverArtistCoverDao()
    }

    single {
        RealRoomRepository(get(), get(), get(), get(), get(), get(), get(), get(), get())
    } bind RoomRepository::class

    single {
        MusicPlaybackQueueStore(get(), get())
    }
}
private val autoModule = module {
    single {
        AutoMusicProvider(
            androidContext(),
            get(),
            get(),
            get(),
            get()
        )
    }
}
private val mainModule = module {
    single {
        androidContext().contentResolver
    }
    single {
        RetroWebServer(get())
    }
}
private val dataModule = module {
    single {
        RealRepository(
            get(),
            get(),
            get(),
            get(),
            get(),
            get(),
            get(),
            get()
        )
    } bind Repository::class

    single {
        SyncSongRepository(get())
    } bind SongRepository::class

    single {
        RealGenreRepository(get(), get())
    } bind GenreRepository::class

    single {
        RealTopPlayedRepository(get())
    } bind TopPlayedRepository::class


    single {
        RealSearchRepository(
            get(),
            get()
        )
    }
    single {
        RealLocalDataRepository(get())
    } bind LocalDataRepository::class
}

private val viewModules = module {

    viewModel {
        LibraryViewModel(get())
    }

    viewModel { (albumId: Long) ->
        AlbumDetailsViewModel(
            get(),
            albumId
        )
    }

    viewModel { (artistId: Long?, artistName: String?) ->
        ArtistDetailsViewModel(
            get(),
            artistId,
            artistName
        )
    }

    viewModel { (playlistId: Long) ->
        PlaylistDetailsViewModel(
            get(),
            playlistId
        )
    }

    viewModel { (genre: Genre) ->
        GenreDetailsViewModel(
            get(),
            genre
        )
    }
}

val appModules = listOf(mainModule, dataModule, autoModule, viewModules, networkModule, roomModule)