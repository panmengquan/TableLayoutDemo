package com.app.appbarlayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabPagerAdapter extends FragmentPagerAdapter {
    private List<String> titles = new ArrayList<>();
    private List<Fragment> fragments = new ArrayList<>();
    public TabPagerAdapter(FragmentManager fm,List<String> list, List<Fragment> fragmentList) {
        super(fm);
        titles.clear();
        fragments.clear();
        titles.addAll(list);
        fragments.addAll(fragmentList);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
