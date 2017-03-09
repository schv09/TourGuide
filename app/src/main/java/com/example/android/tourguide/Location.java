package com.example.android.tourguide;

/**
 * This class represents a location.
 */

public class Location {

    /**
     * This location's name.
     */
    private String name;

    /**
     * This location's description if applicable.
     */
    private String description;

    /**
     * This location's price range if applicable.
     */
    private String priceRange;

    /**
     * A link to the official website, Facebook page or to other similar website with
     * information for this location.
     */
    private String url;

    /**
     * This location's image resource id if applicable
     */
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Public constructor for a Location which has a name, description, price range and url.
     * @param name the name for the location
     * @param description description for the location
     * @param url a url leading to an informative website
     * @param imageResourceId an image representing this location
     */
    public Location(String name, String description, String url, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.url = url;
        this.imageResourceId = imageResourceId;
    }

    /**
     * Public constructor for a Location which has a name, price range and url.
     * @param name the name for the location
     * @param description a small description
     * @param priceRange price range for the location
     * @param url a url leading to an informative website
     */
    public Location(String name, String description, String priceRange, String url) {
        this.name = name;
        this.description = description;
        this.priceRange = priceRange;
        this.url = url;
    }

    /**
     * Public constructor for a Location which has a name, description, price range and url.
     * @param name the name for the location
     * @param description price range for the location
     * @param url a url leading to an informative website
     */
    public Location(String name, String description, String url) {
        this.name = name;
        this.description = description;
        this.url = url;
    }

    /**
     * Gets the name for this location.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the description for this location.
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the price range for this location.
     * @return the price range
     */
    public String getPriceRange() {
        return priceRange;
    }

    /**
     * Gets the url for this location.
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Gets the image resource id for this location.
     * @return the image resource id
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * Checks if this location has a price range
     */
    public boolean hasPriceRange() {
        return priceRange!=null;
    }

    /**
     * Checks if this location has an image
     */
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}