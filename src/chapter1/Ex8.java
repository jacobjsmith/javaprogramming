package chapter1;

public class Ex8 {

    public static void main(String[] args) {
        /*
        (Area and perimeter of a circle) Write a program that displays the area and perimeter
        of a circle that has a radius of 5.5 using the following formula:
        perimeter = 2 * radius * p
        area = radius * radius * p
         */

        double radius = 5.5;

        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;

        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }
}
