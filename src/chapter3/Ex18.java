package chapter3;

/*
(Cost of shipping) A shipping company uses the following function to calculate
the cost (in dollars) of shipping based on the weight of the package (in
pounds).
c(w) = d
3.5, if 0 6 w 6 = 1
5.5, if 1 6 w 6 = 3
8.5, if 3 6 w 6 = 10
10.5, if 10 6 w 6 = 20
Write a program that prompts the user to enter the weight of the package and
display the shipping cost. If the weight is greater than 50, display a message “the
package cannot be shipped.”
 */

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of the package: ");
        double weight = input.nextDouble();

    }
}
