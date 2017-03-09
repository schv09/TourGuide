package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A fragment that shows a list of outdoor spots in the city of San Salvador,
 * El Salvador
 */
public class OutdoorsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate root view for fragment from list.xml layout file
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();

        //Add all Location objects to array list
        locations.add(new Location(getActivity().getString(R.string.boqueron),
                getActivity().getString(R.string.boqueron_type),
                getActivity().getString(R.string.boqueron_link), R.drawable.boqueron));
        locations.add(new Location(getActivity().getString(R.string.volcan_ss),
                getActivity().getString(R.string.volcan_ss_type),
                getActivity().getString(R.string.volcan_ss_link), R.drawable.volcanss));
        locations.add(new Location(getActivity().getString(R.string.jardin_botanico),
                getActivity().getString(R.string.jardin_botanico_type),
                getActivity().getString(R.string.jardin_botanico_link), R.drawable.jardinbotanico));
        locations.add(new Location(getActivity().getString(R.string.ilopango),
                getActivity().getString(R.string.ilopango_type),
                getActivity().getString(R.string.ilopango_link), R.drawable.ilopango));
        locations.add(new Location(getActivity().getString(R.string.bicentenario),
                getActivity().getString(R.string.bicentenario_type),
                getActivity().getString(R.string.bicentenario_link), R.drawable.bicentenario));
        locations.add(new Location(getActivity().getString(R.string.mirador),
                getActivity().getString(R.string.mirador_type),
                getActivity().getString(R.string.mirador_link), R.drawable.mirador));

        //Find list view inside root view
        ListView listView = (ListView) rootView.findViewById(R.id.category_list);

        //Create new instance of location array adapter
        LocationArrayAdapter locationArrayAdapter = new LocationArrayAdapter(getActivity(), locations);

        //Set previous location array adapter to work together with the list view
        listView.setAdapter(locationArrayAdapter);

        return rootView;
    }
}
