package introtojava;

public class Ex6 {

    public static void main(String[] args) {

        /*
    (Summation of a series) Write a program that displays the result of
     1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
     */

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;
        for (int i =0; i<nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("Sum is " + sum);
    }
}
