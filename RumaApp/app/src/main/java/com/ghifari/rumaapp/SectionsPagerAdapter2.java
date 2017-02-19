package com.ghifari.rumaapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Ghifari on 17/02/2017.
 */
public class SectionsPagerAdapter2 extends FragmentStatePagerAdapter {

    public SectionsPagerAdapter2(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a com.ghifari.rumaapp.PlaceholderFragment2 (defined as a static inner class below).
        return PlaceholderFragment2.newInstance2(position + 1);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

}
