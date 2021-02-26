package chapter2;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        /*
        (Financial application: calculate tips) Write a program that reads the subtotal
        and the gratuity rate, then computes the gratuity and total. For example, if the
        user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
        as gratuity and $11.5 as total
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subTotal * gratuityRate;
        double total = subTotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is " + total);
    }
}
