package com.app.appbarlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private List<Fragment> fragments;
    private ViewPager viewPager;
    List<String> titles ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tab_layout);
        titles = new ArrayList<>();
        titles.add("1");
        titles.add("2");
        titles.add("3");
        fragments = new ArrayList<>();
        fragments.add(new TestFragment());
        fragments.add(new Test1Fragment());
        fragments.add(new Test2Fragment());
        viewPager = findViewById(R.id.vp_module);
        viewPager.setAdapter(new TabPagerAdapter(getSupportFragmentManager(),titles,fragments));
        //底部导航栏可以通过这样

        viewPager.setCurrentItem(2);
        tabLayout.setupWithViewPager(viewPager);
    }
}
