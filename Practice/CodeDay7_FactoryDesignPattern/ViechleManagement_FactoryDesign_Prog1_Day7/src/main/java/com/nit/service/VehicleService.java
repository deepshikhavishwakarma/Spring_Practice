package com.nit.service;

import com.nit.sbeans.Interfaces.IVehicle;
import com.nit.sbeans.Interfaces.IVehicleFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    @Autowired
    IVehicleFactory vehicleFactory;


    public void displayVehicle(){
        IVehicle vehicle = vehicleFactory.createVehicle("car","diesel");
        System.out.println(vehicle.getDescription());
    }

}
