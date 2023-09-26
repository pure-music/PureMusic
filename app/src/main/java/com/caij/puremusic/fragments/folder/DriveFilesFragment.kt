package com.caij.puremusic.fragments.folder

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.caij.lib.toast.ToastUtil
import com.caij.puremusic.R
import com.caij.puremusic.activities.FolderFilesActivity
import com.caij.puremusic.adapter.DriveFileAdapter
import com.caij.puremusic.adapter.ICallbacks
import com.caij.puremusic.databinding.FragmentFolderFilesBinding
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.drive.DriveFactorys
import com.caij.puremusic.drive.model.DriveFile
import com.caij.puremusic.extensions.surfaceColor
import com.caij.puremusic.extensions.toDriveFile
import com.caij.puremusic.extensions.toLongId
import com.caij.puremusic.extensions.toSong
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.model.DriveFileParcelable
import com.caij.puremusic.repository.RoomRepository
import com.caij.puremusic.util.FileUtil
import com.caij.puremusic.util.MediaTypeUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.android.ext.android.inject
import org.koin.java.KoinJavaComponent
import java.text.FieldPosition

class DriveFilesFragment: Fragment(R.layout.fragment_folder_files), ICallbacks {

    private lateinit var adapter: DriveFileAdapter
    private var _binding: FragmentFolderFilesBinding? = null
    private val binding get() = _binding!!
    private val mRoomRepository = KoinJavaComponent.get<RoomRepository>(RoomRepository::class.java)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFolderFilesBinding.bind(view)
        view.setBackgroundColor(surfaceColor())

        binding.recyclerView.layoutManager = LinearLayoutManager(requireActivity())

        val folderId = requireArguments().getLong("folder_id", 0)
        val folderType = requireArguments().getInt("folder_type", 0)
        val driveFileParcelable = requireArguments().getParcelable<DriveFileParcelable>("file")
        val folder = FolderUtil.folderManager.getFolder(folderId)
        adapter = DriveFileAdapter(requireActivity(), emptyList(), this@DriveFilesFragment)
        binding.recyclerView.adapter = adapter
        if (folder != null) {
            val engine = DriveFactorys.getFactory(folderType)?.createDriveEngine(folder)
            if (engine != null) {
                lifecycleScope.launch(Dispatchers.Default) {
                    try {
                        val files =  if (driveFileParcelable != null) {
                            engine.getFolderFiles(driveFileParcelable.toDriveFile)
                        } else {
                            engine.getFolderFiles(null)
                        }
                        withContext(Dispatchers.Main) {
                            adapter.swapDataSet(files)
                        }
                    } catch (e: Throwable) {
                        withContext(Dispatchers.Main) {
                            ToastUtil.show(requireActivity(), getString(R.string.error_load_failed) + " " + e.message)
                        }
                    }
                }
            }
        }
    }

    override fun onFolderClicked(file: DriveFile) {
        val activity = requireActivity() as FolderFilesActivity
        activity.openFolder(file)
    }

    override fun onFileClicked(position: Int, file: DriveFile) {
        val files = adapter.getDataSet()
        if (files.isEmpty()) return
        lifecycleScope.launch(Dispatchers.IO) {
            val songs = ArrayList<Song>()
            var layoutPosition = 0
            val allowMediaType = MediaTypeUtil.getAllowMediaType()
            for (i in files.indices) {
                val childFile = files[i]
                if (!childFile.isDirectory) {
                    val allowedType = com.caij.puremusic.drive.util.FileUtil.allowedType(allowMediaType, childFile.fileName)
                    if (allowedType) {
                        val song = mRoomRepository.song(childFile.id.toLongId())
                        if (song != null) {
                            songs.add(song)
                            if (i == position) {
                                layoutPosition = songs.size - 1
                            }
                        }
                    }
                }
            }
            withContext(Dispatchers.Main) {
                if (songs.isNotEmpty()) {
                    MusicPlayerRemote.openQueue(songs, layoutPosition, true)
                }
            }
        }
    }
}