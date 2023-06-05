package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain = "";
        int triesCount = 0;
       do {

           int number = (int) (Math.random() * 200 - 100);
           // System.out.println(number);
           int userNumber = 0;
           System.out.println("Welcome to uor game!");
           System.out.println("Enter the number between -100 and 100");
           while (number != userNumber) {
               userNumber = input.nextInt();
               if (userNumber < number) {
                   System.out.println("It's too low");
               } else if (userNumber > number) {
                   System.out.println("It's too high");
               } else System.out.println("Congrats!");
               triesCount++;
           }
           System.out.println("It only took you " + triesCount + " tries");
           System.out.println("Would you like play again?");
           playAgain = input.next();
       } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Good bye");
        input.close();
    }
}