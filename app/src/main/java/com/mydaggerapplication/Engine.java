package com.mydaggerapplication;

import javax.inject.Inject;

public class Engine
{
    private SparkPlug sparkPlug;
    private Cylinder cylinder;

    public Engine(SparkPlug sparkPlug, Cylinder cylinder){
        this.sparkPlug = sparkPlug;
        this.cylinder = cylinder;
        }
}
