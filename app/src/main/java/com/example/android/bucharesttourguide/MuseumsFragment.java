package com.example.android.bucharesttourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.view_list, container, false);

        //Create an array list to store info about museums
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.title1), getString(R.string.text1), R.drawable.art_museum));
        places.add(new Place(getString(R.string.title2), getString(R.string.text2), R.drawable.history_museum));
        places.add(new Place(getString(R.string.title3), getString(R.string.text3), R.drawable.peasant_museum));
        places.add(new Place(getString(R.string.title4), getString(R.string.text4), R.drawable.nature_museum));
        places.add(new Place(getString(R.string.title5), getString(R.string.text5), R.drawable.george_museum));
        places.add(new Place(getString(R.string.title6), getString(R.string.text6), R.drawable.colections_museum));
        places.add(new Place(getString(R.string.title7), getString(R.string.text7), R.drawable.geography_museum));

        //Create a placeAdapter whose data source is a list of places.
        //The adapter knows how to create list items for each item in the list
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places, R.color.colorMuseum);

        //Find the ListView object in the Activity hierarchy
        ListView listView = rootView.findViewById(R.id.list);

        //Make the listView use placeAdapter so that listView will display a list item for each
        //{@param places} in the list
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}