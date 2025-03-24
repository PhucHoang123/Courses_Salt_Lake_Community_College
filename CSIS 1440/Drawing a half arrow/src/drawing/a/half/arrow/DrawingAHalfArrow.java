// CSIS 1400
// Program: Drawing A Half Arrow
// Your name: Phuc Hoang
// Date: 02/7/2022
package drawing.a.half.arrow;

import java.util.Scanner;

public class DrawingAHalfArrow
{

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        //Declare vars
        int arrowBaseHeight;
        int arrowBaseWidth;
        int arrowHeadWidth;

        //getting user input
        System.out.println("Enter arrow base height:");
        arrowBaseHeight = scnr.nextInt();

        System.out.println("Enter arrow base width:");
        arrowBaseWidth = scnr.nextInt();

        System.out.println("Enter arrow head width:");
        arrowHeadWidth = scnr.nextInt();
        System.out.println("");
        
        // Condition baseWidth have to be bigger that headWidth 
        // Looping until the userinput satisfy the condition 
        while (arrowBaseWidth >= arrowHeadWidth)
        {
            System.out.println("Please enter a head width that is bigger than the base width:");
            arrowHeadWidth = scnr.nextInt();
            System.out.println("");
        
        }
        
        //Code to generate the base width and height
        for (int i = 0; i < arrowBaseHeight; i++)    // looping for the base height
        {
            for (int j = 0; j < arrowBaseWidth; j++) // looping for the base width
            {
                System.out.print("*");
            }
            System.out.println();
        }

        
        //code to generate the right triangle
        for (int k = arrowHeadWidth; k > 0; k--) // looping for the width
        {
            for (int e = 0; e < k; e++)          
            {
                System.out.print("*");           // looping for the amount of * on each line
            }
            System.out.println();
        }
        
    }

}
