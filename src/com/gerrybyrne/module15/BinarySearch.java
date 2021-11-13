package com.gerrybyrne.module15;

import java.util.Arrays;

/*
With a binary search we must first ensure the array is sorted. 
The binary search starts with the whole array and checks if the 
value of our search key is less than the item in the middle of the array. 
If it is, the search is narrowed to the lower (left) half of the array. 
If it is not, then we use the upper (right) half. 
We repeat this process until the value is found or the there are elements left to half. 
*/

public class BinarySearch 
{
	public static void main(String[] args) 
	{
	    int claimValues[] = {6000, 9000, 3000, 4000, 8000, 1000, 2000, 5000, 7000};

	    // Value to be located using linear search
	    int valueToBeLocated = 6000;

	    // Sort the array as this is essential for a Binary search
	    Arrays.sort(claimValues);

	    // Display the elements of the array 
	    displayArrayElements(claimValues);

	  /*
	    Call the binary search method passing it the array and the 
	    value to be located and store the returned value in a variable
	    called returnedValue
	  */
	  int returnedValue =  performBinarySearch(claimValues, valueToBeLocated);  

	// Display the appropriate message (located or not)
	  if ( returnedValue == -1)
	  {
	      System.out.println("The value is not present in array");
	  } // End of if section
	  else
	  {
	  	System.out.printf("The value %d was located at index %d (position %d)", valueToBeLocated, returnedValue, returnedValue + 1 );
	  } // End of else section

	} // End of main() method

	public static int performBinarySearch(int[] arrayPassedIn, int numberToBeFound) 
	{
	  int firstPosition = 0;
	  int lastPosition = arrayPassedIn.length - 1;
	  int middlePosition = (firstPosition + lastPosition) / 2;
	  
	  while (firstPosition <= lastPosition) 
	  {
	      if (arrayPassedIn[middlePosition] < numberToBeFound) 
	      {
	    	  firstPosition = middlePosition + 1;
	      } 
	          else if (arrayPassedIn[middlePosition] == numberToBeFound) 
	          {
	        	  break;
	          } 
		          else 
		          {
		        	  lastPosition = middlePosition - 1;
		          }
	      middlePosition = (firstPosition + lastPosition) / 2;
	 } // End of while iteration
	   
	  if (firstPosition > lastPosition) 
	  {
		middlePosition = -1;
	  }
	  return middlePosition;
	} // End of performBinarySearch() method

	/* Prints the array */
	static void displayArrayElements(int claimValuesPassedIn[])
	{
	    for (int counter = 0; counter<claimValuesPassedIn.length; ++counter)
	    {
	        System.out.println(claimValuesPassedIn[counter] + " ");
	    }
	} // End of displayArrayElements

} // End of BinarySearch class