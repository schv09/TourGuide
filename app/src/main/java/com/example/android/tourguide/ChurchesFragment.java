package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A fragment that shows a list of churches or cathedrals in the city of
 * San Salvador, El Salvador
 */
public class ChurchesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate root view for fragment from list.xml layout file
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();

        //Add all Location objects to array list
        locations.add(new Location(getActivity().getString(R.string.rosario),
                getActivity().getString(R.string.rosario_type),
                getActivity().getString(R.string.rosario_link)));
        locations.add(new Location(getActivity().getString(R.string.metropolitana),
                getActivity().getString(R.string.metropolitana_type),
                getActivity().getString(R.string.metropolitana_link)));
        locations.add(new Location(getActivity().getString(R.string.divina_providencia),
                getActivity().getString(R.string.divina_providencia_type),
                getActivity().getString(R.string.divina_providencia_link)));
        locations.add(new Location(getActivity().getString(R.string.calvario),
                getActivity().getString(R.string.calvario_type),
                getActivity().getString(R.string.calvario_link)));
        locations.add(new Location(getActivity().getString(R.string.guadalupe),
                getActivity().getString(R.string.guadalupe_type),
                getActivity().getString(R.string.guadalupe_link)));
        locations.add(new Location(getActivity().getString(R.string.sagrado_corazon),
                getActivity().getString(R.string.sagrado_corazon_type),
                getActivity().getString(R.string.sagrado_corazon_link)));

        //Find list view inside root view
        ListView listView = (ListView) rootView.findViewById(R.id.category_list);

        //Create new instance of location array adapter
        LocationArrayAdapter locationArrayAdapter = new LocationArrayAdapter(getActivity(), locations);

        //Set previous location array adapter to work together with the list view
        listView.setAdapter(locationArrayAdapter);

        return rootView;
    }
}
