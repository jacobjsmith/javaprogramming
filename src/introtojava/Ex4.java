package introtojava;

public class Ex4 {

    /*
    (Print a table) Write a program that displays the following table:
     */

    public static void main(String[] args) {

        System.out.println("a" + "        " + "a^2" + "        " + "a^3");

        for (int a = 1; a <=4 ; a++) {
            System.out.println(a + "        " + (int)Math.pow(a,2) + "          " + (int)Math.pow(a,3));
        }
    }
}
