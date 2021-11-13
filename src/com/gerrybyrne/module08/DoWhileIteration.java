package com.gerrybyrne.module08;

import java.util.Scanner;

public class DoWhileIteration 
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);

		 /*
	    We will setup our variables that will be used in the quote application
	    The details will be: 
	          - the repair shop unique id	(String)
	          - the vehicle insurance policy number	(String)
	          - the date of the claim	(String)
	          - the claim amount and	(double) 
	  */
	  String repairShopID;
	  String vehiclePolicyNumber;
	  String claimDate;
	  double claimAmount; 
	  int numberOfClaimsBeingMade;      
	  
	  int maximumNumberOfClaims = 5;

	  /* This variable will be used to maintain a count for the number 
	      of claims that have been entered by the user
	  */
	  int numberOfClaimsEntered =0;

	  /* 
	    Read the user input for the number of claims being made and convert
	    the string value to an integer data type using the nextInt() method
	  */
	  System.out.println("How many claims are we wishing to make?\n");
	  numberOfClaimsBeingMade = myScanner.nextInt();

	  /*    
	    Here we use the do iteration which means at least one iteration will be performed.
		The do iteration uses a Boolean test after iteration one to see if the number of claims
		entered by the user so far is less than the number of claims being made. 
		If the comparison equates to true then the do loop block of code is executed again. 
		If the comparison equates to false then the do loop block of code is not executed.
		As we are using a variable in the loop our code is flexible and can be used for any 
		number of claims. An ideal situation and good code.
	  */
	  do
	  {
	    System.out.println("The current value of the counter is :" + numberOfClaimsEntered + "\n");
	
	    /* 
	      We will use the if statement to perform a boolean test and if the test
	      produces a true value we will break out of the loop. If the boolean
	      test produces a false value the loop simply continues executing the
	      block of code 
	    */
	    if (numberOfClaimsEntered == maximumNumberOfClaims)
	    {
	        /* 
	          We have reached the maximum number of claims allowed in one 
	          session so we will break out of the loop early 
	        */
	        break;
	    }

	     /* 
	       We will use the if statement to perform a boolean test and if the test produces a true  
	       value we will continue with the loop but will skip out of this current iteration. In this
	       example we will check if the value of the counter is even (when we divide by 2 the
	       remainder is 0). If it is an even number we will skip the rest of this iteration by using
	   the continue statement. There is no else part to the if statement so if the boolean test 
	   produces a false value the loop carries on executing the block of code */
	    if (numberOfClaimsEntered % 2 == 0)
	    {
	        /* We have reached the maximum number of claims allowed in one 
	          session so we will break out of the loop early.
	          Increment the loop counter by 1 */
	        numberOfClaimsEntered++;
	        continue;
	    }

	    /* 
	      Read the user input for the repair shop id and keep it as a string 
	    */
	    System.out.println("What is our repair shop id?\n");
	    repairShopID = myScanner.next();

	    /* 
	      Read the user input for the vehicle policy number and keep it 
	      as a string */
	    System.out.println("What is the vehicle policy number?\n");
	    vehiclePolicyNumber = myScanner.next();

	    /* 
	      Read the user input for the repair amount and convert it to 
	      a double
	    */
	    System.out.println("What is the amount being claimed for the repair?\n");
	    claimAmount = myScanner.nextDouble();

	    /* 
	      Read the user input for the repair date leaving it as a String 
	    */
	    System.out.println("What was the date of the repair?\n");
	    claimDate = myScanner.next();
	    
	    System.out.println("The details entered for repair " + 
	    (numberOfClaimsEntered + 1) + " are");
	    System.out.println("Repair shop id:\t" + repairShopID);
	    System.out.println("Policy number:\t" + vehiclePolicyNumber);
	    System.out.println("Claim amount:\t" + claimAmount);
	    System.out.println("Claim date:\t" + claimDate);
	        /* 
	      Increment the loop counter by 1 
	    */
	    numberOfClaimsEntered++;
	  } while (numberOfClaimsEntered < numberOfClaimsBeingMade);
	  
	  System.out.println("End of program?\n");
	  myScanner.close();

	} // End of main method()
} // End of DoWhileIteration class