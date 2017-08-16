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

public class LayoutOne extends Fragment {
    TextView txtview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout1,container,false);
        view.findViewById(R.id.textView5);
        txtview=(TextView)view.findViewById(R.id.textView5);
        String  string="SC to hear Ayodhya land dispute matter today:-" +
                "In a major development, the Shia Waqf Board filed an affidavit before the apex court, " +
                "in which it stated that a mosque can be constructed at a place near birth place of Lord Ram.";
        txtview.setText(string);
        return view;
    }
}
