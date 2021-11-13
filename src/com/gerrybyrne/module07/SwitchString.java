package com.gerrybyrne.module07;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);

		/* 
		We will setup our variables that will be used in the quote application  
		 */
		String yearsOfNoClaims;

		/* Read the user input and convert it to an int */
		System.out.println("How many full years of no claims does the driver have?\n");

		yearsOfNoClaims = myScanner.next();

		/*
            Now we will check if the years of no claims is greater than 10
            if it is true then we execute some lines of code which exist
            between the curly braces, else the program just moves to the
            next code line which is to read a key
		 */
		switch (yearsOfNoClaims)
		{
		case "11":
		case "12":
		case "13":
		case "14":
		case "15":
			/*
                  This block of code will be executed if the yearsofnoclaims
                  is more than 10
			 */
			System.out.println("Years of no claims is more than 10 but less than 16");
					break;
			case "9":
			case "10":
				/*
                  This block of code will be executed if the yearsofnoclaims is either 9 or 10
				 */
				System.out.println("Years of no claims is either 9 or 10");
				break;
			case "7":
			case "8":
				/*
                  This block of code will be executed if the yearsofnoclaims is
                  either 7 or 8
				 */
				System.out.println("Years of no claims is either 7 or 8");
				break;
			case "5":
			case "6":
				/*
                 This block of code will be executed if the yearsofnoclaims is
                 either 5 or 6
				 */
				System.out.println("Years of no claims is either 5 or 6");
				break;
			case "3":
			case "4":
				/*
                  This block of code will be executed if the yearsofnoclaims is
                  either 3 or 4
				 */
				System.out.println("Years of no claims is either 3 or 4");
				break;
			default:
				/*
                  This block of code will be executed if the yearsofnoclaims is
                  not one of the values in the case statements 4 to 15. That
                  means if the value is more than 15 or less than 4 this block
                  will be executed.
                  We need to think, is this what we really want. Certainly it
                  does not give us the same result as the if else-if
				 */
				System.out.println("Years of no claims is either less than 3 or greater than 15");
						break;
		} //End of switch construct

		myScanner.close();

	} // End of main method()
} // End of SwitchString class