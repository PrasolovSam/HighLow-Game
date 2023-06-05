package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain = "";
       do {

           int number = (int) (Math.random() * 200 - 100);
           // System.out.println(number);
           int userNumber = 0;
           while (number != userNumber) {
               System.out.println("Welcome to our game!" +
                                    "\nEnter the number between -100 and 100");
               userNumber = input.nextInt();
               if (userNumber < number) {
                   System.out.println("It's too low");
               } else if (userNumber > number) {
                   System.out.println("It's too high");
               } else System.out.println("Congrats!");
           }
           System.out.println("Would you like play again?");
           playAgain = input.next();
       } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Good bye");
        input.close();
    }
}