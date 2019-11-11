package com.mtmars;

import com.mtmars.enums.Size;
import com.mtmars.garage.Garage;
import com.mtmars.garage.Vehicle;

public class Main {

    public static void main(String[] args) {

        Garage theGarage = new Garage(4);

        Vehicle motorcycle = new Vehicle(Size.SMALL);
        Vehicle car = new Vehicle(Size.MEDIUM);
        Vehicle van = new Vehicle(Size.LARGE);

        for(int i = 0; i != theGarage.getNumberOfFloors(); i++){
            theGarage.printSpacesBySizeCount(i);
        }

        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);
        theGarage.addVehicle(van);

    }
}
