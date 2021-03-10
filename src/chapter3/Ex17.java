package chapter3;

/*
(Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper
game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws.
 */

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int computer = (int) (Math.random() * 2);

        System.out.println("Enter a number 0(scissor), 1(rock), or 2(paper): ");
        int myPerson = input.nextInt();

        switch (myPerson) {
            case 0: System.out.println("You are scissor");break;
            case 1: System.out.println("You are rock");break;
            case 2: System.out.println("You are paper"); break;
        }

        switch (computer) {
            case 0: System.out.println("Computer is scissor");break;
            case 1: System.out.println("Computer is rock");break;
            case 2: System.out.println("Computer is paper"); break;
        }

        if (computer == myPerson) {
            System.out.println("This game is a draw");
        }
        else if (myPerson == 0 && computer == 2) {
            System.out.println("You win");
        }
        else if(myPerson == 1 && computer == 0) {
            System.out.println("You win");
        }
        else if (myPerson == 2 && computer == 1) {
            System.out.println("You win");
        }
        else {
            System.out.println("You lose");
        }

    }
}
