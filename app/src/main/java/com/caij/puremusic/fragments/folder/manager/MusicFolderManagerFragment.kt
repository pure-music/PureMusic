package com.caij.puremusic.fragments.folder.manager

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import code.name.monkey.appthemehelper.common.ATHToolbarActivity
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.bumptech.glide.Glide
import com.caij.adapter.OnItemPartViewClickListener
import com.caij.adapter.RecyclerViewOnItemClickListener
import com.caij.adapter.RecyclerViewOnItemLongClickListener
import com.caij.easypermissions.Permissions
import com.caij.puremusic.App
import com.caij.puremusic.R
import com.caij.puremusic.activities.FolderFilesActivity
import com.caij.puremusic.adapter.FolderWrapper
import com.caij.puremusic.adapter.MusicFolderAdapter
import com.caij.puremusic.databinding.FragmentMusicManagerBinding
import com.caij.puremusic.drive.DriveFactory
import com.caij.puremusic.fragments.LibraryViewModel
import com.caij.puremusic.fragments.folder.PermissionUtil
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.fragments.folder.FolderUtil
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.caij.puremusic.db.model.Folder
import com.caij.puremusic.drive.SyncCallback
import com.caij.puremusic.drive.adrive.adrive_app_id
import com.caij.puremusic.drive.adrive.adrive_open_url
import com.caij.puremusic.drive.adrive.adrive_redirect_uri
import com.caij.puremusic.drive.baidu.baidu_app_id
import com.caij.puremusic.drive.baidu.baidu_app_redirect_uri
import com.caij.puremusic.drive.baidu.baidu_auth_url
import com.caij.puremusic.drive.dropbox.dropbox_app_id
import com.caij.puremusic.drive.dropbox.dropbox_app_redirect_uri
import com.caij.puremusic.drive.google.google_app_id
import com.caij.puremusic.drive.google.google_redirect_uri
import com.caij.puremusic.drive.google.scope
import com.caij.puremusic.drive.onedrive.onedrive_client_id
import com.caij.puremusic.drive.onedrive.onedrive_redirect_uri
import com.caij.puremusic.fragments.folder.DefaultSyncCallback
import com.caij.puremusic.util.RetroUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import java.net.URLEncoder

class MusicFolderManagerFragment: Fragment(R.layout.fragment_music_manager), MenuProvider, RecyclerViewOnItemClickListener,
    OnItemPartViewClickListener, RecyclerViewOnItemLongClickListener {

    private var _binding: FragmentMusicManagerBinding? = null

    private val binding get() = _binding!!

    private lateinit var musicFolderAdapter: MusicFolderAdapter
    private lateinit var musicFolderUtil: MusicFolderUtil

    val libraryViewModel: LibraryViewModel by sharedViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMusicManagerBinding.bind(view)
        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(this, viewLifecycleOwner, Lifecycle.State.STARTED)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireActivity())
        musicFolderAdapter = MusicFolderAdapter(this)
        lifecycleScope.launch(Dispatchers.IO) {
            val folders = FolderUtil.folderManager.getFolders()
            val folderWrappers = ArrayList<FolderWrapper>()
            folders.forEach {
                val count = libraryViewModel.getSongCountBySourceId(it.id)
                folderWrappers.add(FolderWrapper(it, count))
            }
            withContext(Dispatchers.Main) {
                musicFolderAdapter.entities = folderWrappers
                musicFolderAdapter.notifyDataSetChanged()
            }
        }

        binding.recyclerView.adapter = musicFolderAdapter
        musicFolderAdapter.setOnItemClickListener(this)
        musicFolderAdapter.setOnItemPartViewClickListener(this)
        musicFolderAdapter.setOnItemLongClickListener(this)
        musicFolderUtil = MusicFolderUtil(this, requireActivity(), libraryViewModel, musicFolderAdapter)
    }

    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
        val qa = menu.add(0, R.id.action_qa, 0, "")
        qa.icon = ContextCompat.getDrawable(requireContext(), R.drawable.baseline_help_outline_24)
        qa.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS)

        val item = menu.add(0, R.id.action_add_music_source, 0, "")
        item.icon = ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_add_24)
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS)

        val toolbar = requireActivity().findViewById<Toolbar>(R.id.toolbar)
        if (toolbar != null) {
            ToolbarContentTintHelper.handleOnCreateOptionsMenu(
                requireContext(), toolbar, menu, ATHToolbarActivity.getToolbarBackgroundColor(
                    toolbar
                )
            )
        }
    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            R.id.action_add_music_source -> {
                musicFolderUtil.showSourceSelectDialog()
            }
            R.id.action_qa -> {
                RetroUtil.toQA(requireActivity())
            }
        }
        return true
    }

    override fun onItemClick(baseViewHolder: RecyclerView.ViewHolder?, view: View?, position: Int) {
        val folderWrapper = musicFolderAdapter.getItem(position)
        val folder = folderWrapper.folder
        if (folder.type == DriveFactory.TYPE_INNER) {
            val permissions = PermissionUtil.getStoragePermissionsToRequest()
            if (!Permissions.hasPermissions(requireActivity(), *permissions)) {
                Permissions.with(this)
                    .permissions(*permissions)
                    .showReasonBeforeRequest()
                    .showReasonAfterRequest()
                    .request { allGranted, _, _ ->
                        if (allGranted) {
                            toFolderDetailActivity(folder)
                        }
                    }
            } else {
                toFolderDetailActivity(folder)
            }
        } else if (folder.type == DriveFactory.TYPE_SUBSONIC) {
            //not supprot
        } else {
            toFolderDetailActivity(folder)
        }
    }

    private fun toFolderDetailActivity(folder: Folder) {
        val intent = Intent(requireActivity(), FolderFilesActivity::class.java)
        intent.putExtra("folder_type", folder.type)
        intent.putExtra("folder_id", folder.id)
        startActivity(intent)
    }

    override fun onPartViewClick(view: View, position: Int) {
        if (view.id == R.id.action_delete) {
            MaterialAlertDialogBuilder(requireActivity())
                .setTitle(R.string.check_delete_music_source_folder)
                .setMessage(R.string.delete_music_source_folder_hint_msg)
                .setPositiveButton(android.R.string.ok) { _, _ ->
                    val arrays = ArrayList(musicFolderAdapter.entities)
                    val folderWrapper = arrays.removeAt(position)
                    musicFolderAdapter.entities = arrays
                    musicFolderAdapter.notifyDataSetChanged()
                    lifecycleScope.launch(Dispatchers.IO) {
                        FolderUtil.folderManager.delete(folderWrapper.folder)
                        libraryViewModel.deleteSource(folderWrapper.folder)
                        withContext(Dispatchers.Main) {
                            MusicPlayerRemote.clearQueue()
                        }
                    }
                }
                .setNegativeButton(android.R.string.cancel, null)
                .create()
                .show()
        } else if (view.id == R.id.action_sync) {
            val dialog = MaterialAlertDialogBuilder(requireActivity())
                .setMessage(getString(R.string.syncing))
                .create()
            dialog.setCancelable(false)
            dialog.setCanceledOnTouchOutside(false)
            dialog.show()
            MusicPlayerRemote.clearQueue()

            libraryViewModel.viewModelScope.launch(Dispatchers.IO) {
                val folderWrapper = musicFolderAdapter.entities[position]
                libraryViewModel.syncSource(requireActivity(), folderWrapper.folder, DefaultSyncCallback(requireActivity(), dialog))
                folderWrapper.count = libraryViewModel.getSongCountBySourceId(folderWrapper.folder.id)
                withContext(Dispatchers.Main) {
                    musicFolderAdapter.notifyDataSetChanged()
                    Glide.get(App.getContext()).clearMemory()
                    dialog.dismiss()
                }
            }
        }
    }

    override fun onItemLongClick(
        baseViewHolder: RecyclerView.ViewHolder?,
        view: View,
        position: Int
    ): Boolean {
        showLongDialog(musicFolderAdapter.getItem(position))
        return true
    }

    private fun showLongDialog(folderWrapper: FolderWrapper) {
        val arrays = arrayOf(requireContext().getString(R.string.show_folder_songs),
            requireContext().getString(R.string.hide_folder_songs))
        MaterialAlertDialogBuilder(requireActivity())
            .setItems(arrays) { _, which ->
                when (which) {
                    0 -> {
                        val dialog = showLoadingDialog()
                        lifecycleScope.launch(Dispatchers.IO) {
                            libraryViewModel.syncSource(requireContext(), folderWrapper.folder, DefaultSyncCallback(requireActivity(), dialog))
                            val songSize = libraryViewModel.getSongCountBySourceId(folderWrapper.folder.id)
                            withContext(Dispatchers.Main) {
                                try {
                                    dialog.dismiss()
                                } catch (ignore: Throwable) {

                                }
                                folderWrapper.count = songSize
                                musicFolderAdapter.notifyDataSetChanged()
                            }
                        }
                    }
                    1 -> {
                        lifecycleScope.launch(Dispatchers.IO) {
                            libraryViewModel.deleteSource(folderWrapper.folder)
                            withContext(Dispatchers.Main) {
                                MusicPlayerRemote.clearQueue()
                            }
                        }
                    }
                }
            }
            .create()
            .show()
    }

    private fun showLoadingDialog(): AlertDialog {
        val dialog = MaterialAlertDialogBuilder(requireActivity())
            .setMessage(getString(R.string.syncing))
            .create()
        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(false)
        dialog.show()
        return dialog
    }
}