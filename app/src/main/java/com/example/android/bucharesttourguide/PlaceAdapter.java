package com.example.android.bucharesttourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


//PlaceAdapter is an ArrayAdapter that can provide the layout for each list item  based on a
//data source, in our case, a list of Place objects
public class PlaceAdapter extends ArrayAdapter<Place> {
    //Store the color resource id of a given place
    private int mColorResourceId;


    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if a view is being reused, if not, inflate it
        if (convertView == null)  {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list,
                    parent, false);
        }

        //Get the given place at the current position
        Place currentPlace = getItem(position);

        //Find the TextView in the item_list.xml
        TextView placeName = convertView.findViewById(R.id.place_name);

        //Get the current name from ArrayList and set it on TextView
        placeName.setText(currentPlace.getPlaceName());

        TextView placeDetail = convertView.findViewById(R.id.place_details);
        placeDetail.setText(currentPlace.getPlaceInfo());

        //Find the ImageView in the item_list.xml
        ImageView imageView = convertView.findViewById(R.id.image_i_need);

        //Check if the current place has a image ID input and set it
        if (currentPlace.hasImage()) {
        imageView.setImageResource(currentPlace.getPictureId());
        //Make sure it is visible
        imageView.setVisibility(View.VISIBLE);
        } else {
            //If not, make the image GONE
            imageView.setVisibility(View.GONE);
        }

        //Find the root View and set background color on it
        View rootView = convertView.findViewById(R.id.rootView);

        //Find the background color id and set it on rootView
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        rootView.setBackgroundColor(color);

        //Return the list_item so it can be used in ListView
        return convertView;
    }
}