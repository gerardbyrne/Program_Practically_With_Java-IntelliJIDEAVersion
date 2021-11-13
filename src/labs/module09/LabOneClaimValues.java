package labs.module09;

/*
  Write a Java console application that will use an array with the claim values, 1000.00, 
  4000.00, 3000.00, 2000.00. The application should calculate and display the total, average,
  minimum and maximum value of the claims. */
public class LabOneClaimValues {

	public  static void  main ( String[] arguments ) 
	{			
		// Declare the variables to be used import java.util.Scanner;
		double maximumValueOfClaims, minimumValueOfClaims;
		double totalValueOfClaims, averageValueOfClaims ;

		// Declare and initialise the array of claim values
		double []	claimValues  =  { 1000.00, 4000.00, 3000.00, 2000.00 };

		/* Set up a variable for the total of the claim values
		   and initialise its value to 0; */
		totalValueOfClaims = 0 ;

		// Iterate the array and accumulate the claim values
		for ( int counter = 0 ; counter < claimValues.length ; counter++ ) 
		{
			totalValueOfClaims = totalValueOfClaims + claimValues[counter];
		}

		// Calculate the average using real arithmetic
		averageValueOfClaims = totalValueOfClaims /claimValues.length;
		
		// Display the total and average 
		System.out.printf("The total of the claims is £%.2f\n", totalValueOfClaims  ) ;
		System.out.printf("The average claim value is £%.2f\n", averageValueOfClaims ) ;

		// Find the maximum value - we assume first value is the maximum value
		maximumValueOfClaims = claimValues[0] ;	

		// Compare all the other numbers to the maximum
		for ( int counter = 1 ; counter < claimValues.length ; counter++ ) 
		{
			// If the next number is greater than the maximum, update the maximum
			if ( claimValues [ counter ] > maximumValueOfClaims )
			{
				maximumValueOfClaims = claimValues[counter]; 
			}
		}

		// Display the maximum claim value
		System.out.printf("The maximum claim value is £%.2f\n", maximumValueOfClaims ) ;

		// Find the minimum value- we assume the first number is the minimum value
		minimumValueOfClaims = claimValues [0] ;	

		// Compare all the other numbers to the minimum
		for (int counter = 1 ; counter < claimValues.length ; counter++ ) 
		{
			// If the next number is smaller than the minimum, update the minimum 
			if ( claimValues [ counter ] < minimumValueOfClaims )
			{
				minimumValueOfClaims = claimValues[counter];
			}
		}

		// Display the minimum claim value
		System.out.printf("The minimum claim value is £%.2f\n", minimumValueOfClaims ) ;
	} // End of main() method
} // End of class LabOneClaimValues
