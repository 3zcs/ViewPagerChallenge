package com.example.aa.fragmentchallenge;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class Pager extends FragmentPagerAdapter {

    public Pager(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Youtube youtube=new Youtube();
                return youtube;

            case 1:
                Slideshare slideshare=new Slideshare();
                return slideshare;

            case 2:
                W3school w3school=new W3school();
                return w3school;

            //TODO: add #4 fragment
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
