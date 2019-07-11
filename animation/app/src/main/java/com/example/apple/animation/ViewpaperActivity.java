package com.example.apple.animation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ViewpaperActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private ViewPager viewpager;
    List<Fragment> fragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpaper);
        viewpager=findViewById(R.id.view_paper);
        FragmentA  fragmentA= new FragmentA();
        fragments=new ArrayList<>();
        fragments.add(new FragmentA());
        fragments.add(new FragmentB());
        fragments.add(new FragmentC());
        viewpager.addOnPageChangeListener(this);
        viewpager.setAdapter(new MyFragmentAdapter(getSupportFragmentManager(),fragments)) ;
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        viewpager.setCurrentItem(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
