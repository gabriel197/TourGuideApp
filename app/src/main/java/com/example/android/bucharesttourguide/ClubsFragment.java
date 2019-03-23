package com.example.android.bucharesttourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClubsFragment extends Fragment {


    public ClubsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.view_list, container, false);

        //Create an array list to store info about museums
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.titleC1), getString(R.string.infoC1), R.drawable.player_club));
        places.add(new Place(getString(R.string.titleC2), getString(R.string.infoC2), R.drawable.control_club));
        places.add(new Place(getString(R.string.titleC3), getString(R.string.infoC3), R.drawable.princess_club));
        places.add(new Place(getString(R.string.titleC4), getString(R.string.infoC4), R.drawable.boa_club));
        places.add(new Place(getString(R.string.titleC5), getString(R.string.infoC5), R.drawable.blue_club));
        places.add(new Place(getString(R.string.titleC6), getString(R.string.infoC6), R.drawable.silver_club));
        places.add(new Place(getString(R.string.titleC7), getString(R.string.infoC7), R.drawable.comandante_club));

        //Create a placeAdapter whose data source is a list of places.
        //The adapter knows how to create list items for each item in the list
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places, R.color.colorClubs);

        //Find the ListView object in the Activity hierarchy
        ListView listView = rootView.findViewById(R.id.list);

        //Make the listView use placeAdapter so that listView will display a list item for each
        //{@param places} in the list
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}