package com.mydaggerapplication;

import javax.inject.Inject;

public class Bike
{
    private static final String TAG = "Bike";
    @Inject Engine engine;
    private Wheels wheels;

    @Inject
    public Bike( Wheels wheels){
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
    public void Drive(){

    }
}
