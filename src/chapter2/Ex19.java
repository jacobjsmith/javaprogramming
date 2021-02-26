package chapter2;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        /*
        (Geometry: area of a triangle) Write a program that prompts the user to enter
        three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
    }
}
