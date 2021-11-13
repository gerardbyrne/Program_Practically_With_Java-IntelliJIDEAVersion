package labs.module10;
/*
  Use the code from Lab One if you have completed it. 
  Write a Java console application that will use an array with 
  the claim values, 1000.00, 4000.00, 3000.00, 2000.00. 
  The application should use separate VALUE methods to:
	• calculate the total of the claim values (value method, returns a double)
	• calculate the average of the claim values (value method, returns a double)
	• calculate the minimum of the claim values (value method, returns a double)
	• calculate the maximum of the claim values (value method, returns a double)
  and a PARAMETER method that accepts the four calculated values to:
	• display a message which states each of the calculated values (void method)
The application should only use variables which are local to the methods we use. The declaration of the array can be at the class level. 
*/
public class LabTwoClaimValuesValueMethods 
{
	// Declare and initialise the array of claim values at the class level
	static double []	claimValues  =  { 1000.00, 4000.00, 3000.00, 2000.00 } ;
	
	public  static void  main ( String[] arguments ) 
	{			
		/* Set up the variables at the class level.*/
		double maximumValueOfClaims, minimumValueOfClaims;
		double totalValueOfClaims, averageValueOfClaims ;
		 
		totalValueOfClaims = totalOfClaimValues();
		averageValueOfClaims = averageOfClaimValues();
		maximumValueOfClaims = maximumClaimValue();
		minimumValueOfClaims = minimumClaimValue();
		
		displayTheCalculatedValues(totalValueOfClaims, averageValueOfClaims, 
	maximumValueOfClaims, minimumValueOfClaims);
	} // End of main() method
	/*****************************************************
	      CREATE THE METHODS OUTSIDE THE MAIN METHOD 
	               BUT INSIDE THE CLASS
	*****************************************************/
	public static double totalOfClaimValues()
	{
		double totalOfClaims = 0.00; 
		// Iterate the array and accumulate the claim values
		for ( int counter = 0 ; counter < claimValues.length ; counter++ ) 
		{
			totalOfClaims = totalOfClaims + claimValues[counter];
		}
		return totalOfClaims;
	} // End of totalOfClaimValues() method
	
	public static double averageOfClaimValues()
	{
		double averageOfClaims = 0.00; 
		// Calculate the average using real arithmetic
		averageOfClaims = totalOfClaimValues() /claimValues.length;
		return averageOfClaims;
	}
	
	public static double maximumClaimValue()
	{
		// Find the maximum value - we assume first value is the maximum value
		double maximumOfClaims = claimValues[0] ;	
		
		// Compare all the other numbers to the maximum
		for ( int counter = 1 ; counter < claimValues.length ; counter++ ) 
		{
			// If the next number is greater than the maximum, update the maximum
			if ( claimValues [ counter ] > maximumOfClaims )
			{
				maximumOfClaims = claimValues[counter]; 
			}
		}
		return maximumOfClaims;
	} // End of maximumClaimValue() method
	
	public static double minimumClaimValue()
	{		
		// Find the minimum value- we assume the first number is the minimum value
		double minimumOfClaims = claimValues [0] ;	

		// Compare all the other numbers to the minimum
		for (int counter = 1 ; counter < claimValues.length ; counter++ ) 
		{
			// If the next number is smaller than the minimum, update the minimum 
			if ( claimValues [ counter ] < minimumOfClaims )
			{
				minimumOfClaims = claimValues[counter];
			}
		}
		return minimumOfClaims;
	} // End of minimumClaimValue() method	
	
public static void displayTheCalculatedValues(double totalValueOfClaimsPassedIn, double averageValueOfClaimsPassedIn, double maximumValueOfClaimsPassedIn, double minimumValueOfClaimsPassedIn)
	{	
		// Display the total of the claim values
		System.out.printf("The total of the claims is £%.2f\n", totalValueOfClaimsPassedIn) ;

		// Display the average of the claim values
		System.out.printf("The average claim value is £%.2f\n", averageValueOfClaimsPassedIn) ;
				
		// Display the maximum claim value
		System.out.printf("The maximum claim value is £%.2f\n", 
	maximumValueOfClaimsPassedIn) ;

		// Display the minimum claim value
		System.out.printf("The minimum claim value is £%.2f\n", 
	minimumValueOfClaimsPassedIn) ;		
	}
} // End of class ClaimValues
