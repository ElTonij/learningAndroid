package com.example.javapractice;

public class CarSimulator {
    public static void main(String[] args) {

        System.out.println("Car simulator");

        Car myToyota = new Car("Red", "Wood");
        Car myHonda = new Car();

        SelfDrivingCar autoBot = new SelfDrivingCar("Yellow", "Plastic");
        autoBot.drive();
        System.out.println("autoBot is " + autoBot.colour + " and " + autoBot.mInterior);

    }
}
