package com.gerrybyrne.module15;

/*
A Bubble sort is a simple algorithm which compares two adjacent elements
of the array. If the first element is numerically greater than the next one, the
elements are swapped. The process is then repeated to move across all the 
elements of the array. 
 */

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		// Declare and create the array of claim values
		int claimValues[] = {6000, 9000, 3000, 4000, 8000, 1000, 2000, 5000, 7000};

		// Pass the array of claim values to the method bubbleSortTheArray()
		bubbleSortOfTheArray(claimValues);

		System.out.println("The sorted array is");

		// Pass the sorted array to the method displayArrayElements()
		displayArrayElements(claimValues);

	} // End of main() method

	static void bubbleSortOfTheArray(int claimValuesPassedIn[])
	{
		for (int outerCounter = 0; outerCounter < claimValuesPassedIn.length-1; 
				outerCounter++)
		{
			for (int innerCounter = 0; innerCounter < claimValuesPassedIn.length-
					outerCounter-1; innerCounter++)
			{
				if (claimValuesPassedIn[innerCounter] > 
				claimValuesPassedIn[innerCounter+1])
				{
					// Swap the two values 
					int temporaryValue = claimValuesPassedIn[innerCounter];
					claimValuesPassedIn[innerCounter] = claimValuesPassedIn[innerCounter+1];
					claimValuesPassedIn[innerCounter+1] = temporaryValue;
					displayArrayElements(claimValuesPassedIn);
				} // End of if construct
			} // End of for iteration inner iteration
		} // End of for iteration inner iteration
	} // End of bubbleSortTheArray

    /* Prints the array */
    static void displayArrayElements(int claimValuesPassedIn[])
    {
        for (int counter = 0; counter<claimValuesPassedIn.length; ++counter)
            System.out.print(claimValuesPassedIn[counter] + " ");
        	System.out.println();
    } // End of displayArrayElements

} // End of LinearSearch class