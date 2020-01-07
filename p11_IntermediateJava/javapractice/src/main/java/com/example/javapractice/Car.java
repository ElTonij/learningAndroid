package com.example.javapractice;

public class Car {
    //Variables
    public String colour = "Black";
    private int mNumberSeats = 5;
    protected String mInterior;

    //Constructors
    public Car() {
        //info
        mInterior = "Leather";
    }
    public Car(String chosenColour, String chosenInterior) {
        colour = chosenColour;
        mInterior = chosenInterior;
        //info
    }

    //Methods
    public int getNumberSeats() {
        //add code here
        return mNumberSeats;
    }
    public String getInterior() {
        return mInterior;
    }
    public void drive(){
        System.out.println("Car is moving");
    }
}
