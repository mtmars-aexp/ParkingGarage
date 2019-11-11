package com.mtmars.vehicles;

import com.mtmars.enums.Size;
import com.mtmars.interfaces.hasSize;

public abstract class AbstractVehicle implements hasSize {

    protected Size size;

    public Size getSize(){
        return size;
    }

}
