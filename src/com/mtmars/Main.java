package com.mtmars;

import com.mtmars.enums.Size;
import com.mtmars.garage.Garage;
import com.mtmars.vehicles.AbstractVehicle;
import com.mtmars.vehicles.Car;
import com.mtmars.vehicles.Motorcycle;
import com.mtmars.vehicles.Van;

public class Main {

    public static void main(String[] args) {

        Garage theGarage = new Garage(4);

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Van van = new Van();

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
