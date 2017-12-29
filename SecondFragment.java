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

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2,
                container, false);

        return view;
    }
}
