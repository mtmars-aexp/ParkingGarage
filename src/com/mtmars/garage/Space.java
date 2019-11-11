package com.mtmars.garage;

import com.mtmars.enums.Size;

import java.util.Random;

public class Space implements hasSize {

    private Size size;
    private Vehicle vehicle;

    public Space(){

        size = Size.values()[new Random().nextInt(Size.values().length)];

    }

    public Size getSize(){
        return size;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public Boolean isUnoccupied(){
        return vehicle == null;
    }

}
