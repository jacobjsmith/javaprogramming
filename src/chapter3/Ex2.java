package chapter3;

import java.util.Scanner;

public class Ex2 {

    /*
    (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
    two integers and prompts the user to enter the sum of these two integers.
    Revise the program to generate three single-digit integers and prompt the user to
    enter the sum of these three integers.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int num3 = (int) (Math.random() * 10);

        int answer = num1 + num2 + num3;

        System.out.println("What is the sum of " + num1 + " + " + num2 + " + " + num3 + " ?");
        int guess = input.nextInt();

        if (guess == answer) {
            System.out.println("You entered:" + guess + ". Your answer is correct.");
        }
        else {
            System.out.println("You entered: " + guess + ". Your answer is incorrect.");
        }




    }
}
