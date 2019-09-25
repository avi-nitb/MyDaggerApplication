package com.mydaggerapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity
{
    @Inject  Bike bike;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BikeComponent bikeComponent = DaggerBikeComponent.create();
        bikeComponent.inject(this);
        bike = bikeComponent.getBike();
        bike.Drive();
    }
}
