package com.example.aa.fragmentchallenge;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Pager PagerAdapter;
    static ArrayList<Resources> resourcesArray=new ArrayList<>();
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resourcesArray.add(new Resources("video1","youtube"));
        resourcesArray.add(new Resources("video2","youtube"));
        resourcesArray.add(new Resources("video3","youtube"));

        resourcesArray.add(new Resources("presentation1","slideshare"));
        resourcesArray.add(new Resources("presentation2","slideshare"));
        resourcesArray.add(new Resources("presentation3","slideshare"));

        resourcesArray.add(new Resources("html","w3school"));
        resourcesArray.add(new Resources("php","w3school"));
        resourcesArray.add(new Resources("colors","w3school"));


        //TODO: activity_main.xml have tabs declaration but they don't have titles yet give each one of them a title

        //TODO: if we want to have a new tab called (WIKI stand for wikipedia)
        //TODO: add items to the ArrayList for resource #4
        //TODO: create xml for resource #4
        //TODO: create fragment for resource #4
        //TODO: create a tab for resource #4
        //TODO: add the new tab in the Pager
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = findViewById(R.id.tabs);
        PagerAdapter = new Pager(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(PagerAdapter);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

    }

}
