package elementaryprogramming;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        /*
        (Compute the volume of a cylinder) Write a program that reads in the radius
        and length of a cylinder and computes the area and volume
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius and the length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }
}
