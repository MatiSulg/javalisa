/*
Write a lottery program that prompts the user to guess a randomly generated number between 0 and 100000.
The user pays $1.00 for each guess, $2.00 for each hint, and wins $1,000,000 if the guess is correct.
The user enters a "q" to quit. If the user does not win, the program will show how much money the user lost.
If the user wins, the user will not lose the money - the winner takes it all - $1,000,000.
*/

import java.util.Random;
import java.util.Scanner;

public class ylesanne2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int randNum = rand.nextInt(100001);
        int lostSum = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Want to win a million dollars?");
        System.out.println("If so, guess the winning number (a number between 0 and 100000).");

        while(true) {
            System.out.println("Insert $1.00 and enter your number or 'q' to quit:");
            String userInputString = userInput.next();

            if(userInputString.equals("q")) {
                System.out.println("You lost $" + lostSum + ".00. Thanks for playing. Come again!");
                break;
            }
            lostSum +=1;

            if(Integer.parseInt(userInputString) == randNum) {
                System.out.println("YOU WIN!");
                break;
            }
            else{
                System.out.println("Sorry, good guess, but not quite right. " +
                        "Do you want me to give you a hint (y|n)?");
                    String userInputString2 = userInput.next();
                if(userInputString2.equals("y")){
                    lostSum +=2;
                    if(Integer.parseInt(userInputString) < randNum) {
                        System.out.println("Insert $2.00 for the hint!");
                        System.out.println("Your number is too low!");
                    } else  {
                        System.out.println("Insert $2.00 for the hint!");
                        System.out.println("Your number is too high!");
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
