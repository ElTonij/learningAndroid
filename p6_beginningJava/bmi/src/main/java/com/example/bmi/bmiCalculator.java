package com.example.bmi;

public class bmiCalculator {
    public static void main(String[] args) {
        double BMIResult = calculateBMI(80,1.75);
        System.out.println("My BMI is: " + BMIResult);
        if(BMIResult > 25){
            System.out.println("You are overweight!");
        } else if (BMIResult >= 18.5 && BMIResult <= 25){
            System.out.println("You are of normal weight");
        } else {
            System.out.println("You are underweight!");
        }
    }

    public static double calculateBMI (double mass, double height){
      double BMIResult = mass/(height*height);
      return BMIResult;
    }

}
