package com.appliaction.nepalhelpline;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Arrays;

import layout.NavigationDrawer;

public class Kathmandu extends AppCompatActivity {
    ViewPager viewKathmandu;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kathmandu);
        toolbar=(Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        NavigationDrawer drawerFragment=(NavigationDrawer)getSupportFragmentManager().findFragmentById(R.id.navDrawer);
        drawerFragment.setUp((DrawerLayout)findViewById(R.id.drawerLayout),toolbar);

        viewKathmandu=(ViewPager)findViewById(R.id.viewKathmandu);
        viewKathmandu.setAdapter(new CustomAdapter(getSupportFragmentManager()));
    }

    private class CustomAdapter extends FragmentPagerAdapter {
        public String[] cities={"Kathmandu","Bhaktapur","Lalitpur"};
        public CustomAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position) {
                case 0:
                    return new fragment_Kathmandu();
                case 1:
                    return new fragment_Bhaktapur();
                case 2:
                    return new fragment_Lalitpur();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return cities.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return cities[position];
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_xml,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.open){
            Toast.makeText(getApplicationContext(),"Going to Close",Toast.LENGTH_SHORT).show();
            System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }
}
