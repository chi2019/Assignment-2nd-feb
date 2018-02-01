package com.example.tinku.tabsandfragments;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity; // advanced features, have tool bar
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.pager);

        //toolbar: every where, add everything into tool bar
        //action bar: on the top
        // they are the same

        setSupportActionBar(toolbar);
        //add tabs
        tabLayout.addTab(tabLayout.newTab().setText("BLUE"));
        tabLayout.addTab(tabLayout.newTab().setText("GREEN"));
        tabLayout.addTab(tabLayout.newTab().setText("RED"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);// fill the complete screen

        tabLayout.setOnTabSelectedListener(this);
        MyAdapter myPagerAdapter = new MyAdapter(getSupportFragmentManager(),3);
        viewPager.setAdapter(myPagerAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tabLayout.setScrollPosition(position,0,true);
                tabLayout.setSelected(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
