package com.example.tinku.tabfragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryellap on 1/31/18.
 */

class SectionPageAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<Fragment>();
    private final List<String> mFragmentTitleList=new ArrayList<>();

    public void addFragment(Fragment fragment, String title){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }
    public SectionPageAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
