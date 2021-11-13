package labs.module11;

/*
  Use the code from Module 10 Lab Two if you have completed it. 
  Write a Java console application that will:
	o have a class called ClaimCalculator and inside it:
		o instantiate the CalculatedValues class
		o call each of the four value methods and assign them to variables
		o pass the four variables to the parameter method, which will display the table of values

*/
public class ClaimCalculator 
{
	public  static void  main ( String[] arguments ) 
	{	
		/* 
		 Set up the variables at the class level.	 
		*/
		double maximumValueOfClaims, minimumValueOfClaims;
		double totalValueOfClaims, averageValueOfClaims ;
		
		// Instantiate the CalculatedValues class
		CalculatedValues myCalculatedValues = new CalculatedValues();
		
		// Call each method and assign each to a value
		totalValueOfClaims = myCalculatedValues.totalOfClaimValues();
		averageValueOfClaims = myCalculatedValues.averageOfClaimValues();
		maximumValueOfClaims = myCalculatedValues.maximumClaimValue();
		minimumValueOfClaims = myCalculatedValues.minimumClaimValue();
		
		// Pass each value to the display method
		myCalculatedValues.displayTheCalculatedValues(totalValueOfClaims, 
	averageValueOfClaims, maximumValueOfClaims, minimumValueOfClaims);
	} // End of main() method
} // End of class ClaimCalculator
