package introtojava;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        /*
        (Convert feet into meters) Write a program that reads a number in feet, converts it
        to meters, and displays the result. One foot is 0.305 meter
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value for feet: ");
        double feet = input.nextDouble();

        double METERS_PER_FOOT = feet * 0.305;

        System.out.println(feet + " feet is " + METERS_PER_FOOT + " meters.");


    }
}
