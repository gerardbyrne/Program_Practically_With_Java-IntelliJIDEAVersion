package labs.module08;
/*
 Write a Java console application that will display a table showing a column with pound (£) 
  values and a second column showing the equivalent amount in US dollars ($). The pound 
  amounts should be from £1 to £10 and the exchange rate to be used is $1.40 for each £1.00.
*/

public class LabOnePoundsToDollars 
{
	public static void main(String[] args) 
	{	
		// Create a variable to hold the dollar amount
        double dollarAmount = 0.00;
        
        // Create a constant to hold the exchange rate
        final double dollarsPerPoundRate = 1.40;
        
        // Display a heading for the columns
        System.out.println("Pounds \t\t Dollars");

        // Iterate 10 times to convert the pounds to dollars
        for (int poundAmount=1; poundAmount<11; poundAmount++)
        {
            // Convert pounds to dollars at the rate assigned
        	dollarAmount = poundAmount * dollarsPerPoundRate;
          
          System.out.printf("%d \t\t %.2f \n", poundAmount, dollarAmount);  
        }
	} // End of main() method
} // End of class LabOnePoundsToDollars
