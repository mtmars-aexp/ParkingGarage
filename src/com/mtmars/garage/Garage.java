package com.mtmars.garage;

import com.mtmars.enums.Size;

import java.util.ArrayList;

public class Garage {

    private int numberOfFloors;
    private ArrayList<Floor> floors = new ArrayList<>();

    public Garage(int numberOfFloors){
        this.numberOfFloors = numberOfFloors;

        for(int i = 0; i != numberOfFloors; i++){
            floors.add(new Floor());
        }
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public ArrayList<Floor> getFloors(){
        return floors;
    }

    public void addVehicle(Vehicle vehicle){

        Boolean spaceFound = false;

        floorLoop:
        for(int x = 0; x != numberOfFloors; x++){
            for(int y = 0; y != floors.get(x).getSpaces().size(); y++){

                Space currentSpace = floors.get(x).getSpaces().get(y);

                if(floors.get(x).getSpaces().get(y).getSize().ordinal() >= vehicle.getSize().ordinal() && currentSpace.isUnoccupied()) {
                    floors.get(x).getSpaces().get(y).setVehicle(vehicle);
                    System.out.println(vehicle.getSize() + " Vehicle parked at floor " + x + " space " + y);
                    spaceFound = true;
                    break floorLoop;
                }
            }
        }

        if(!spaceFound) {
            System.out.println("No room available for " + vehicle.getSize() + " vehicles.");
        }
    }

    public void printSpacesBySizeCount(int floorNumber){
        Floor currentFloor = floors.get(floorNumber);
        int smallCount = 0;
        int mediumCount = 0;
        int largeCount = 0;

        for(int i = 0; i != currentFloor.getNumberOfSpaces(); i++){

            if(currentFloor.getSpaces().get(i).getSize() == Size.SMALL){
                smallCount ++;
            } else if (currentFloor.getSpaces().get(i).getSize() == Size.MEDIUM){
                mediumCount ++;
            } else if (currentFloor.getSpaces().get(i).getSize() == Size.LARGE) {
                largeCount++;
            }
        }

        System.out.println("Floor: " + floorNumber);
        System.out.println("Total spaces: " + currentFloor.getNumberOfSpaces());
        System.out.println("Small spaces: " + smallCount);
        System.out.println("Medium spaces: " + mediumCount);
        System.out.println("Large spaces: " + largeCount);
    }

}
