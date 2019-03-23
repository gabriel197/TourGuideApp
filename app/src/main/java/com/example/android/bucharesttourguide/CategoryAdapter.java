package com.example.android.bucharesttourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    //Context of the app
    private Context mContext;

    // Create a new {@link CategoryAdapter} object
    // @param fm is the fragment manager that will keep each fragment's state in the adapter
    // across swipes
    // @param context give the fragment access to context of the app (so we can get our
    // string resources at  getPageTitle)

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ParksFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new GemsFragment();
        } else return new ClubsFragment();
    }


    @Override
    public int getCount() {
        return 4;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_park);
        } else if (position == 1) {
            return mContext.getString(R.string.category_museum);
        } else if (position == 2) {
            return mContext.getString(R.string.category_gems);
        } else return mContext.getString(R.string.category_club);
    }
}