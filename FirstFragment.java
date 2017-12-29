package com.example.hp.myapplicationfr;

/**
 * Created by HP on 29-Dec-17.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kvaib on 29-12-2017.
 */

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_1,
                container, false);
        return view;
    }

}

