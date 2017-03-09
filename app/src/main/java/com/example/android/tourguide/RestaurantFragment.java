package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A fragment that shows a list of restaurants in the city of San Salvador,
 * El Salvador
 */
public class RestaurantFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate root view for fragment from list.xml layout file
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();

        //Add all Location objects to array list
        locations.add(new Location(getActivity().getString(R.string.faisca),
                getActivity().getString(R.string.faisca_type),
                getActivity().getString(R.string.faisca_price),
                getActivity().getString(R.string.faisca_link)));
        locations.add(new Location(getActivity().getString(R.string.pampa),
                getActivity().getString(R.string.pampa_type),
                getActivity().getString(R.string.pampa_price),
                getActivity().getString(R.string.pampa_link)));
        locations.add(new Location(getActivity().getString(R.string.la_hola),
                getActivity().getString(R.string.la_hola_type),
                getActivity().getString(R.string.la_hola_price),
                getActivity().getString(R.string.la_hola_link)));
        locations.add(new Location(getActivity().getString(R.string.koi),
                getActivity().getString(R.string.koi_type),
                getActivity().getString(R.string.koi_price),
                getActivity().getString(R.string.koi_link)));
        locations.add(new Location(getActivity().getString(R.string.laca_laca),
                getActivity().getString(R.string.laca_laca_type),
                getActivity().getString(R.string.laca_laca_price),
                getActivity().getString(R.string.laca_laca_link)));
        locations.add(new Location(getActivity().getString(R.string.margoth),
                getActivity().getString(R.string.margoth_type),
                getActivity().getString(R.string.margoth_price),
                getActivity().getString(R.string.margoth_link)));
        locations.add(new Location(getActivity().getString(R.string.donde_leo),
                getActivity().getString(R.string.donde_leo_type),
                getActivity().getString(R.string.donde_leo_price),
                getActivity().getString(R.string.donde_leo_link)));
        locations.add(new Location(getActivity().getString(R.string.picasso),
                getActivity().getString(R.string.picasso_type),
                getActivity().getString(R.string.picasso_price),
                getActivity().getString(R.string.picasso_link)));

        //Find list view inside root view
        ListView listView = (ListView) rootView.findViewById(R.id.category_list);

        //Create new instance of location array adapter
        LocationArrayAdapter locationArrayAdapter = new LocationArrayAdapter(getActivity(), locations);

        //Set previous location array adapter to work together with the list view
        listView.setAdapter(locationArrayAdapter);

        return rootView;
    }
}
