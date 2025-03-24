package gcd;

import java.util.Scanner;

public class GCD
{

    public static void main(String[] args)
    {//start
        //declare variables
        int number1, number2, ans;

        //getting number1 and number2 from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        number1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        number2 = sc.nextInt();

        //calling GCD() function
        ans = GCD(number1, number2);

        //output answer 
        System.out.println("The GCD is " + ans);
    }

    //GCD function 
    public static int GCD(int number1, int number2)
    {
        while (number1 != number2)
        //if-else
        {
            if (number1 > number2)
            {
                number1 = number1 - number2;
            } else
            {
                number2 = number2 - number1;
            }
        }
        //getting return value
        return number2;
    }//stop

}
