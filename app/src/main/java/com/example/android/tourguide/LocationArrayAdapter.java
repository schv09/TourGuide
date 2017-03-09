package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Array Adapter for a Location object.
 */

public class LocationArrayAdapter extends ArrayAdapter<Location> {

    /**
     * Context of the app
     */
    private Context mCon;

    /**
     * Create a new {@link LocationArrayAdapter} object.
     *
     * @param context is the context of the app
     * @param locations is the array list of locations
     */
    public LocationArrayAdapter (Context context, ArrayList locations){
        super(context, 0, locations);
        mCon = context;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the required position
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the object located at this position in the list
        final Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the name from the current Location object and
        // set this text on the name TextView
        nameTextView.setText(currentLocation.getName());

        // Find the TextView in the list_item.xml layout with the ID description_text_view
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);

        // Get the description from the current Location object and
        // set this text on the description TextView
        descriptionTextView.setText(currentLocation.getDescription());

        // Find the TextView in the list_item.xml layout with the id price_range_text_view
        TextView priceRangeTextiew = (TextView) listItemView.findViewById(R.id.price_range_text_view);

        //Check if this location has a price range
        if (currentLocation.hasPriceRange()) {
            // Get the price range from the current Location object and
            // set this text on the price range TextView
            priceRangeTextiew.setText(currentLocation.getPriceRange());
            //set visibility back to VISIBLE
            priceRangeTextiew.setVisibility(View.VISIBLE);
        } else {
            //hide view
            priceRangeTextiew.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID url_text_view
        TextView urlTextView = (TextView) listItemView.findViewById(R.id.url_text_view);

        //Create an intent to open this webpage with any preferred browser
        urlTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = currentLocation.getUrl();
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(mCon.getPackageManager()) != null) {
                    mCon.startActivity(intent);
                }
            }
        });

        // Find the ImageView in the list_item.xml layout with the id image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Check if an image is provided for this location or not
        if (currentLocation.hasImage()) {
            // If an image is available, display the provided image based on the resource id
            imageView.setImageResource(currentLocation.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout so that it can be shown in the ListView
        return listItemView;
    }
}