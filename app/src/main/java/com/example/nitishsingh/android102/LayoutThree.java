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

public class LayoutThree extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.layout3,container,false);
        view.findViewById(R.id.textView7);
        textView=(TextView)view.findViewById(R.id.textView7);
        String string="Economic Survey says achieving 7.5% GDP growth difficult:-\n" +
                "The government presented a second or a mid-year economic survey for the year 2017-18 " +
                "highlighting the new factors that the economy faces since the last such exercise in February.";
        textView.setText(string);
        return view;

    }
}
