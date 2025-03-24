// CSIS 1400
// Program: Mid-term
// Name: Phuc Hoang
// Date: 02/7/2022

package com.mycompany.guessinggame;
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //Declare vars
        int randomNum = rand.nextInt(1000-1) + 1;
        
        //For debugging purpose display your number.
        System.out.println("The random computer generated number is " + randomNum);
        
        //Generate a random number from 1 - 1000
        
        //Get the user input guess
        
        //Decide how close is the guess
        
        //Ask if the user want to play again
    }
}
