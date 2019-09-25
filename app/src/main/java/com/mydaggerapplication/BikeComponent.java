package com.mydaggerapplication;

import dagger.Component;

@Component (modules = EngineModule.class)
public interface BikeComponent
{
    Bike getBike();

    void inject(MainActivity mainActivity);
}
