package chapter2;

import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        /*
        (Cost of driving) Write a program that prompts the user to enter the distance to
        drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
        and displays the cost of the trip.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.println("Enter price per gallon");
        double pricePerGallon = input.nextDouble();

        double driving = (distance / milesPerGallon) * pricePerGallon;

        System.out.println("The cost of driving is " + driving);
    }
}
