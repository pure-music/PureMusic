package com.caij.puremusic.fragments.backup

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.net.toUri
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.caij.puremusic.R
import com.caij.puremusic.adapter.backup.BackupAdapter
import com.caij.puremusic.databinding.FragmentBackupBinding
import com.caij.puremusic.extensions.accentColor
import com.caij.puremusic.extensions.accentOutlineColor
import com.caij.puremusic.extensions.materialDialog
import com.caij.puremusic.extensions.showToast
import com.caij.puremusic.helper.BackupHelper
import com.caij.puremusic.helper.sanitize
import com.caij.puremusic.util.Share
import com.afollestad.materialdialogs.input.input
import com.caij.puremusic.fragments.folder.FolderUtil
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File

class BackupFragment : Fragment(R.layout.fragment_backup), BackupAdapter.BackupClickedListener {

    private val backupViewModel by viewModels<BackupViewModel>()
    private var backupAdapter: BackupAdapter? = null

    private var _binding: FragmentBackupBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentBackupBinding.bind(view)
        initAdapter()
        setupRecyclerview()
        backupViewModel.backupsLiveData.observe(viewLifecycleOwner) {
            if (it.isNotEmpty())
                backupAdapter?.swapDataset(it)
            else
                backupAdapter?.swapDataset(listOf())
        }
        backupViewModel.loadBackups()
        val openFilePicker = registerForActivityResult(ActivityResultContracts.OpenDocument()) {
            lifecycleScope.launch(Dispatchers.IO) {
                it?.let {
                    startActivity(Intent(context, RestoreActivity::class.java).apply {
                        data = it
                    })
                }
            }
        }
        binding.createBackup.accentOutlineColor()
        binding.restoreBackup.accentColor()
        binding.createBackup.setOnClickListener {
            showCreateBackupDialog()
        }
        binding.restoreBackup.setOnClickListener {
            openFilePicker.launch(arrayOf("application/octet-stream"))
        }
        requireActivity().title = getString(R.string.backup_restore_title)
    }

    private fun initAdapter() {
        backupAdapter = BackupAdapter(requireActivity(), ArrayList(), this)
        backupAdapter?.registerAdapterDataObserver(object : RecyclerView.AdapterDataObserver() {
            override fun onChanged() {
                super.onChanged()
                checkIsEmpty()
            }
        })
    }

    private fun checkIsEmpty() {
        val isEmpty = backupAdapter?.itemCount == 0
        binding.backupTitle.isVisible = !isEmpty
        binding.backupRecyclerview.isVisible = !isEmpty
    }

    private fun setupRecyclerview() {
        binding.backupRecyclerview.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = backupAdapter
        }
    }

    @SuppressLint("CheckResult")
    private fun showCreateBackupDialog() {
        materialDialog().show {
            title(res = R.string.action_rename)
            input(prefill = BackupHelper.getTimeStamp()) { _, text ->
                // Text submitted with the action button
                lifecycleScope.launch {
                    withContext(Dispatchers.IO) {
                        BackupHelper.createBackup(requireContext(), text.sanitize())
                    }
                    backupViewModel.loadBackups()
                }
//                showBackChannel()
            }
            positiveButton(android.R.string.ok)
            negativeButton(R.string.action_cancel)
            setTitle(R.string.title_new_backup)
        }
    }

    private fun showBackChannel() {
        lifecycleScope.launch(Dispatchers.IO) {
            val folders = FolderUtil.folderManager.getFolders()
            withContext(Dispatchers.Main) {
                MaterialAlertDialogBuilder(requireActivity())
                    .setTitle("")
                    .setItems(folders.map {
                        it.title
                    }.toTypedArray()) { _, which ->

                    }
                    .create().show()
            }
        }
    }

    override fun onBackupClicked(file: File) {
        lifecycleScope.launch {
            startActivity(Intent(context, RestoreActivity::class.java).apply {
                data = file.toUri()
            })
        }
    }

    @SuppressLint("CheckResult")
    override fun onBackupMenuClicked(file: File, menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            R.id.action_delete -> {
                try {
                    file.delete()
                } catch (exception: SecurityException) {
                    showToast(R.string.error_delete_backup)
                }
                backupViewModel.loadBackups()
                return true
            }
            R.id.action_share -> {
                Share.shareFile(requireContext(), file, "*/*")
                return true
            }
            R.id.action_rename -> {
                materialDialog().show {
                    title(res = R.string.action_rename)
                    input(prefill = file.nameWithoutExtension) { _, text ->
                        // Text submitted with the action button
                        val renamedFile =
                            File(file.parent, "$text${BackupHelper.APPEND_EXTENSION}")
                        if (!renamedFile.exists()) {
                            file.renameTo(renamedFile)
                            backupViewModel.loadBackups()
                        } else {
                            showToast(R.string.file_already_exists)
                        }
                    }
                    positiveButton(android.R.string.ok)
                    negativeButton(R.string.action_cancel)
                    setTitle(R.string.action_rename)
                }
                return true
            }
        }
        return false
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}