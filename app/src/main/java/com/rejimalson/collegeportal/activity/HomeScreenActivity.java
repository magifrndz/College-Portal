package com.rejimalson.collegeportal.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.rejimalson.collegeportal.R;
import com.rejimalson.collegeportal.helper.HomePageAdapter;

public class HomeScreenActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        viewPager = (ViewPager)findViewById(R.id.home_screen_view_pager_id);
        HomePageAdapter homePageAdapter = new HomePageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(homePageAdapter);
    }
}
