package com.gerrybyrne.module15;

/* 
 An Insertion Sort is similar to a Bubble sort, however, it is a more efficient
 sort. We should think about using the Insertion sort when we have a small 
 number of elements to sort. Larger data sets will take more time. 
 */

public class InsertionSort 
{

	public static void main(String[] args) 
	{
		// Declare and create the array of claim values
		int claimValues[] = {6000, 9000, 3000, 4000, 8000, 1000, 2000, 5000, 7000};

		insertionSortOfArray(claimValues);

		displayArrayElements(claimValues);

	} // End of main() method

	/* Method to sort array using an insertion sort*/
	static void insertionSortOfArray(int claimValuesPassedIn[])
	{
		for (int counter = 1; counter < claimValuesPassedIn.length; ++counter) 
		{
			int currentKeyValue = claimValuesPassedIn[counter];
			int previousValue = counter - 1;

			/* Move elements that are greater than the currentArrayValue
               to one position in front of their current position */
			while (previousValue >= 0 && claimValuesPassedIn[previousValue] > currentKeyValue) {
				System.out.println("Comparing " + claimValuesPassedIn[previousValue] + " and " + currentKeyValue);
				claimValuesPassedIn[previousValue + 1] = claimValuesPassedIn[previousValue];
				previousValue = previousValue - 1;
			}
			claimValuesPassedIn[previousValue + 1] = currentKeyValue;
			// This line is used to display the values being compared, remove when completed
			displayArrayElements(claimValuesPassedIn);
		} // End of iteration of the array
	} // End of insertionSortOfArray() method  
		
	    /* Prints the array */
	    static void displayArrayElements(int claimValuesPassedIn[])
	    {
	        for (int counter = 0; counter<claimValuesPassedIn.length; ++counter)
	            System.out.print(claimValuesPassedIn[counter] + " ");
	        	System.out.println();
	    } // End of displayArrayElements    

	} // End of InsertionSort class