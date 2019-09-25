package com.mydaggerapplication;

import dagger.Module;
import dagger.Provides;

@Module
public class EngineModule
{
    @Provides
    SparkPlug providesSparkPlug(){
        return (new SparkPlug());
    }

    @Provides
    Cylinder providesCylinder(){
        return (new Cylinder());
    }

    @Provides
    Engine providesEngine(SparkPlug sparkPlug, Cylinder cylinder){
        return new Engine(sparkPlug, cylinder);
    }
}
