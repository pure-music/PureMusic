package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerUtil;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;


/**
 * 主要解决appbar搭配recycler view的滚动问题
 */
public class AppBarFixBehavior extends AppBarLayout.Behavior {

    private RecyclerView mRecyclerView;

    private MotionEvent mInterceptMotionEvent;

    public AppBarFixBehavior() {

    }

    public AppBarFixBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(@NotNull CoordinatorLayout parent, @NotNull AppBarLayout child, MotionEvent ev) {
        switch (ev.getActionMasked()) {
            case MotionEvent.ACTION_DOWN: {
                mInterceptMotionEvent = null;
                if (scroller != null && scroller.computeScrollOffset()) {
                    scroller.abortAnimation();
                    if (parent.isPointInChildBounds(child, (int)ev.getX(), (int)ev.getY())) {
                        mInterceptMotionEvent = ev;
                    }
                }

                if (parent.isPointInChildBounds(child, (int)ev.getX(), (int)ev.getY())) {
                    if (mRecyclerView != null) {
                        if (RecyclerUtil.stopRecyclerViewScroll(mRecyclerView)) {
                            mInterceptMotionEvent = ev;
                        }
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(parent, child, ev);
    }

    public MotionEvent getPreMotionEvent() {
        return mInterceptMotionEvent;
    }

    @Override
    public boolean onTouchEvent(@NonNull CoordinatorLayout parent, @NonNull AppBarLayout child, @NonNull MotionEvent ev) {
        return super.onTouchEvent(parent, child, ev);
    }

    private int[] location = new int[2];

    private boolean isTouchPointInView(View view, float x, float y) {
        if (view == null) {
            return false;
        }
        view.getLocationOnScreen(location);
        int left = location[0];
        int top = location[1];
        int right = left + view.getMeasuredWidth();
        int bottom = top + view.getMeasuredHeight();
        //view.isClickable() &&
        if (y >= top && y <= bottom && x >= left
                && x <= right) {
            return true;
        }
        return false;
    }

    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);

        if (target instanceof RecyclerView) {
            mRecyclerView = (RecyclerView) target;
        }
    }


    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type, consumed);
        if (target instanceof RecyclerView) {
            mRecyclerView = (RecyclerView) target;
        }
    }
}
