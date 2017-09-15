package com.zackeryrobinson.week3test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String CAR_FRAGMENT_TAG = "CarFragment_Tag";
    private static final String CAR_LIST_FRAGMENT_TAG = "CarFragment_Tag";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarFragment cf = CarFragment.newInstance(1);
        getSupportFragmentManager().beginTransaction().add(R.id.flFragmentHolderCar, cf, CAR_FRAGMENT_TAG).commit();

        //Change cf to list somehow
        getSupportFragmentManager().beginTransaction().add(R.id.flFragmentHolderCarList, cf, CAR_LIST_FRAGMENT_TAG).commit();
    }




}
