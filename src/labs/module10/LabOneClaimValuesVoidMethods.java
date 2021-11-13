package labs.module10;

/*
  Write a Java console application that will use an array with the 
  claim values, 1000.00, 4000.00, 3000.00, 2000.00. 
  The application should use separate VOID methods to:
	•	calculate the total of the claim values
	•	calculate the average of the claim values 
	•	calculate the minimum of the claim values 
	•	calculate the maximum of the claim values
	•	display a message which states each of the calculated values
(Refer to Module 09 Lab One the code is the same but it is sequential)

*/
public class LabOneClaimValuesVoidMethods 
{
	// Declare and initialise the array of claim values at the class level
	static double []	claimValues  =  { 1000.00, 4000.00, 3000.00, 2000.00 };
	
	/* 
	 Set up the variables at the class level.	 
	*/
	static double maximumValueOfClaims, minimumValueOfClaims;
	static double totalValueOfClaims, averageValueOfClaims ;
	
	public  static void  main ( String[] arguments ) 
	{			
		totalOfClaimValues();
		averageOfClaimValues();
		maximumClaimValue();
		minimumClaimValue();
		displayTheCalculatedValues();
	} // End of main() method
	
	/*****************************************************
	    CREATE THE METHODS OUTSIDE THE MAIN METHOD 
	                              BUT INSIDE THE CLASS
	*****************************************************/
	public static void totalOfClaimValues()
	{
		// Iterate the array and accumulate the claim values
		for ( int counter = 0 ; counter < claimValues.length ; counter++ ) 
		{
			totalValueOfClaims = totalValueOfClaims + claimValues[counter];
		}
	} // End of totalOfClaimValues() method
	
	public static void  averageOfClaimValues()
	{
		// Calculate the average using real arithmetic
		averageValueOfClaims = totalValueOfClaims /claimValues.length;
	}
	
	public static void maximumClaimValue()
	{
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
	} // End of maximumClaimValue() method
	
	public static void minimumClaimValue()
	{		
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
	} // End of minimumClaimValue() method	
	
	public static void displayTheCalculatedValues()
	{	
		// Display the total of the claim values
		System.out.printf("The total of the claims is £%.2f\n", totalValueOfClaims  ) ;

		// Display the average of the claim values
		System.out.printf("The average claim value is £%.2f\n", averageValueOfClaims ) ;
				
		// Display the maximum claim value
		System.out.printf("The maximum claim value is £%.2f\n", maximumValueOfClaims ) ;

		// Display the minimum claim value
		System.out.printf("The minimum claim value is £%.2f\n", minimumValueOfClaims ) ;
	}
} // End of class LabOneClaimValuesVoidMethods
