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
public class bottomFragment2 extends Fragment {

    ImageView circleleft;
    ImageView circleright;

    public bottomFragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bottom2, container, false);
        circleleft  = (ImageView) rootView.findViewById(R.id.circleLeft2);
        circleright  = (ImageView) rootView.findViewById(R.id.circleRight2);

        // Inflate the layout for this fragment
        return rootView;
    }

    public void updateImage(int position) {
        if (position == 1) {
            circleleft.setImageResource(R.drawable.dot_green);
            circleright.setImageResource(R.drawable.dot_dark);
        } else if (position == 2) {
            circleleft.setImageResource(R.drawable.dot_dark);
            circleright.setImageResource(R.drawable.dot_green);
        } else {
            circleleft.setImageResource(0);
            circleright.setImageResource(0);
        }
    }
}
