package com.mtmars.garage;

import com.mtmars.enums.Size;

public class Vehicle implements hasSize {

    private Size size;

    public Vehicle(Size size){
        this.size = size;
    }

    public Size getSize(){
        return size;
    }

}
