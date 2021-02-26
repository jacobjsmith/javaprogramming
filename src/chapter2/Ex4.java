package chapter2;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        /*
        (Convert pounds into kilograms) Write a program that converts pounds into kilograms.
        The program prompts the user to enter a number in pounds, converts it
        to kilograms, and displays the result. One pound is 0.454 kilograms.
         */

        Scanner input = new Scanner(System.in);

        final double KILOGRAMS_PER_POUND = .454;

        System.out.println("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double POUNDS_TO_KILOGRAMS = pounds * KILOGRAMS_PER_POUND;

        System.out.println(pounds + " pounds is " + POUNDS_TO_KILOGRAMS + " kilograms");


    }
}
