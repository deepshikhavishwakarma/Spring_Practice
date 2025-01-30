package com.nit.sbeans;

import com.nit.sbeans.Interfaces.IEngine;
import com.nit.sbeans.Interfaces.IVehicle;

public class Motorcycle implements IVehicle {
    private IEngine engine;
    private boolean sideCar;

    public Motorcycle(IEngine engine, boolean sideCar) {
        this.engine = engine;
        this.sideCar = sideCar;
    }

    @Override
    public String getDescription() {
        return "Viche is MotorCycle\n"+engine.getEngineType()+" \nSide Car "+sideCar;
    }
}
