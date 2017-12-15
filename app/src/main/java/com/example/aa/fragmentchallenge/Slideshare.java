package com.example.aa.fragmentchallenge;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by aa on 12/10/17.
 */

public class Slideshare extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View slideshare=inflater.inflate(R.layout.slideshare, container, false);
        AddListView(container.getContext(),slideshare);
        return slideshare;
    }

    public void AddListView(Context context, View view){

        ArrayList<Resources> slideshareList=new ArrayList<>();
        //TODO: get the static list and filter it by resourceType that match this class

        ListViewAdapter adapter = new ListViewAdapter(context, slideshareList);

        ListView listView = view.findViewById(R.id.ResourceListview);

        listView.setAdapter(adapter);


    }
}
