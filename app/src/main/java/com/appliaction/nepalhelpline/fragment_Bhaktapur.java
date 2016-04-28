package com.appliaction.nepalhelpline;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;


/**
 * Created by Manandhar on 4/28/16.
 */
public class fragment_Bhaktapur extends Fragment {
    GridView views;
    ArrayAdapter<String> adapters;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_bhaktapur, container, false);
        views = (GridView) view.findViewById(R.id.gridView);
        String[] number = {"Nepal Police", "Nepal prahari","Nepal Police", "Nepal prahari","Nepal Police", "Nepal prahari"};
        adapters = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, android.R.id.text1, number);
        views.setAdapter(adapters);
        return view;
    }
}
