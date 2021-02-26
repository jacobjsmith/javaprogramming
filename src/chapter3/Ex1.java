package chapter3;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = (b * b) * (4 * a * c);

        double r1 = (-b + Math.sqrt(b * b) - (4 * a * c));
        double r2 = (-b - Math.sqrt(b * b) - (4 * a * c));

        if (discriminant > 0) {
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }
        else if (discriminant == 0) {
            System.out.println("The equation hs one root " + r1);
        }
        else {
            System.out.println("The equation has no real roots");
        }

    }
}
