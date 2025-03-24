package dow;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class DOW
{

    public static void main(String[] args) throws FileNotFoundException
    {//start
        //init
        //create in/out object extending Keyboard 
        InputFile inRecord = new InputFile("input.txt");
        OutputFile outRecord = new OutputFile("output.txt");
        System.out.println("DOW Temperature Started. Please Wait...");

        int index = 0;
        int temp = 0;
        int dow = 0;

        //create arrays
        int[] lowTempArray = new int[8];
        int[] highTempArray = new int[8];
        int[] countArray = new int[8];
        int[] totalArray = new int[8];
        //initialize all arrays

        for (index = 0; index < 8; index++)
        {
            lowTempArray[index] = 999;
            highTempArray[index] = -999;
            countArray[index] = 0;
            totalArray[index] = 0;
        }

        //read file and load arrays
        while (!inRecord.eof())
        {
            dow = inRecord.readInt();
            temp = inRecord.readInt();

            //find if new high
            if (temp > highTempArray[dow])
            {
                highTempArray[dow] = temp;
            }
            //find if new low
            if (temp < lowTempArray[dow])
            {
                lowTempArray[dow] = temp;
            }

            totalArray[dow] = totalArray[dow] + temp;
            countArray[dow]++;
        }

        //loop
        //output the array
        for (dow = 1; dow < 8; dow++)
        {
            if (countArray[dow] > 0)
            {
                outRecord.writeInt(dow);
                outRecord.writeInt(highTempArray[dow]);
                outRecord.writeInt(lowTempArray[dow]);
                outRecord.writeInt((totalArray[dow] / (countArray[dow])));
            } else
            {
                outRecord.writeWord(dow + " " + 0 + " " + 0 + " " + 0);
            }
            outRecord.writeEOL();
        }
        outRecord.close();
        System.out.println("DOW Temperature Completed Successfully.");
    }//stop

}
