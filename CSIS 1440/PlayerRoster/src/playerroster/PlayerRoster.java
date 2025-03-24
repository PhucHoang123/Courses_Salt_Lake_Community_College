// CSIS 1400
// Program: Mid-term
// Name: Phuc Hoang
// Player Roster
package playerroster;

import java.util.Scanner;
public class PlayerRoster
{
public static void main(String[] args)
{
    Scanner scnr = new Scanner(System.in);
    // Declare arrays
    int[] jersey=new int[5];
    int[] rating=new int[5];
    //looping for user player number and rating input
    for(int i=0;i<5;i++)
    {
        System.out.println("Enter player "+(i+1)+"'s jersey number:");
        jersey[i]=scnr.nextInt();
        System.out.println("Enter player "+(i+1)+" 's rating:");
        rating[i]=scnr.nextInt();
    }
    //looping for menu
    while(true)
    {
        System.out.println("MENU\nu - Update player rating\na - Output players above a rating\nr - Replace player\no - Output roster\nq - Quit");
        char option=scnr.next().charAt(0);
        //Update player rating option
        if(option == 'u')
        {
            System.out.println("Enter a jersey number:");
            int jers = scnr.nextInt();
            System.out.println("Enter a new rating for player:");
            int rate = scnr.nextInt();
            for(int i=0;i<5;i++)
            {
                if(jersey[i]== jers)
                {
                    rating[i]= rate;
                    break;
                }
            }
        }
        //Output players above a rating option
        else if(option == 'a')
        {
            System.out.println("Enter a rating:");
            int rate = scnr.nextInt();
            System.out.println("Above "+(rate));
            for(int i=0;i<5;i++)
            {
                if(rating[i]>rate)
                {
                  System.out.println("Player "+(i+1)+" -- Jersey number:"+jersey[i]+", Rating:"+rating[i]);
                }
            }
        }
        //Replace player option
        else if(option == 'r')
        {
            System.out.println("Enter a jersey number:");
            int jer = scnr.nextInt();
            System.out.println("Enter a new jersey number:");
            int newJer = scnr.nextInt();
            System.out.println("Enter a new rating for the new player: ");
            int newRate = scnr.nextInt();
            for(int i=0;i<5;i++)
            {
                if(jersey[i] == jer)
                {
                    jersey[i] = newJer;
                    rating[i] = newRate;
                }
            }
        }
        //Output roster option
        else if(option == 'o')
        {
            System.out.println("Roster");
            for(int i = 0; i < 5; i++)
            {
                System.out.println("Player "+(i+1)+" -- Jersey number:"+jersey[i]+", Rating:"+rating[i]);
            }
        }
        //quit option
        else
        {
            break;
        }
    }
}
}