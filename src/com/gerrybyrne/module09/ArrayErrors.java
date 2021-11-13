package com.gerrybyrne.module09;

import java.util.Scanner;

public class ArrayErrors 
{
	public static void main(String[] args) 
	{
	     Scanner myScanner = new Scanner(System.in);

	     /*
	        We will setup our variables that will be used in the application
	        The number of entries being made will determine the size of the array 
	     */
	     int numberOfEntriesBeingMade;

	     int numberOfEntriesEntered = 0;
	     int arrayPositionCounter = 0;
	     int odometerReadingForVehicle;

	     String vehiclePolicyNumber;

	     /* 
	      Read the user input for the number of entries being made and convert
	      the string value to an integer data type 
	    */
	    System.out.println("How many entries are we wishing to make?\n");
	    numberOfEntriesBeingMade = myScanner.nextInt();
	    
	     /* 
	        The array is going to hold the data for a number of vehicles and
	        their corresponding odometer readings. Each entry will be a
	        vehicle policy number and the number of kilometres shown on the
	        odometer. This means that the size of the array will be twice the 
	        number of entries being made by the repair shop.
	     */
	     String[] odometerReadings = new String[numberOfEntriesBeingMade * 2];

	     /* 
	      As we are using a variable in the loop our code is flexible and can be
	      used for any number of claims. An ideal situation and good code.
	    */
	    do
	    {
	        System.out.println("The current value of the counter is :" +
	numberOfEntriesEntered + "\n");

	        /* 
	          Read the user input for the vehicle policy number and keep it 
	          as a string 
	        */
	        System.out.println("What is the vehicle policy number?\n");
	        vehiclePolicyNumber = myScanner.next();

	        /* 
	          Write this first input value to the array and then increment the
	          value of the arrayPositionCounter by 1 
	        */
	        odometerReadings[arrayPositionCounter] = vehiclePolicyNumber;
	        arrayPositionCounter++;

	        /* Read the user input for the odometer reading */
	        System.out.println("What is the odometer reading?\n");
	        odometerReadingForVehicle = myScanner.nextInt();

	        /* 
	          Write the second input value to the array and then increment the
	          value of the arrayPositionCounter by 1. The value read in from 
	          the console is of data type int and the array holds Strings, so 
	          a conversion from Integer to String must be done 
	        */
	        odometerReadings[arrayPositionCounter] =
	            Integer.toString(odometerReadingForVehicle);
	        arrayPositionCounter++;

	        /* Increment the loop counter by 1 */
	        numberOfEntriesEntered++;
	    } while (numberOfEntriesEntered < numberOfEntriesBeingMade);  
	    
	    for (String itemInTheodometerReadingsArray: odometerReadings)
	    {
	        System.out.println("The item in the array is:\t" + 
	        itemInTheodometerReadingsArray + "\n");
	    }

	    System.out.println("End of program?\n");
	    myScanner.close(); 

	} // End of main method()
} // End of ArrayErrors class