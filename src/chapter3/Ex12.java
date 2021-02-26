package chapter3;

import java.util.Scanner;

/*
(Palindrome number) Write a program that prompts the user to enter a three-digit
integer and determines whether it is a palindrome number. A number is palindrome
if it reads the same from right to left and from left to right. Here is a sample
run of this program:
 */
public class Ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three digit number: ");

        String num = input.next();

        char num1 = num.charAt(0);
        char num2 = num.charAt(2);

        if (num1 == num2) {
            System.out.println("The number is a palindrome");
        }
        else {
            System.out.println("The number is not a palindrome");
        }
    }
}
