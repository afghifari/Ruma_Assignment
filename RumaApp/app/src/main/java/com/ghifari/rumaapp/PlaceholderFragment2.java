package com.ghifari.rumaapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceholderFragment2 extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public PlaceholderFragment2() {
        // Required empty public constructor
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment2 newInstance2(int sectionNumber) {
        PlaceholderFragment2 fragment = new PlaceholderFragment2();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main2, container, false);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.textImage2);

        if (getArguments().getInt(ARG_SECTION_NUMBER) == 1)
            imageView.setImageResource(R.drawable.d);
        else if (getArguments().getInt(ARG_SECTION_NUMBER) == 2)
            imageView.setImageResource(R.drawable.e);

        return rootView;
    }

}
