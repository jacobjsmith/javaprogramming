package elementaryprogramming;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        /*
        (Sum the digits in an integer) Write a program that reads an integer between 0 and
        1000 and adds all the digits in the integer. For example, if an integer is 932, the
        sum of all its digits is 14.
        Hint: Use the % operator to extract digits, and use the / operator to remove the
        extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int num = input.nextInt();

        int remainNum = num % 10;
        int num1 = num / 10;
        int remainNum1 = num1 % 10;
        int remainNum2 = num1 / 10;

        int sum = remainNum + remainNum1 + remainNum2;
        System.out.println("The sum of the digits is " + sum);

    }
}
