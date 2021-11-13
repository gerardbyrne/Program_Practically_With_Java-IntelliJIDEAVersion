package labs.module12;

import java.util.Arrays;

public class LabTwoClaimsPerState 
{
	static String[] claimsWithStateAbbreviation = {"1000IL", "2000FL", "1500TX", "1200CA", "2000NC", "300FL"};

	public static void main(String[] args) 
	{
		// Call the displayTheSortedClaims() method 
		System.out.println("The sorted array elements are");
		displayTheSortedClaims();
		
		// Declare the state to be found
		String stateAbbreviationToFind = "FL";
		
		// Call the allClaimsInASpecificState() method passing it the string to be found
		System.out.printf("The claims for the state of %s are %n",  stateAbbreviationToFind);
		allClaimsInASpecificState(stateAbbreviationToFind);
		
		// Call the findTheTotalOfAllClaimValues() method
		double totalOfAllClaims = findTheTotalOfAllClaimValues();
		System.out.printf("The total of the claim values is %.2f ", totalOfAllClaims);	
    } // End of main () method

	public static void allClaimsInASpecificState(String stateAbbreviationToFind)
	{
		// Iterate the array
		for(int counter=0;counter<claimsWithStateAbbreviation.length; counter++)
		{
			// Check if the current element of the array ends with the letter passed to the method
			if(claimsWithStateAbbreviation[counter].endsWith(stateAbbreviationToFind))
			{
				System.out.println(claimsWithStateAbbreviation[counter]);
			}
		}
	} // End of allClaimsInASpecificState() method
	
	public static void displayTheSortedClaims()
	{	
		// Sort the claimsWithStateAbbreviation array
		Arrays.sort(claimsWithStateAbbreviation);
		// Iterate the sorted array using the foreach construct
		for(String claim:claimsWithStateAbbreviation)
		{
			System.out.println(claim);
		}
	} // End of displayTheSortedClaims() method
	
	public static double findTheTotalOfAllClaimValues()
	{
		double currentTotalValue = 0.00; 
		double claimValue = 0.00;
		String firstFourCharacters;
		
		// Iterate the array
		for(int counter=0;counter<claimsWithStateAbbreviation.length; counter++)
		{
			/* 
			 Read the first four characters of the array element, parse (convert) it 
			 to a double and add it to the current total
			*/ 
			firstFourCharacters = claimsWithStateAbbreviation[counter].substring(0,4);
			claimValue = Double.parseDouble(firstFourCharacters);
			currentTotalValue += claimValue;					
		}
		return currentTotalValue;
	} // End of findTheTotalOfAllClaimValues() method
	
} // End of LabTwoClaimsPerState class
