package com.example.android.bucharesttourguide;

public class Place {

    //Create a string to store the place's name
    private String mPlaceName;

    //Create a string to store information about current place
    private String mPlaceInfo;

    //Store the id of a picture
    private int mPictureId = NO_IMAGE_POVIDED;

    private static final int NO_IMAGE_POVIDED = -1;



    /**Create a new Place object
     *
     * @param placeName is the name of attraction
     * @param placeInfo is the description of the place
     * @param pictureId is the ID of drawable picture
     */
    public Place(String placeName, String placeInfo, int pictureId) {
        mPlaceName = placeName;
        mPlaceInfo = placeInfo;
        mPictureId = pictureId;
    }

    /**Create a new Place object without the image input
     *
     * @param placeName is the name of attraction
     * @param placeInfo is the description of the place
     */
    public Place(String placeName, String placeInfo) {
        mPlaceName = placeName;
        mPlaceInfo = placeInfo;
    }

    //Get the name of the place and store it in mPlaceName
    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceInfo() {
        return mPlaceInfo;
    }

    //Check if the items of list require a image
    public boolean hasImage() {
        return mPictureId != NO_IMAGE_POVIDED; }

    public int getPictureId() {
        return mPictureId;
    }
}