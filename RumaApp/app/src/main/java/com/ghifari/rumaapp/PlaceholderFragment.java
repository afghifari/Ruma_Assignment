package com.ghifari.rumaapp;

/**
 * Created by Ghifari on 17/02/2017.
 */
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";


    public PlaceholderFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.textImage);
        int page = getArguments().getInt(ARG_SECTION_NUMBER);

        switch (page) {
            case 1 :
                imageView.setImageResource(R.drawable.a);
                break;
            case 2 :
                imageView.setImageResource(R.drawable.b);
                break;
            case 3 :
                imageView.setImageResource(R.drawable.c);
                break;
        }
        return rootView;
    }

}