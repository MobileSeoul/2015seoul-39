package io.nuri.hangangalza;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Scroller;

/**
 * Created by chayongbin on 15. 10. 18..
 */
public class ScrollPager implements View.OnTouchListener
{
    // The class encapsulates scrolling.(Overshoot)
    private Scroller scroller;
    // The task make scroll view scrolled.
    private Runnable task;

    private ScrollView mScrollView;
    private ViewGroup mContentView;

    public ScrollPager(ScrollView aScrollView, ViewGroup aContentView)
    {
        mScrollView = aScrollView;
        mContentView = aContentView;
        scroller = new Scroller(mScrollView.getContext(), new OvershootInterpolator());
        task = new Runnable()
        {
            @Override
            public void run()
            {
                scroller.computeScrollOffset();
                mScrollView.scrollTo(0, scroller.getCurrY());

                if (!scroller.isFinished())
                {
                    mScrollView.post(this);
                }
            }
        };
    }

    @Override
    public boolean onTouch(View v, MotionEvent event)
    {
        // Stop scrolling calculation.
        scroller.forceFinished(true);
        // Stop scrolling animation.
        mScrollView.removeCallbacks(task);

        if (event.getAction() == MotionEvent.ACTION_UP)
        {
            // The height of scroll view, in pixels
            int displayHeight = mScrollView.getHeight();
            // The top of content view, in pixels.
            int contentTop = mContentView.getPaddingTop();
            // The top of content view, in pixels.
            int contentBottom = mContentView.getHeight() - mContentView.getPaddingBottom();
            // The top of last page, in pixels.
            int lastPageTop = contentBottom - displayHeight;

            // The scrolled top position of scroll view, in pixels.
            int currScrollY = mScrollView.getScrollY();
            // The scrolled middle position of scroll view, in pixels.
            int currScrollMiddleY = currScrollY + displayHeight / 2 - contentTop;

            // Current page num.
            int currPage = currScrollMiddleY / displayHeight;

            // Next page num.
            int nextPage = currPage;

            // The top of next page, in pixels.
            int nextPageTop = contentTop + nextPage * displayHeight;

            // Start scrolling calculation.
            scroller.startScroll(0, currScrollY, 0, Math.max(Math.min(lastPageTop, nextPageTop), contentTop) - currScrollY, 500);

            // Start animation.
            mScrollView.post(task);

            // consume(to stop fling)
            return true;
        }

        return false;
    }
}