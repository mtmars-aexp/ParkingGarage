package com.mtmars.garage;

import com.mtmars.enums.Size;
import com.mtmars.interfaces.hasSize;
import com.mtmars.vehicles.AbstractVehicle;

import java.util.Random;

public class Space implements hasSize {

    private Size size;
    private AbstractVehicle vehicle;

    public Space(){

        size = Size.values()[new Random().nextInt(Size.values().length)];

    }

    public Size getSize(){
        return size;
    }

    public void setVehicle(AbstractVehicle vehicle){
        this.vehicle = vehicle;
    }

    public Boolean isUnoccupied(){
        return vehicle == null;
    }

}
