// CSIS 1400
// Program: Mid-term
// Name: Phuc Hoang
// The guessing game
package guessingnumbergame;

import java.util.Scanner;
import java.util.Random;

public class GuessingNumberGame
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //Declare vars
        //Generate a random number from 1 - 1000
        int userInput;
        int randomNum;
        int countGuess = 1;
        String choice;

        //Loop for the user if they want to quit
        while (true)
        {   //For debugging purpose display your number.
                randomNum = rand.nextInt(1000 - 1) + 1;
                System.out.println("The random computer generated number is " + randomNum);
            //logic for the game
            while (true)
            {
                
                //Get the user input guess
                System.out.println("Please guess a number: ");
                userInput = sc.nextInt();
                //Decide how close is the guess
                if (userInput > randomNum)
                { //guess is bigger than randomNum 
                    System.out.println("Too high, try again!!");
                } else if (userInput < randomNum)
                { //guess is less than randomNum
                    System.out.println("Too low, try again!!");
                } else
                { //guess is equal to randomNum
                    System.out.println("Congratulations you guessed the number with " + countGuess + " guesses!!");
                    break;
                }
                countGuess++; //Count the total guesses made
            }
            //Ask if the user want to play again

            System.out.print("Do you want to play again(Y/N): ");

            choice = sc.next(); //input user choice

            if (choice.equals("n") || choice.equals("N"))
            {
                System.out.println("Thank you for playing! Goodbye");
                break;

            }
        }
    }
}
