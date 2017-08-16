package com.example.nitishsingh.android102;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Nitish Singh on 01-08-2017.
 */

public class ListFragment extends Fragment {
    //declaration
    private OnItemSelectedListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_frag, container, false);

        Button btn1 = (Button) view.findViewById(R.id.button);
        Button btn2 = (Button) view.findViewById(R.id.button2);
        Button btn3 = (Button) view.findViewById(R.id.button3);
        Button btn4 = (Button) view.findViewById(R.id.button4);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateDetail("layout1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateDetail("layout2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateDetail("layout3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateDetail("layout4");
            }
        });

        return view;
    }

    public interface OnItemSelectedListener {
        public void onRssItemSelected(String link);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnItemSelectedListener) {
            listener = (OnItemSelectedListener) context;
        } else {
            throw new ClassCastException(context.toString()
                    + " must implement MyListFragment.OnItemSelectedListener");
        }

    }

    public void updateDetail(String s) {
        listener.onRssItemSelected(s);
    }
}


