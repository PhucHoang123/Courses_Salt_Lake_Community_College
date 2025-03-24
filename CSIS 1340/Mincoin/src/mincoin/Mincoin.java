package mincoin;

import java.util.Scanner;

public class Mincoin

{

    public static void main(String[] args)
    {//start
        Scanner in = new Scanner(System.in);
        int change = -9999, quarters = 0, dimes = 0, nickels = 0, pennies = 0;
        while (change != 0)
        {
            System.out.println("Please Enter The Amount of Change (1-99) or ZERO to EXIT:");
            change = Integer.parseInt(in.nextLine());
            quarters = 0;
            dimes = 0;
            nickels = 0;
            pennies = 0;
            if (change == 0)
            {
                break;
            } else
            {
                //looping

                //true
                while (change >= 25)
                {//true
                    change = change - 25;
                    quarters++;
                }
                //false
                while (change >= 10 && change < 25)
                {//true
                    change = change - 10;
                    dimes++;
                }//false

                while (change >= 5 && change < 10)
                {//true
                    change = change - 5;
                    nickels++;
                }//false
                if (change < 5)
                {

                    pennies = change;

                }
            }//looping

            //display the results
            System.out.println("Quarters:" + quarters);
            System.out.println("Dimes:" + dimes);
            System.out.println("Nickels:" + nickels);
            System.out.println("Pennies:" + pennies);
        }
    }//stop
}
