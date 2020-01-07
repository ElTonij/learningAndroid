package com.example.javapractice;

public class MyClass {
    public static void main(String[] args) {

        int change = getMilk(2, 40);
        getMilk(2,10);
        System.out.println("Change is: " + change + " pounds!");


        /*        System.out.println("Hello World!");
        int myCash;
        myCash = 100;
        int monthlySalary = 20;

        String mainCourse = "Fish";
        String side = "Chips";

        System.out.println("My favoursite food is: " + mainCourse + " " + side);
        System.out.println("Payday. Got " + (myCash + monthlySalary));*/
    }

//    public static void getMilk(){
//        System.out.println("Open door");
//        System.out.println("Walk to store");
//        System.out.println("Buy Milk");
//    }

//    public static void getMilk(int nrOfCartonsToBuy){
//        int priceToPay = nrOfCartonsToBuy*2;
//
//        System.out.println("Open door");
//        System.out.println("Walk to store");
//        System.out.println("Buy " + nrOfCartonsToBuy + " Milk");
//        System.out.println("It costed " + priceToPay + " $");
//    }

        public static int getMilk(int nrOfCartonsToBuy, int startingAmount){
        int priceToPay = nrOfCartonsToBuy*2;

        System.out.println("Open door");
        System.out.println("Walk to store");
        System.out.println("Buy " + nrOfCartonsToBuy + " Milk");
        System.out.println("It costed " + priceToPay + " $");

        return startingAmount - priceToPay;
    }

}
