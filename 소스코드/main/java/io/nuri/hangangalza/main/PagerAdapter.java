package io.nuri.hangangalza.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

/**
 * Created by chayongbin on 15. 10. 22..
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    public static int LOOPS_COUNT = 10000;

    private ArrayList<PagerFragment> mFragments;
    private ViewPager mPager;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int i) {

        return mFragments.get(i % 24);

    }

    @Override
    public int getCount() {
        return mFragments.size()*LOOPS_COUNT ;
    }

    public void add(PagerFragment parallaxFragment) {
        parallaxFragment.setAdapter(this);
        mFragments.add(parallaxFragment);
        notifyDataSetChanged();
        mPager.setCurrentItem(getCount() - 1, true);

    }

    public void remove(int i) {
        mFragments.remove(i);
        notifyDataSetChanged();
    }

    public void remove(PagerFragment parallaxFragment) {
        mFragments.remove(parallaxFragment);

        int pos = mPager.getCurrentItem();
        notifyDataSetChanged();

        mPager.setAdapter(this);
        if (pos >= this.getCount()) {
            pos = this.getCount() - 1;
        }
        mPager.setCurrentItem(pos, true);

    }

    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    public void setPager(ViewPager pager) {
        mPager = pager;
    }
}