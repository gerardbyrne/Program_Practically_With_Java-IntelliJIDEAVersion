package com.gerrybyrne.module07;

import java.util.Scanner;

public class SelectionAnd 
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		
	    /* We will setup our variables that will be used in the quote application */
	    int yearsOfNoClaims;	
	    int ageOfDriver = 0;

		  /* Read the user input and convert it to an int */
		  System.out.println("How many full years of no claims does the driver have?\n");
		
		  yearsOfNoClaims = myScanner.nextInt();

		  System.out.println("What is the current age of the driver?\n");
			
		  ageOfDriver = myScanner.nextInt();	

	      /* 
	        Now we will check if the years of no claims is greater than 10 OR
			if the age of the driver is greater than 40. 
			If both are TRUE we have the Boolean expression TRUE AND TRUE which equates 
			to TRUE or 
			if one of them is TRUE we have the Boolean expression TRUE OR FALSE or 
			FALSE OR TRUE which equates to TRUE 
			and we then we execute some lines of code which exist between the
			curly braces of the code block, otherwise the program moves to the
			else code block and executes some lines of code in this code block 
			*/

		  if (yearsOfNoClaims > 10 || ageOfDriver > 40)
	      {
	          /*
	            This block of code will be executed if the one
	            parts of the condition are TRUE
	          */
	          System.out.println("This quote is eligible for a 10% discount");
	      } // End of True part
	      else
	      {
	          /*
	          This block of code will be executed if the one
	          part of the condition is FALSE
	        */
	        System.out.println("This quote is ineligible for a discount");
	      } // End of False part

		  myScanner.close();
	} // End of main method()
} // End of SelectionAnd class