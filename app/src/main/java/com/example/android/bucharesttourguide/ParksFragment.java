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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.view_list, container, false);

        //Create an array list to store info about museums
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.titleP1), getString(R.string.infoP1), R.drawable.herastrau_park));
        places.add(new Place(getString(R.string.titleP2), getString(R.string.infoP2), R.drawable.kiseleff_park));
        places.add(new Place(getString(R.string.titleP3), getString(R.string.infoP3), R.drawable.youth_park));
        places.add(new Place(getString(R.string.titleP4), getString(R.string.infoP4), R.drawable.carol_park));
        places.add(new Place(getString(R.string.titleP5), getString(R.string.infoP5), R.drawable.cismigiu_park));
        places.add(new Place(getString(R.string.titleP6), getString(R.string.infoP6), R.drawable.ioanid_park));
        places.add(new Place(getString(R.string.titleP7), getString(R.string.infoP7), R.drawable.national_park));

        //Create a placeAdapter whose data source is a list of places.
        //The adapter knows how to create list items for each item in the list
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places, R.color.colorParks);

        //Find the ListView object in the Activity hierarchy
        ListView listView = rootView.findViewById(R.id.list);

        //Make the listView use placeAdapter so that listView will display a list item for each
        //{@param places} in the list
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}