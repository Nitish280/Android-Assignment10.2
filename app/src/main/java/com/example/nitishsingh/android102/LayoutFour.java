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

public class LayoutFour extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout4,container,false);
        view.findViewById(R.id.textView8);
        textView=(TextView)view.findViewById(R.id.textView8);
        String string="BCCI general body to decide on Olympic participation:_\n" +
                "With the matter now being referred to the all-powerful BCCI general body," +
                " it seems unlikely that the Indian board will be interested to follow the Olympic charter.";
        textView.setText(string);
        return view;
    }
}
