package androidx.recyclerview.widget;

import android.widget.OverScroller;

public class RecyclerUtil {

    public static boolean stopRecyclerViewScroll(RecyclerView recyclerView) {
        OverScroller overScroller = recyclerView.mViewFlinger.mOverScroller;
        if (overScroller != null && overScroller.computeScrollOffset()) {
            recyclerView.stopScroll();
            return true;
        }
        return false;
    }
}
