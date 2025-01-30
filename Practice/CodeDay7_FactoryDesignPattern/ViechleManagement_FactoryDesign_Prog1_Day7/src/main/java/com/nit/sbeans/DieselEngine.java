package com.nit.sbeans;

import com.nit.sbeans.Interfaces.IEngine;

public class DieselEngine implements IEngine {
    @Override
    public String getEngineType() {
        return "Diesel";
    }
}
