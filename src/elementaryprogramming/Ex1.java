package elementaryprogramming;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        /*
        (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
        a double value from the console, then converts it to Fahrenheit and displays the
        result.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9 / 5) * celsius + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
