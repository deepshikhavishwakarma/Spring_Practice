package com.nit.sbeans;

import com.nit.sbeans.Interfaces.IEngine;
import com.nit.sbeans.Interfaces.IVehicle;
import com.nit.sbeans.Interfaces.IVehicleFactory;
import org.springframework.stereotype.Component;

@Component
public class ConcreteVehicleFactory implements IVehicleFactory {


    @Override
    public IVehicle createVehicle(String type, String engineType) {
    IVehicle iVehicle=null;
    IEngine engine = null;
     if(type.equalsIgnoreCase("car") && (engineType.equalsIgnoreCase("electric"))){
         engine = new ElectricEngine();
         iVehicle = new Car(engine,4);
     } else if (type.equalsIgnoreCase("car") && (engineType.equalsIgnoreCase("diesel"))) {
         engine = new DieselEngine();
         iVehicle = new Car(engine,4);
     } else if(type.equalsIgnoreCase("truck")&&(engineType.equalsIgnoreCase("electric"))){
         engine = new ElectricEngine();
         iVehicle = new Truck(engine,"20");
     }else if(type.equalsIgnoreCase("truck")&&(engineType.equalsIgnoreCase("diesel"))){
         engine = new DieselEngine();
         iVehicle = new Truck(engine,"40");
     }else if(type.equalsIgnoreCase("Motorcycle") &&(engineType.equalsIgnoreCase("electric"))){
        engine = new ElectricEngine();
         iVehicle = new Motorcycle(engine,true);
     }else if(type.equalsIgnoreCase("Motorcycle") &&(engineType.equalsIgnoreCase("diesel"))){
         engine = new ElectricEngine();
         iVehicle = new Motorcycle(engine,true);
     }
        return iVehicle;
    }
}
