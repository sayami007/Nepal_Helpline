package layout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.appliaction.nepalhelpline.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NavigationDrawer extends Fragment {
    ActionBarDrawerToggle toggle;
    DrawerLayout layouts;
    private ListView navBarList;
    private  ArrayAdapter<String> numbers;
    private String[] number;
    public NavigationDrawer() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
        navBarList = (ListView) view.findViewById(R.id.navBarList);
        number = new String[]{"Mechi", "Koshi","Sagarmatha","Janakpur","Narayani","Bagmati","Gandaki","Lumbini","Dhaulagiri","Rapti","Bheri","Karnali","Seti","Mahakali"};
        numbers = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, android.R.id.text1, number);

        navBarList.setAdapter(numbers);
        navBarList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }else if(position==1) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }else if(position==2) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }else if(position==3) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }else if(position==4) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }else if(position==5) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }else if(position==6) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }else if(position==7) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }else if(position==8) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }else if(position==9) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }else if(position==10) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }else if(position==11) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }else if(position==12) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }else if(position==13) {
                    Toast.makeText(getContext(),"You selected "+number[position],Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

    public void setUp(DrawerLayout layout, Toolbar bar) {
        this.layouts = layout;
        toggle = new ActionBarDrawerToggle(getActivity(), layout, bar, R.string.Open, R.string.Close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getActivity().invalidateOptionsMenu();
            }
        };
        layout.setDrawerListener(toggle);
        layout.post(new Runnable() {
            @Override
            public void run() {
                toggle.syncState();
            }
        });

    }
}
