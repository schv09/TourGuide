package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass. It shows a list of malls in the city of San Salvador,
 * El Salvador
 */
public class ShoppingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate root view for fragment from list.xml layout file
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();

        //Add all Location objects to array list
        locations.add(new Location(getActivity().getString(R.string.gran_via),
                getActivity().getString(R.string.gran_via_type),
                getActivity().getString(R.string.gran_via_price),
                getActivity().getString(R.string.gran_via_link)));
        locations.add(new Location(getActivity().getString(R.string.multiplaza),
                getActivity().getString(R.string.multiplaza_type),
                getActivity().getString(R.string.multiplaza_price),
                getActivity().getString(R.string.multiplaza_link)));
        locations.add(new Location(getActivity().getString(R.string.plaza_merliot),
                getActivity().getString(R.string.plaza_merliot_type),
                getActivity().getString(R.string.plaza_merliot_price),
                getActivity().getString(R.string.plaza_merliot_link)));
        locations.add(new Location(getActivity().getString(R.string.galerias),
                getActivity().getString(R.string.galerias_type),
                getActivity().getString(R.string.galerias_price),
                getActivity().getString(R.string.galerias_link)));
        locations.add(new Location(getActivity().getString(R.string.metro),
                getActivity().getString(R.string.metro_type),
                getActivity().getString(R.string.metro_price),
                getActivity().getString(R.string.metro_link)));
        locations.add(new Location(getActivity().getString(R.string.cascadas),
                getActivity().getString(R.string.cascadas_type),
                getActivity().getString(R.string.cascadas_price),
                getActivity().getString(R.string.cascadas_link)));
        locations.add(new Location(getActivity().getString(R.string.paseo),
                getActivity().getString(R.string.paseo_type),
                getActivity().getString(R.string.paseo_price),
                getActivity().getString(R.string.paseo_link)));
        locations.add(new Location(getActivity().getString(R.string.artesanias),
                getActivity().getString(R.string.artesanias_type),
                getActivity().getString(R.string.artesanias_price),
                getActivity().getString(R.string.artesanias_link)));

        //Find list view inside root view
        ListView listView = (ListView) rootView.findViewById(R.id.category_list);

        //Create new instance of location array adapter
        LocationArrayAdapter locationArrayAdapter = new LocationArrayAdapter(getActivity(), locations);

        //Set previous location array adapter to work together with the list view
        listView.setAdapter(locationArrayAdapter);

        return rootView;
    }
}
