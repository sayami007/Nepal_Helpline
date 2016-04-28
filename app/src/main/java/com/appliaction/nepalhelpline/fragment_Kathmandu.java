package com.appliaction.nepalhelpline;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * Created by Manandhar on 4/28/16.
 */
public class fragment_Kathmandu extends Fragment implements AdapterView.OnItemClickListener {
    ListView helpKathmandu;
    ArrayAdapter<String> numbers;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.fragment_kathmandu,container,false);
        helpKathmandu=(ListView)view.findViewById(R.id.helpKathmandu);
        String[] number={"Nepal Police","Nepal prahari"};
        numbers=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,android.R.id.text1,number);
        helpKathmandu.setAdapter(numbers);
        helpKathmandu.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0){
            String callNumber="9849607996";
            Intent callIntent=new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:"+callNumber));
            startActivity(callIntent);
        }
    }
}
