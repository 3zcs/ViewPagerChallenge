package com.example.aa.fragmentchallenge;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by aa on 12/10/17.
 */

public class Youtube extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View youtube=inflater.inflate(R.layout.youtube, container, false);
        AddListView(container.getContext(),youtube);
        return youtube;
    }

    public void AddListView(Context context, View view){

       ArrayList<Resources>youtubeList=new ArrayList<>();
        //TODO: get the static list and filter it by resourceType that match this class

        ListViewAdapter adapter = new ListViewAdapter(context, youtubeList);

        ListView listView = view.findViewById(R.id.ResourceListview);

        listView.setAdapter(adapter);


    }
}
