package com.ghifari.rumaapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Ghifari on 18/02/2017.
 */

public class SectionsPagerAdapter3 extends FragmentStatePagerAdapter {
    public SectionsPagerAdapter3(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a com.ghifari.rumaapp.PlaceholderFragment3 (defined as a static inner class below).
        return PlaceholderFragment3.newInstance3(position + 1);
    }

    @Override
    public int getCount() {
        // Show 1 total pages.
        return 1;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
