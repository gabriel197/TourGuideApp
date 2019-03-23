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
public class GemsFragment extends Fragment {


    public GemsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.view_list, container, false);
        //Create an array list to store info about museums
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.titleG1), getString(R.string.infoG1)));
        places.add(new Place(getString(R.string.titleG2), getString(R.string.infoG2)));
        places.add(new Place(getString(R.string.titleG3), getString(R.string.infoG3)));
        places.add(new Place(getString(R.string.titleG4), getString(R.string.infoG4)));
        places.add(new Place(getString(R.string.titleG5), getString(R.string.infoG5)));
        places.add(new Place(getString(R.string.titleG6), getString(R.string.infoG6)));
        places.add(new Place(getString(R.string.titleG7), getString(R.string.infoG7)));

        //Create a placeAdapter whose data source is a list of places.
        //The adapter knows how to create list items for each item in the list
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places, R.color.colorGems);

        //Find the ListView object in the Activity hierarchy
        ListView listView = rootView.findViewById(R.id.list);

        //Make the listView use placeAdapter so that listView will display a list item for each
        //{@param places} in the list
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}