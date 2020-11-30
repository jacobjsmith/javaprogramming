package elementaryprogramming;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subTotal * gratuityRate;
        double total = subTotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is " + total);
    }
}
