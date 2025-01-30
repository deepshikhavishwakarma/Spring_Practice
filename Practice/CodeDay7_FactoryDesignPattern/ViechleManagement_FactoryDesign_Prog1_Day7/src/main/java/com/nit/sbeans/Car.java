package com.nit.sbeans;

import com.nit.sbeans.Interfaces.IEngine;
import com.nit.sbeans.Interfaces.IVehicle;

public class Car implements IVehicle {

    IEngine engine;
    int noOfDoors;

    public Car(IEngine engine, int noOfDoors) {
        this.engine = engine;
        this.noOfDoors = noOfDoors;
    }

    @Override
    public String getDescription() {

        return "Vehicle is car \nengine type "+engine.getEngineType()+"\nNo of Doors "+noOfDoors;
    }
}
