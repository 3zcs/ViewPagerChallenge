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

public class W3school extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View w3school=inflater.inflate(R.layout.slideshare, container, false);
        AddListView(container.getContext(),w3school);
        return w3school;
    }

    public void AddListView(Context context, View view){
        ArrayList<Resources> w3schoolList=new ArrayList<>();
        //TODO: get the static list and filter it by resourceType that match this class

        ListViewAdapter adapter = new ListViewAdapter(context, w3schoolList);

        ListView listView = view.findViewById(R.id.ResourceListview);

        listView.setAdapter(adapter);


    }
}
