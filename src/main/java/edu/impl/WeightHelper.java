package edu.impl;
import java.util.Scanner;

public class WeightHelper {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // weight also can be in double. i.e. 80.5 kg
        double weight;
        double height;
        System.out.println("This is a metric BMI calculator.");
        System.out.println("Please enter your weight in kilograms:");
        // Getting weight also in double.

           weight = sc.nextDouble();
           if (weight == 0) {
               System.out.println("Please enter correct weight , It should be greater than 0 :");
               System.out.println("Please enter your weight in kilograms:");
               // Getting weight also in double.
               weight = sc.nextDouble();

           }

        System.out.println("Please enter your height in meters:");
        height = sc.nextDouble();

        if(height == 0){
            System.out.println("Please enter correct height , It should be greater than 0 :");
            System.out.println("Please enter your height in meters:");
            height = sc.nextDouble();

        }
        sc.close();

        // We have created object of class here. We are avoiding static methods here.
        WeightHelper weightHelper = new WeightHelper();
        double bmi = weightHelper.calculateBMI(weight, height);
        System.out.println("Your BMI:"+bmi);
        System.out.println("You are :" + weightHelper.getBMICategory(bmi));

    }

    public   String getBMICategory(double bmi) {
        if(bmi<18.5)
        {
            return "Underweight";
        }
        else if(bmi>=18.5 && bmi<=25)
        {
            return "Normal";
        }
        else if(bmi>=25.1 && bmi<=29.9)
        {
            return "Overweight";
        }
        else if(bmi>=30.0)
        {
           return "Obese";
        }
        return null;
    }

    public  double calculateBMI(double weight, double height) {
        double bmi = weight/(height*height);
        System.out.println("Entered weight:"+weight);
        System.out.println("Entered height:"+height);
        return bmi;
    }
}