package com.gerrybyrne.module09;

import java.util.Scanner;

public class Arrays 
{
	public static void main(String[] args) 
	{
        Scanner myScanner = new Scanner(System.in);

    	/* 
    	 The array is going to hold the data for 2 claims. Each claim has
         four pieces of information. The number of data items is therefore
         2 multiplied by 4 = 8. So, we will make the array for this example
         of size 8. Not the best way to do things, but fine for now. 
         */
        String[] repairShopClaims = new String[8];

        /*
        We will setup our variables that will be used in the quote application
        The details will be: 
              - the repair shop unique id	 (String)
              - the vehicle insurance policy number	 (String)
              - the claim amount and	 (double)
              - the date of the claim	 (String)        
      */
      String repairShopID;
      String vehiclePolicyNumber;
      double claimAmount;
      String claimDate;
      int numberOfClaimsBeingMade;
      int numberOfClaimsEntered = 0;
      int arrayPositionCounter = 0;

      /* 
       Read the user input for the number of claims being made and convert
       the string value to an integer data type
      */
     System.out.println("How many claims are we wishing to make?\n");
     numberOfClaimsBeingMade = myScanner.nextInt();

     /* 
      As we are using a variable in the loop our code is flexible and can be used 
     for any number of claims. An ideal situation and good code.
      */
   do
   {
    System.out.println("The current value of the counter is :" + numberOfClaimsEntered + "\n");

	 /* 
    Read the user input for the repair shop id and keep it as a string 
 */
  	System.out.println("What is our repair shop id?\n");
  	repairShopID = myScanner.next();

  	/* 
  	Write the first input value to the array and then increment the
  	value of the arrayPositionCounter by 1.  
  	*/
  	repairShopClaims[arrayPositionCounter] = repairShopID;
  	arrayPositionCounter++;

  	/* 
    Read the user input for the vehicle policy number and keep it 
    as a string 
  */
  System.out.println("What is the vehicle policy number?\n");
  vehiclePolicyNumber = myScanner.next();

  /* 
  Write the second input value to the array and then
  increment the value of the arrayPositionCounter by 1 
*/
	repairShopClaims[arrayPositionCounter] = vehiclePolicyNumber;
	arrayPositionCounter++;

	/* 
	  Read the user input for the repair amount and convert it 
	  to a double and assign it to the variable claimAmount
	*/
	System.out.println("What is the amount being claimed for the repair?\n");
	claimAmount = myScanner.nextDouble();

	/* 
	  Write the third input value to the array and then increment the
	  value of the arrayPositionCounter by 1. The value read in from
	  the console is of data type double and the array holds Strings,
	  so a conversion from double to String must be done 
	*/
	repairShopClaims[arrayPositionCounter] = Double.toString(claimAmount);
	arrayPositionCounter++;

	/* 
	  Read the user input for the repair date leaving it as a String 
	*/
	System.out.println("What was the date of the repair?\n");
	claimDate = myScanner.next();

	/* 
	  Write the fourth input value to the array and then increment the
	  value of the arrayPositionCounter by 1 
	*/
	repairShopClaims[arrayPositionCounter] = vehiclePolicyNumber;
	arrayPositionCounter++;

	/* Increment the loop counter by 1 */
	numberOfClaimsEntered++;
   } while (numberOfClaimsEntered < numberOfClaimsBeingMade);
   
   for (String itemInTheClaimsArray: repairShopClaims)
   {
       System.out.println("The item in the array is:\t" + 
       itemInTheClaimsArray + "\n");
   }

   myScanner.close(); 

	} // End of main method()
} // End of DoWhileIteration class