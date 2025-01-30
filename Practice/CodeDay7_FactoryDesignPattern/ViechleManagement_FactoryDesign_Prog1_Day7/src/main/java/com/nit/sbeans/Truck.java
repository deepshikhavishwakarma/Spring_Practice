package com.nit.sbeans;

import com.nit.sbeans.Interfaces.IEngine;
import com.nit.sbeans.Interfaces.IVehicle;

public class Truck implements IVehicle {
    IEngine engine;
    private String payLoadCapacity;

    public Truck(IEngine engine, String payLoadCapacity) {
        this.engine = engine;
        this.payLoadCapacity = payLoadCapacity;
    }

    @Override
    public String getDescription() {
        return "Vehicle type Truck \nengine type: "+engine.getEngineType()+"\nPay Load capacity "+payLoadCapacity;
    }
}
