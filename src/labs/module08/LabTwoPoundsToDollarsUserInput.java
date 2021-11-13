package labs.module08;

import java.util.Scanner;

/*
	Write a Java console application that will display a table showing a column with pound (£)
	values and a second column showing the equivalent amount in US dollars ($). 
	The application will ask the user to enter the number of pounds they wish to start their 
	conversion table at and then ask them to enter the number of pounds they wish to stop their 
	conversion table at display.  The application will display a table showing a column with 
	pound (£) values, starting at the users start value and ending at the users end value and a 
	second column showing the equivalent amount in US dollars ($). 
	The exchange rate to be used is $1.40 for each £1.00	
*/

public class LabTwoPoundsToDollarsUserInput {

	public static void main(String[] args) 
	{	
	Scanner myScanner = new Scanner(System.in);
		
		// Create a variable to hold the dollar amount
        double dollarAmount = 0.00;
        
        // Create variables for the start and end values
        int startValue = 0, endValue = 0;
        // Create a constant to hold the exchange rate
        final double dollarsPerPoundRate = 1.40;
        
        // Ask the user to input the start value
        System.out.println("What value do you wish to start at?");
        startValue = myScanner.nextInt();
        
        // Ask the user to input the end value
        System.out.println("What value do you wish to end at?");
        endValue = myScanner.nextInt();
        
        // Display a heading for the columns
        System.out.println("Pounds \t\t Dollars");
        
        /* Iterate starting at the users start value and stopping at the
           users end value */
        for (int poundAmount=startValue; poundAmount<=endValue; poundAmount++)
        {
            // Convert pounds to dollars at the rate assigned
        	dollarAmount = poundAmount * dollarsPerPoundRate;
          
          System.out.printf("%d \t\t %.2f \n", poundAmount, dollarAmount);  
        }
        
        myScanner.close();
	} // End of main() method
} // End of class LabTwoPoundsToDollars
