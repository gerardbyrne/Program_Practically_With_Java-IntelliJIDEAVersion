package com.gerrybyrne.shapes;

import java.util.Scanner;

public class RectangleFormulae 
{
    Scanner myScanner = new Scanner(System.in);
    
	/*
    This is a method that will ask the user to input the length of the
    rectangle, then ask them for the breadth of the rectangle, calculate 
    the area of the rectangle and display the area of the rectangle in 
    the console window
	 */
	public void areaOfRectangle()
	{
		/*
      	Create three variables of data type double to hold the value of the length and 
		breadth as input by the user and the calculated area of the rectangle.
      	Initialise the three variables to zero.
       */
      double lengthOfRectangle = 0;

      double breadthOfRectangle = 0;

      double areaOfRectangle = 0;
		
      // Read the user input for the size of the sides  
      System.out.println("\nWhat is the length of the rectangle?\n");

      lengthOfRectangle = myScanner.nextDouble();

      System.out.println("\nWhat is the breadth of the rectangle?\n");

      breadthOfRectangle = myScanner.nextDouble();

	// Calculate the area of the rectangle with the formula 
	areaOfRectangle =  lengthOfRectangle * breadthOfRectangle;
	
	// Display the answer  
	System.out.printf("\nA rectangle with length of %.2f and breadth of %.2f has an area of %.2f",lengthOfRectangle, breadthOfRectangle, areaOfRectangle);

	   /*
	    Now call the method which calculates the perimeter of the rectangle
	    using the length and breadth the user has input.
	    We call the method and pass the radius as a parameter  
	  */
	  perimeterOfRectangle(lengthOfRectangle, breadthOfRectangle);
	} // End of areaOfRectangle method

	/*
    This is a method that will accept the values of the length and
    breadth passed to it. Both values have been obtained in the
    areaOfRectangle method and then the areaOfRectangle() method will
    call this new perimeterOfRectangle() method passing it the values 
    of the length and breadth. This method will then calculate the 
    perimeter and display the value in the console window
	*/
	public void perimeterOfRectangle(double lengthPassedIn,double breadthPassedIn)
	{
		/*
	    Create a variable of data type double to hold the value calculated for 
	    the perimeter of the rectangle. 
	    Initialise the variable to zero.
	    We have the length and breadth as they are passed into this method
	  */
	    double perimeterOfRectangle = 0;

	    // Calculate the perimeter of the rectangle with the formula
	    perimeterOfRectangle = 2 * (lengthPassedIn + breadthPassedIn);

	    // Display the answer
	    System.out.printf("\nA rectangle with length %.2f and breadth  %.2f has a perimeter of %.2f",lengthPassedIn, breadthPassedIn, perimeterOfRectangle);

	} // End of perimeterOfRectangle method

} // End of RectangleFormulae class