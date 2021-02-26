package chapter2;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        /*
        (Health application: computing BMI) Body Mass Index (BMI) is a measure of
        health on weight. It can be calculated by taking your weight in kilograms and
        dividing by the square of your height in meters. Write a program that prompts the
        user to enter a weight in pounds and height in inches and displays the BMI. Note
        that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
         */
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double inches = input.nextDouble();

        double WEIGHT_IN_KILOGRAMS = pounds * KILOGRAMS_PER_POUND;
        double INCHES_IN_METERS = inches * METERS_PER_INCH;

        double bmi = (WEIGHT_IN_KILOGRAMS) / (Math.pow(INCHES_IN_METERS, 2));

        System.out.println("The BMI is " + bmi);
    }
}
