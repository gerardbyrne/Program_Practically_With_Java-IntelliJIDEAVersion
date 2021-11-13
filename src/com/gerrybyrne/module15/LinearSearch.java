package com.gerrybyrne.module15;

/*
A Linear search is a simple searching algorithm that searches for an
element in a list in sequential order. The linear search starts at the start 
of the list and checks every element until the desired element is not found. 
 */

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		// Declare and create the array of claim values
		int claimValues[] = {6000, 9000, 3000, 4000, 8000, 1000, 2000, 5000, 7000};

		// Value to be located using linear search
		int valueToBeLocated = 1000;

		// Display the elements of the array 
		displayArrayElements(claimValues);

		/*
        Call the linear search method passing it the array and the 
        value to be located and store the returned value in a variable
        called returnedValue
		 */
		int returnedValue = searchForTheValue(claimValues, valueToBeLocated);

		// Display the appropriate message (located or not)
		if ( returnedValue == -1)
		{
			System.out.println("The value is not present in array");
		} // End of if section
		else
		{
			System.out.printf("The value was located at index %d (position %d)", returnedValue, returnedValue + 1 );
		} // End of else section

	} // End of main() method

	public static int searchForTheValue(int claimValuesPassedIn[], 
			int valueToBeLocatedPassedIn)
	{
		for (int counter = 0; counter < claimValuesPassedIn.length; counter++)
		{
			// This line is used to display the values being compared, remove when completed
			System.out.println("Comparing " + claimValuesPassedIn[counter] + " and " + 
					valueToBeLocatedPassedIn);
			if (claimValuesPassedIn[counter] == valueToBeLocatedPassedIn)
			{
				return counter;
			}
		}
		return -1;
	} // End of searchForTheValue() method

	/* Prints the array */
	static void displayArrayElements(int claimValuesPassedIn[])
	{
		for (int counter = 0; counter<claimValuesPassedIn.length; ++counter)
		{
			System.out.println(claimValuesPassedIn[counter] + " ");
		}
	} // End of displayArrayElements

} // End of LinearSearch class