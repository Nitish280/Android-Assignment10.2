package com.example.nitishsingh.android102;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ListFragment.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onRssItemSelected(String link){
        //here we are creating object of fragment manager
        FragmentManager fragmentManager = getFragmentManager();
        //here we are craeting object of fragment transaction
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        LayoutOne layout1; // Fragment 1
        LayoutTwo layout2; // Fragment 2
        LayoutThree layout3; // Fragment 3
        LayoutFour layout4; // Fragment 4
        //here we are apllying condition for linking the layout with frame layout
        if (link.equals("layout1")) {
            layout1 = new LayoutOne();
            fragmentTransaction.replace(R.id.fragment_container,layout1 );
            fragmentTransaction.commit();
        } else if (link.equals("layout2")) {
            layout2 = new LayoutTwo();
            fragmentTransaction.replace(R.id.fragment_container, layout2);
            fragmentTransaction.commit();
        } else if (link.equals("layout3")) {
            layout3 = new LayoutThree();
            fragmentTransaction.replace(R.id.fragment_container, layout3);
            fragmentTransaction.commit();
        } else if (link.equals("layout4")) {
            layout4 = new LayoutFour();
            fragmentTransaction.replace(R.id.fragment_container, layout4);
            fragmentTransaction.commit();
        }
    }
}

