package chapter2;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        /*
        Write a program that prompts the user to enter a monthly saving amount and
        displays the account value after the sixth month.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();

        double monthlyInterestRate = (1 + 0.00417);
        double accountValue = 0;
        for (int i = 0; i < 6; i++) {
            accountValue = ((savingAmount + accountValue) * (monthlyInterestRate));
        }

        System.out.println("After the sixth month, the value is $" + accountValue);
    }
}
