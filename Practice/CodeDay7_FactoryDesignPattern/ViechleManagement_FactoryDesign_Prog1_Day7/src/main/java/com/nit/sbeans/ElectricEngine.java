package com.nit.sbeans;

import com.nit.sbeans.Interfaces.IEngine;

public class ElectricEngine implements IEngine {
    @Override
    public String getEngineType() {
        return "Electric";
    }
}
