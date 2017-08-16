package com.example.nitishsingh.android102;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Nitish Singh on 01-08-2017.
 */

public class LayoutTwo extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout2,container,false);
        view.findViewById(R.id.textView6);
        textView=(TextView)view.findViewById(R.id.textView6);
        String string="My ministry has to train a crore people in the next 2.5 years, says Skill Development Minister Rajiv Rudy:-\n" +
                "In an exclusive interview with India Today," +
                " Skill Development Minister Rajiv Pratap Rudy highlighted the challenges his ministry is facing. " +
                "Rudy said he is ready for the challenge. ";
        textView.setText(string);
        return view;
    }
}
