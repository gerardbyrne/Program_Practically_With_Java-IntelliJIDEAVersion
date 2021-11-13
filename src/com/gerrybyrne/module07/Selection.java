// Program Description: 	A simple Java program to perform selection
// Author:              			Gerry Byrne
// Date of creation:    		01/10/2021

package com.gerrybyrne.module07;

import java.util.Scanner;

public class Selection 
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		
	    /*
	    We will setup our variables that will be used in the
	    quote application
	    */
	    int yearsOfNoClaims;

		/* 
		Read the user input and convert it to an int 
		 */
        System.out.println("How many full years of no claims does the driver have?\n");
 
        yearsOfNoClaims = myScanner.nextInt();

        /*
        Now we will check if the years of no claims is greater than 10 if
        it is true then we execute some lines of code which exist between
        the curly braces, else the program just moves to the next code line
        after the closing curly brace, which is to read a key
      */
          if (yearsOfNoClaims > 10)
          {
		  /*
		  This block of code will be executed if the yearsofnoclaims 
		  is more than 10
		  */
          	System.out.println("Years of no claims is more than 10");
          }

          else if (yearsOfNoClaims > 8)
          {
              /* This block of code will be executed if the yearsofnoclaims is more than 8
              which means 9, 10, 11, 12 etc. However, if yearsofnoclaims is 11, 12 etc it 
              will have been detected in the yearsofnoclaims > 10 block so really it will 
               only be the 9 and 10 that will be detected in this block */
              System.out.println("Years of no claims is either 9 or 10");
          }
          else if (yearsOfNoClaims > 6)
          {
              /* This block of code will be executed if the yearsofnoclaims is more than 6
               which means 7, 8, 9, 10 etc. However, if yearsofnoclaims is 9, 10 etc it will 
               have been detected in the yearsofnoclaims > 8 block so really it will only
               be the 7 and 8 that will be detected in this block */
              System.out.println("Years of no claims is either 7 or 8");
          }
          else if (yearsOfNoClaims > 4)
          {
              /* This block of code will be executed if the yearsofnoclaims is more than 4
              which means 5, 6, 7, 8 etc. However, if yearsofnoclaims is 7, 8 etc it will 
              have been detected in the yearsofnoclaims > 6 block so really it will only
              be the 5 and 6 that will be detected in this block */
              System.out.println("Years of no claims is either 5 or 6");
          }
          else if (yearsOfNoClaims > 2)
          {
              /* This block of code will be executed if the yearsofnoclaims is more than 2
              which means 3, 4, 5, 6 etc. However, if yearsofnoclaims is 5, 6 etc it will 
              have been detected in the yearsofnoclaims > 4 block so really it will only
              be the 3 and 4 that will be detected in this block */
              System.out.println("Years of no claims is either 3 or 4");
          }
          else
          {
           /* This block of code will be executed if the yearsofnoclaims is not more than 2.
           For this block of code to be executed none of the conditions above must have
           been true (and none of the blocks of code were executed)*/
              System.out.println("Years of no claims is 2, 1, 0 \n or indeed a negative number of years \n because of a penalty being enforced on our policy");
          }
 
          /* After the true or false block is executed this is the next line to be executed */

          // Close the myScanner instance we opened
          myScanner.close();       

	} // End of main method()

} // End of Selection class