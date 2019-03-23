package com.example.android.bucharesttourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Find the view and set it's layout
        setContentView(R.layout.activity_main);

        //Find the viewpager that will allows the user to swipe between pages
        ViewPager viewPager = findViewById(R.id.viewpager);

        //Create an adapter that knows witch fragment should be displayed on each page
        CategoryAdapter pageAdapter = new CategoryAdapter(this, getSupportFragmentManager());

        //Make the viewpager use pageAdapter
        viewPager.setAdapter(pageAdapter);

        //Find and use the tabLayout four viewpager
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}