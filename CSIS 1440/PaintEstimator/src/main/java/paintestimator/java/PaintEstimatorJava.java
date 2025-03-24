// CSIS 1400

// Program: Paint Estimator

// Your name: Phuc Hoang

// Date: 06/26/2022

package paintestimator.java;
import java.util.Scanner;
public class PaintEstimatorJava
{

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        //declare vars
        
        double wallHeight;
        double wallWidth;
        double wallArea;
        double paintNeeded;
        int canNeeded;
        
        // getting user input
        
        //input for height
        System.out.println("Enter wall height (feet):");
        wallHeight = scnr.nextDouble();
        
        //input for width
        System.out.println("Enter wall width (feet):");
        wallWidth = scnr.nextDouble(); 
      
        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;                        
        System.out.println("Wall area: " + wallArea + " square feet");      
        
        // Calculate and output the amount of paint needed
        paintNeeded = wallArea / 350;
        System.out.println("Paint needed: " + paintNeeded + " gallons");
        
        // Calculate and output the amount of cans needed
        canNeeded = (int) Math.ceil(paintNeeded / 1);  //math function to round up to the nearest gallon.
        System.out.println("Cans needed: " + canNeeded + " can(s)");
    }
    
}

