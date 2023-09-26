package com.caij.puremusic.views;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.caij.puremusic.R;
import com.caij.vip.LogUtil;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p/>
 * RecyclerView.Adapter with Header and Footer
 */
public class HeaderAndFooterRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final String TAG = "HeaderAndFooterRecyclerViewAdapter";
    private RecyclerView.Adapter<RecyclerView.ViewHolder> mInnerAdapter;

    private ArrayList<ExtendView> mHeaderViews = new ArrayList<>();
    private ArrayList<ExtendView> mFooterViews = new ArrayList<>();

    //希望保持所以head 和 footer type 唯一， 否则底部复用自定义recycler pool的会出问题。 但设置静态 可能会存在int 值溢出问题！
    private AtomicInteger mExtendTypeAtomicInteger = new AtomicInteger(Integer.MAX_VALUE / 2);

    private RecyclerView.AdapterDataObserver mDataObserver = new RecyclerView.AdapterDataObserver() {

        @Override
        public void onChanged() {
            super.onChanged();
            notifyDataSetChanged();
        }

        @Override
        public void onItemRangeChanged(int positionStart, int itemCount) {
            super.onItemRangeChanged(positionStart, itemCount);
            notifyItemRangeChanged(positionStart + getHeaderViewsCount(), itemCount);
        }

        @Override
        public void onItemRangeInserted(int positionStart, int itemCount) {
            super.onItemRangeInserted(positionStart, itemCount);
            notifyItemRangeInserted(positionStart + getHeaderViewsCount(), itemCount);
        }

        @Override
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            super.onItemRangeRemoved(positionStart, itemCount);
            notifyItemRangeRemoved(positionStart + getHeaderViewsCount(), itemCount);
        }

        @Override
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            super.onItemRangeMoved(fromPosition, toPosition, itemCount);
            int headerViewsCountCount = getHeaderViewsCount();
            notifyItemMoved(fromPosition + headerViewsCountCount, toPosition + headerViewsCountCount);
        }
    };

    public HeaderAndFooterRecyclerViewAdapter() {
    }

    public HeaderAndFooterRecyclerViewAdapter(RecyclerView.Adapter innerAdapter) {
        setAdapter(innerAdapter);
    }

    /**
     * 设置adapter
     * @param adapter
     */
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (mInnerAdapter != null) {
            notifyItemRangeRemoved(getHeaderViewsCount(), mInnerAdapter.getItemCount());
            mInnerAdapter.unregisterAdapterDataObserver(mDataObserver);
        }

        this.mInnerAdapter = adapter;
        mInnerAdapter.registerAdapterDataObserver(mDataObserver);
        notifyItemRangeInserted(getHeaderViewsCount(), mInnerAdapter.getItemCount());
    }

    public RecyclerView.Adapter getInnerAdapter() {
        return mInnerAdapter;
    }

    public void addHeaderView(View header) {
        if (header == null) {
            throw new RuntimeException("header is null");
        }

        ExtendView extendView = new ExtendView();
        extendView.view = header;
        extendView.type = getHeadOrFooterType(header);

        LogUtil.d(TAG, "Head view type %d", extendView.type);

        mHeaderViews.add(extendView);
        this.notifyDataSetChanged();
    }

    public void addHeaderView(int position, View header) {
        if (header == null) {
            throw new RuntimeException("header is null");
        }

        ExtendView extendView = new ExtendView();
        extendView.view = header;
        extendView.type = getHeadOrFooterType(header);

        LogUtil.d(TAG, "Head view type %d", extendView.type);

        mHeaderViews.add(position, extendView);
        this.notifyDataSetChanged();
    }

    private int getHeadOrFooterType(View view) {
        //同一个界面保持所有head 和 footer type 唯一， 否则底部复用自定义recycler pool的会出问题
        Context context = view.getContext();
        Activity activity = getActivity(view.getContext());
        if (activity != null) {
            View decorView = activity.getWindow().getDecorView();
            Object tag = decorView.getTag(R.id.activity_adapter_tag);
            AtomicInteger atomicInteger;
            if (tag != null) {
                atomicInteger = (AtomicInteger) tag;
            } else {
                atomicInteger = new AtomicInteger(Integer.MAX_VALUE / 2);
                decorView.setTag(R.id.activity_adapter_tag, atomicInteger);
            }
            return atomicInteger.incrementAndGet();
        }

        return mExtendTypeAtomicInteger.incrementAndGet();
    }

    public static Activity getActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        } else if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        } else {
            return null;
        }
    }

    public void addFooterView(View footer) {
        if (footer == null) {
            throw new RuntimeException("footer is null");
        }
        ExtendView zip = new ExtendView();
        zip.view = footer;
        zip.type = getHeadOrFooterType(footer);

        LogUtil.d(TAG, "Footer view type %d", zip.type);

        mFooterViews.add(zip);
        this.notifyDataSetChanged();
    }

    public void addFooterView(int position, View footer) {
        if (footer == null) {
            throw new RuntimeException("footer is null");
        }
        ExtendView zip = new ExtendView();
        zip.view = footer;
        zip.type = getHeadOrFooterType(footer);

        LogUtil.d(TAG, "Footer view type %d", zip.type);

        mFooterViews.add(position, zip);
        this.notifyDataSetChanged();
    }

    public void removeHeaderView(View view) {
        int index = findIndexByView(mHeaderViews, view);
        if (index >= 0) {
            mHeaderViews.remove(index);
            this.notifyDataSetChanged();
        }
    }

    public void removeFooterView(View view) {
        int index = findIndexByView(mFooterViews, view);
        if (index >= 0) {
            mFooterViews.remove(index);
            this.notifyDataSetChanged();
        }
    }

    public int getHeaderViewsCount() {
        return mHeaderViews.size();
    }

    public int getFooterViewsCount() {
        return mFooterViews.size();
    }

    public boolean isHeader(int position) {
        return getHeaderViewsCount() > 0 && position < getHeaderViewsCount();
    }

    public boolean isFooter(int position) {
        int lastPosition = getItemCount() - 1;
        return getFooterViewsCount() > 0 && position == lastPosition;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int headerViewsCountCount = getHeaderViewsCount();
        int footerViewsCount = getFooterViewsCount();
        int headIndex = findIndexByType(mHeaderViews, viewType);
        int footerIndex = findIndexByType(mFooterViews, viewType);
        if (headIndex >= 0 && headIndex < headerViewsCountCount) {
            View view = mHeaderViews.get(headIndex).view;
            if (view.getParent() != null) {
                ViewGroup viewParent = (ViewGroup) view.getParent();
                viewParent.removeView(view);
            }
            return new ViewHolder(view);
        } else if (footerIndex >= 0 && footerIndex < footerViewsCount) {
            View view = mFooterViews.get(footerIndex).view;
            if (view.getParent() != null) {
                ViewGroup viewParent = (ViewGroup) view.getParent();
                viewParent.removeView(view);
            }
            return new ViewHolder(view);
        } else {
            return mInnerAdapter.onCreateViewHolder(parent, viewType);
        }
    }

    private static int findIndexByType(ArrayList<ExtendView> zips, int type) {
        for (int i = 0; i < zips.size(); i++) {
            if (zips.get(i).type == type) {
                return i;
            }
        }
        return -1;
    }

    private static int findIndexByView(ArrayList<ExtendView> zips, View view) {
        for (int i = 0; i < zips.size(); i++) {
            if (zips.get(i).view == view) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int headerViewsCountCount = getHeaderViewsCount();
        if (position >= headerViewsCountCount && position < headerViewsCountCount + mInnerAdapter.getItemCount()) {
            mInnerAdapter.onBindViewHolder(holder, position - headerViewsCountCount);
        } else {
            ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
        }
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager manager = recyclerView.getLayoutManager();
        if (manager instanceof GridLayoutManager) {
            final GridLayoutManager gridManager = ((GridLayoutManager) manager);
            gridManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {
                    return (isHeader(position) || isFooter(position)) ? gridManager.getSpanCount() : 1;
                }
            });
        }
        getInnerAdapter().onAttachedToRecyclerView(recyclerView);
    }


    @Override
    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        if (!(holder instanceof ViewHolder)) {
            mInnerAdapter.onViewAttachedToWindow(holder);
        }
    }

    @Override
    public int getItemCount() {
        return getHeaderViewsCount() + getFooterViewsCount() + mInnerAdapter.getItemCount();
    }

    @Override
    public int getItemViewType(int position) {
        int innerCount = mInnerAdapter.getItemCount();
        int headerViewsCountCount = getHeaderViewsCount();
        if (position < headerViewsCountCount) {
            return mHeaderViews.get(position).type;
        } else if (headerViewsCountCount <= position && position < headerViewsCountCount + innerCount) {
            int realType = mInnerAdapter.getItemViewType(position - headerViewsCountCount);
            if (realType > Integer.MAX_VALUE / 2) {
                throw new IllegalStateException("内部Adapter的Type不能超过 Integer.MAX_VALUE / 2");
            }
            return realType;
        } else {
            int index = position - innerCount - headerViewsCountCount;
            return mFooterViews.get(index).type;
        }
    }

    public ArrayList<View> getHeaderViews() {
        if (getHeaderViewsCount() > 0) {
            ArrayList<View> headViews = new ArrayList<>(getHeaderViewsCount());
            for (ExtendView zip : mHeaderViews) {
                headViews.add(zip.view);
            }
            return headViews;
        }
        return null;
    }

    public ArrayList<View> getFooterViews() {
        if (getFooterViewsCount() > 0) {
            ArrayList<View> footerViews = new ArrayList<>(getFooterViewsCount());
            for (ExtendView zip : mFooterViews) {
                footerViews.add(zip.view);
            }
            return footerViews;
        }
        return null;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

    private static class ExtendView {
        private View view;
        private int type;
    }
}
