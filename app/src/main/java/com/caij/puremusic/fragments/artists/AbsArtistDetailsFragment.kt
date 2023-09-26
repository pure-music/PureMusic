package com.caij.puremusic.fragments.artists

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.LruCache
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.widget.PopupMenu
import androidx.core.os.bundleOf
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.caij.puremusic.EXTRA_ALBUM_ID
import com.caij.puremusic.R
import com.caij.puremusic.adapter.album.HorizontalAlbumAdapter
import com.caij.puremusic.adapter.song.SimpleSongAdapter
import com.caij.puremusic.databinding.FragmentArtistDetailsBinding
import com.caij.puremusic.db.model.Album
import com.caij.puremusic.dialogs.AddToPlaylistDialog
import com.caij.puremusic.extensions.*
import com.caij.puremusic.fragments.base.AbsMainActivityFragment
import com.caij.puremusic.glide.GlideApp
import com.caij.puremusic.glide.RetroGlideExtension
import com.caij.puremusic.glide.SingleColorTarget
import com.caij.puremusic.helper.MusicPlayerRemote
import com.caij.puremusic.helper.SortOrder
import com.caij.puremusic.interfaces.IAlbumClickListener
import com.caij.puremusic.db.model.Artist
import com.caij.puremusic.model.ArtistWrapper
import com.caij.puremusic.repository.RealRepository
import com.caij.puremusic.util.*
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.transition.MaterialSharedAxis
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.fragments.albums.AlbumDetailsFragment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.android.ext.android.get
import java.util.*

abstract class AbsArtistDetailsFragment : AbsMainActivityFragment(R.layout.fragment_artist_details),
    IAlbumClickListener {

    private var _binding: FragmentArtistDetailsBinding? = null
    private val binding get() = _binding!!

    abstract val detailsViewModel: ArtistDetailsViewModel
    abstract val artistId: Long?
    abstract val artistName: String?
    private lateinit var artistWrapper: ArtistWrapper
    private lateinit var songAdapter: SimpleSongAdapter
    private lateinit var albumAdapter: HorizontalAlbumAdapter
    private var forceDownload: Boolean = false

    private val savedSongSortOrder: String
        get() = PreferenceUtil.artistDetailSongSortOrder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enterTransition = MaterialSharedAxis(MaterialSharedAxis.Y, true)
//        returnTransition = MaterialSharedAxis(MaterialSharedAxis.Y, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentArtistDetailsBinding.bind(view)
        mainActivity.addMusicServiceEventListener(detailsViewModel)
        mainActivity.setSupportActionBar(binding.toolbar)
        binding.toolbar.title = null
        detailsViewModel.getArtist().observe(viewLifecycleOwner) {
            val artist = it
            showArtistStep1(artist)
            showArtistStep2(artist)
        }

        setupRecyclerView()

        binding.playAction.apply {
            setOnClickListener {
                MusicPlayerRemote.openQueue(artistWrapper.songs, 0, true)
            }
        }
        binding.shuffleAction.apply {
            setOnClickListener {
                val songs = artistWrapper.songs
                MusicPlayerRemote.openAndShuffleQueue(songs, true)
            }
        }

        setupSongSortButton()
        binding.appBarLayout.statusBarForeground =
            MaterialShapeDrawable.createWithElevationOverlay(requireContext())

        setColors(accentColor())
    }

    private fun setupRecyclerView() {
        albumAdapter = HorizontalAlbumAdapter(requireActivity(), ArrayList(), this)
        binding.albumRecyclerView.apply {
            itemAnimator = DefaultItemAnimator()
            layoutManager = GridLayoutManager(this.context, 1, GridLayoutManager.HORIZONTAL, false)
            adapter = albumAdapter
        }
        songAdapter = SimpleSongAdapter(requireActivity(), ArrayList(), R.layout.item_song)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = songAdapter
        }
    }

    open fun showArtistStep1(artistWrapper: ArtistWrapper) {
        this@AbsArtistDetailsFragment.artistWrapper = artistWrapper
        showArtistInfo(artistWrapper.artist)
    }

    protected fun showArtistInfo(artist: Artist) {
        loadArtistImage(artist)
        binding.artistTitle.text = artist.name
    }

    private fun showArtistStep2(artistWrapper: ArtistWrapper) {
        detailsViewModel.viewModelScope.launch(Dispatchers.IO) {
            val songs = artistWrapper.songs
            withContext(Dispatchers.Main) {
                if (songs.isEmpty()) {
                    popUp()
                    return@withContext
                }
                val songText = resources.getQuantityString(
                    R.plurals.albumSongs,
                    songs.size,
                    songs.size
                )
                val albumText = resources.getQuantityString(
                    R.plurals.albums,
                    songs.size,
                    songs.size
                )
                binding.songTitle.text = songText
                binding.albumTitle.text = albumText
                songAdapter.swapDataSet(songs)
                binding.text.text = String.format(
                    "%s",
                    MusicUtil.getArtistInfoString1(requireContext(), songs))
                binding.desc.text =  MusicUtil.getArtistInfoString2(requireContext(), songs) + " • " + MusicUtil.getReadableDurationString(MusicUtil.getTotalDuration(songs))
                albumAdapter.swapDataSet(BaseAlbumUtil.splitIntoAlbums(songs))
            }
        }
    }

    private fun loadArtistImage(artist: Artist) {
        val model = RetroGlideExtension.getArtistModel(artist)
        GlideApp.with(requireContext()).asBitmapPalette()
            .artistImageOptions(model)
            .load(model)
            .dontAnimate()
            .into(object : SingleColorTarget(binding.image) {
                override fun onColorReady(color: Int) {
//                    setColors(color)
                }
            })
    }

    private fun setColors(color: Int) {
        if (_binding != null) {
            binding.playAction.applyColor(color)
            binding.shuffleAction.applyOutlineColor(color)
        }
    }

    override fun onAlbumClick(albumId: Long, view: View) {
//        findNavController().navigate(
//            R.id.albumDetailsFragment,
//            bundleOf(EXTRA_ALBUM_ID to albumId)
//        )
        val fragment = AlbumDetailsFragment()
        fragment.arguments = bundleOf(EXTRA_ALBUM_ID to albumId)
        openFragment(fragment)
    }

    override fun onMenuItemSelected(item: MenuItem): Boolean {
        return handleSortOrderMenuItem(item)
    }

    private fun handleSortOrderMenuItem(item: MenuItem): Boolean {
        lifecycleScope.launch(Dispatchers.IO) {
            val songs = artistWrapper.songs
            withContext(Dispatchers.Main) {
                when (item.itemId) {
                    android.R.id.home -> popUp()
                    R.id.action_play_next -> {
                        MusicPlayerRemote.playNext(songs)
                    }
                    R.id.action_add_to_current_playing -> {
                        MusicPlayerRemote.enqueue(songs)
                    }
                    R.id.action_add_to_playlist -> {
                        lifecycleScope.launch(Dispatchers.IO) {
                            val playlists = get<RealRepository>().fetchPlaylists()
                            withContext(Dispatchers.Main) {
                                AddToPlaylistDialog.create(playlists, songs)
                                    .show(childFragmentManager, "ADD_PLAYLIST")
                            }
                        }
                    }
                    R.id.action_set_artist_image -> {
                        val intent = Intent(Intent.ACTION_GET_CONTENT)
                        intent.type = "image/*"
                        selectImageLauncher.launch(
                            Intent.createChooser(
                                intent,
                                getString(R.string.pick_from_local_storage)
                            )
                        )
                    }
                    R.id.action_reset_artist_image -> {
                        showToast(resources.getString(R.string.updating))
                        lifecycleScope.launch {
                            CustomArtistImageUtil.getInstance(requireContext())
                                .resetCustomArtistImage(artistWrapper.artist)
                        }
                        forceDownload = true
                    }
                }
            }
        }
        return true
    }

    private fun setupSongSortButton() {
        binding.songSortOrder.setOnClickListener {
            PopupMenu(requireContext(), binding.songSortOrder).apply {
                inflate(R.menu.menu_artist_song_sort_order)
                setUpSortOrderMenu(menu)
                setOnMenuItemClickListener { item ->
                    val sortOrder = when (item.itemId) {
                        R.id.action_sort_order_title -> SortOrder.ArtistSongSortOrder.SONG_A_Z
                        R.id.action_sort_order_title_desc -> SortOrder.ArtistSongSortOrder.SONG_Z_A
                        R.id.action_sort_order_album -> SortOrder.ArtistSongSortOrder.SONG_ALBUM
                        R.id.action_sort_order_year -> SortOrder.ArtistSongSortOrder.SONG_YEAR
                        R.id.action_sort_order_song_duration -> SortOrder.ArtistSongSortOrder.SONG_DURATION
                        else -> {
                            throw IllegalArgumentException("invalid ${item.title}")
                        }
                    }
                    item.isChecked = true
                    setSaveSortOrder(sortOrder)
                    return@setOnMenuItemClickListener true
                }
                show()
            }
        }
    }

    private fun setSaveSortOrder(sortOrder: String) {
        PreferenceUtil.artistDetailSongSortOrder = sortOrder
        val songs = ArtistUtil.sortedSongs(artistWrapper.songs)
        artistWrapper.songs = songs
        songAdapter.swapDataSet(songs)
    }

    private fun setUpSortOrderMenu(sortOrder: Menu) {
        when (savedSongSortOrder) {
            SortOrder.ArtistSongSortOrder.SONG_A_Z -> sortOrder.findItem(R.id.action_sort_order_title).isChecked =
                true
            SortOrder.ArtistSongSortOrder.SONG_Z_A -> sortOrder.findItem(R.id.action_sort_order_title_desc).isChecked =
                true
            SortOrder.ArtistSongSortOrder.SONG_ALBUM ->
                sortOrder.findItem(R.id.action_sort_order_album).isChecked = true
            SortOrder.ArtistSongSortOrder.SONG_YEAR ->
                sortOrder.findItem(R.id.action_sort_order_year).isChecked = true
            SortOrder.ArtistSongSortOrder.SONG_DURATION ->
                sortOrder.findItem(R.id.action_sort_order_song_duration).isChecked = true
            else -> {
                throw IllegalArgumentException("invalid $savedSongSortOrder")
            }
        }
    }

    private val selectImageLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                result.data?.data?.let {
                    lifecycleScope.launch {
                        CustomArtistImageUtil.getInstance(requireContext())
                            .setCustomArtistImage(artistWrapper.artist, it)
                    }
                }
            }
        }

    override fun onCreateMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_artist_detail, menu)
    }

    override fun getAlbumSongs(id: Long): List<Song> {
        return detailsViewModel.getAlbumSongs(id)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}