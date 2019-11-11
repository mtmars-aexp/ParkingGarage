package com.mtmars.garage;

import java.util.ArrayList;
import java.util.Random;

public class Floor {

    private int length = new Random().nextInt(10) + 1;
    private int width = new Random().nextInt(10) + 1;

    private int numberOfSpaces = length * width;
    private ArrayList<Space> spaces = new ArrayList<>();

    public Floor(){

        for(int i = 0; i != numberOfSpaces; i++){
            spaces.add(new Space());
        }

    }

    public ArrayList<Space> getSpaces(){
        return spaces;
    }

    public int getNumberOfSpaces(){
        return numberOfSpaces;
    }

}
