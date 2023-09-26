package com.caij.puremusic.fragments.playlists

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.view.doOnPreDraw
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.caij.puremusic.EVENT_PLAY_LIST_SONGS_UPDATE
import com.caij.puremusic.EXTRA_PLAYLIST
import com.caij.puremusic.EventBus
import com.caij.puremusic.EventObserver
import com.caij.puremusic.R
import com.caij.puremusic.adapter.song.OrderablePlaylistSongAdapter
import com.caij.puremusic.databinding.FragmentPlaylistDetailBinding
import com.caij.puremusic.db.PlaylistWithSongs
import com.caij.puremusic.db.model.Song
import com.caij.puremusic.db.model.SongEntity
import com.caij.puremusic.extensions.surfaceColor
import com.caij.puremusic.fragments.base.AbsMainActivityFragment
import com.caij.puremusic.helper.menu.PlaylistMenuHelper
import com.caij.puremusic.repository.RoomRepository
import com.caij.puremusic.util.MusicUtil
import com.caij.puremusic.util.ThemedFastScroller
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.transition.MaterialArcMotion
import com.google.android.material.transition.MaterialContainerTransform
import com.google.android.material.transition.MaterialSharedAxis
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import org.koin.java.KoinJavaComponent
import java.util.Collections


class PlaylistDetailsFragment : AbsMainActivityFragment(R.layout.fragment_playlist_detail),
    EventObserver {

    private var playlistId: Long = 0
    private val viewModel by viewModel<PlaylistDetailsViewModel> {
        parametersOf(requireArguments().getLong(EXTRA_PLAYLIST))
    }

    private val mRoomRepository = KoinJavaComponent.get<RoomRepository>(RoomRepository::class.java)

    private var _binding: FragmentPlaylistDetailBinding? = null
    private val binding get() = _binding!!

    private lateinit var playlistWithSongs: PlaylistWithSongs
    private lateinit var playlistSongAdapter: OrderablePlaylistSongAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = MaterialContainerTransform(requireContext(), true).apply {
            drawingViewId = R.id.fragment_container
            scrimColor = Color.TRANSPARENT
            setAllContainerColors(surfaceColor())
            setPathMotion(MaterialArcMotion())
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        playlistId = requireArguments().getLong(EXTRA_PLAYLIST)
        _binding = FragmentPlaylistDetailBinding.bind(view)
        enterTransition = MaterialSharedAxis(MaterialSharedAxis.Z, true).addTarget(view)
        returnTransition = MaterialSharedAxis(MaterialSharedAxis.Z, false)
        mainActivity.setSupportActionBar(binding.toolbar)
        binding.container.transitionName = "playlist"

        loadData()

        lifecycleScope.launch(Dispatchers.IO) {
            val exist = viewModel.playlistExists()
            withContext(Dispatchers.Main) {
                if (!exist) {
                    popUp()
                }
            }
        }

        postponeEnterTransition()
        view.doOnPreDraw { startPostponedEnterTransition() }
        binding.appBarLayout.statusBarForeground =
            MaterialShapeDrawable.createWithElevationOverlay(requireContext())

        EventBus.register(EVENT_PLAY_LIST_SONGS_UPDATE, this)


        //设置拖拽方向为上下
        //设置侧滑方向为从左到右和从右到左都可以
        //将方向参数设置进去
        //得到拖动ViewHolder的position
        //得到目标ViewHolder的position
        val itemTouchHelper = ItemTouchHelper(object : ItemTouchHelper.Callback() {
            override fun getMovementFlags(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder
            ): Int {
                if (viewHolder.bindingAdapterPosition == 0) {
                    return 0
                }
                //设置拖拽方向为上下
                val dragFlags = ItemTouchHelper.UP or ItemTouchHelper.DOWN
                //设置侧滑方向为从左到右和从右到左都可以
                val swipeFlags = 0
                //将方向参数设置进去
                return makeMovementFlags(dragFlags, swipeFlags)
            }

            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                val fromPosition = viewHolder.bindingAdapterPosition //得到拖动ViewHolder的position
                val toPosition = target.bindingAdapterPosition //得到目标ViewHolder的position
                if (toPosition == 0) return false

                val rf = fromPosition - 1
                val rt = toPosition - 1

                if (fromPosition < toPosition) {
                    for (i in rf until rt) {
                        Collections.swap(playlistSongAdapter.dataSet, i, i + 1)
                        Collections.swap(playlistWithSongs.songEntities, i, i + 1)
                    }
                } else {
                    for (i in rf downTo rt + 1) {
                        Collections.swap(playlistSongAdapter.dataSet, i, i - 1)
                        Collections.swap(playlistWithSongs.songEntities, i, i - 1)
                    }
                }
                playlistSongAdapter.notifyItemMoved(fromPosition, toPosition)
                resetDBSongEntity(playlistWithSongs.songEntities)
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {}
        })
        itemTouchHelper.attachToRecyclerView(binding.recyclerView)
    }

    fun loadData() {
        lifecycleScope.launch(Dispatchers.IO) {
            val songEntities = viewModel.getSongEntities()
            val playlistEntity = viewModel.getPlaylistEntity()
            val songs = ArrayList<Song>(songEntities.size)
            val songFilterEntities = ArrayList<SongEntity>(songEntities.size)
            songEntities.forEach {
                viewModel.getSong(it.songId)?.let { song ->
                    songs.add(song)
                    songFilterEntities.add(it)
                }
            }
            if (playlistEntity != null) {
                playlistWithSongs = PlaylistWithSongs(playlistEntity, songEntities, songs)
                withContext(Dispatchers.Main) {
                    binding.toolbar.subtitle =
                        MusicUtil.getPlaylistInfoString(requireContext(), songs)
                    binding.toolbar.title = playlistEntity.playlistName
                    setUpRecyclerView()
                    songs(songs)
                }
            } else {
                withContext(Dispatchers.Main) {
                    popUp()
                }
            }
        }
    }

    fun resetDBSongEntity(dataSet: List<SongEntity>) {
        lifecycleScope.launch(Dispatchers.IO) {
            libraryViewModel.deleteSongsInPlaylist(dataSet)
            mRoomRepository.deleteSongsInPlaylist(dataSet)
            mRoomRepository.insertSongs(dataSet.map {
                SongEntity(0, it.playlistId, it.songId)
            })
        }
    }

    override fun onFavoriteStateChanged() {
        super.onFavoriteStateChanged()
//        if (playlistId == FAVORITE_PLAYLIST_ID) {
//
//        }
    }

    private fun setUpRecyclerView() {
        playlistSongAdapter = OrderablePlaylistSongAdapter(
            playlistWithSongs.playlistEntity,
            requireActivity(),
            ArrayList(),
            R.layout.item_queue
        )

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            binding.recyclerView.adapter = playlistSongAdapter
            ThemedFastScroller.create(this)
        }
        playlistSongAdapter.registerAdapterDataObserver(object :
            RecyclerView.AdapterDataObserver() {
            override fun onChanged() {
                super.onChanged()
                checkIsEmpty()
            }
        })
    }

    override fun onCreateMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_playlist_detail, menu)
    }

    override fun onMenuItemSelected(item: MenuItem): Boolean {
        return PlaylistMenuHelper.handleMenuClick(requireActivity(), playlistWithSongs.playlistEntity, item)
    }

    private fun checkIsEmpty() {
        binding.empty.isVisible = playlistSongAdapter.itemCount == 0
        binding.emptyText.isVisible = playlistSongAdapter.itemCount == 0
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun showEmptyView() {
        binding.empty.isVisible = true
        binding.emptyText.isVisible = true
    }

    fun songs(songs: List<Song>) {
        binding.progressIndicator.hide()
        playlistSongAdapter.swapDataSet(songs)
        if (songs.isEmpty()) {
            showEmptyView()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        EventBus.unregister(EVENT_PLAY_LIST_SONGS_UPDATE, this)
    }

    override fun onEvent(key: String, value: Any?) {
        if (key == EVENT_PLAY_LIST_SONGS_UPDATE) {
            if (playlistId == value) {
                loadData()
            }
        }
    }

}