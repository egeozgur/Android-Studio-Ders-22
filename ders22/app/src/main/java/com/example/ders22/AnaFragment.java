package com.example.ders22;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class AnaFragment extends Fragment {



    public AnaFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ana, container, false);


        Button nergisbtn = view.findViewById(R.id.nergis_btn);
        nergisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.flayout, new gulFragment(),null).addToBackStack(null).commit();
            }
        });


        return view;


    }
}