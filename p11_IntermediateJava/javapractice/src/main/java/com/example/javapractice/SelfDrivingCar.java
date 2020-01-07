package com.example.javapractice;

public class SelfDrivingCar extends Car {

    public SelfDrivingCar(String chosenColour, String chosenInterior) {
        super(chosenColour, chosenInterior);
        System.out.println("Constructing self-driving car!..");
    }

    @Override
    public void drive(){
        System.out.println("Driving to Google");

    }


}
