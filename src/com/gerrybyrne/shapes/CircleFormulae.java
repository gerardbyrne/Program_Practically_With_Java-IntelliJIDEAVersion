package com.gerrybyrne.shapes;

import java.util.Scanner;

public class CircleFormulae 
{
	Scanner myScanner = new Scanner(System.in);
	
/*
    This is a method that will ask the user to input the length of
    the radius of the circle, calculate the area of the circle and 
    display the area of the circle in the console window
 */
  public void areaOfCircle()
  {
	    /*
	     Create two variables of data type double to hold the value of the 
	     radius input by the user and the calculated area of the circle
	    */

	    // Initialise the two variables to zero
	    double radiusLength = 0;

	    double areaOfCircle = 0; 

	 // Read the user input for the size of the radius
	    System.out.println("What is the length of the radius of the circle?\n");

	    radiusLength = myScanner.nextDouble();

	 // Calculate the area of the circle with the formula
	    areaOfCircle =Math.PI * radiusLength * radiusLength;

	    // Display the answer  
	    System.out.printf("\nA circle with radius %.2f has an area of %.2f",
	    radiusLength, areaOfCircle);

	/*
	Now call the method which calculates the circumference of the circle
	using the radius the user has input.
	We call the method and pass the radius as a parameter.
	*/
	  circumferenceOfCircle(radiusLength);
  } //End of areaOfCircle method

	  /*
	  This is a method that will accept the value of the radius 
	  passed to it. The radius has been obtained in the 
	  areaOfCircle method and then the areaOfCircle() method 
	  will call this new circumferenceOfCircle() method passing 
	  it the value of the radius. This method will then calculate 
	  the circumference and display the value in the console window
	  */
	
	  public void circumferenceOfCircle(double radiusOfCirclePassedIn)
	  {
		  /*
		    Create a variable of data type double to hold the value calculated
		    for the circumference of the circle. Initialise the variable to zero.
		    We have the radius as it is passed into this method
		    */
		    double circumferenceOfCircle = 0;

		    // Calculate the circumference of the circle with the formula
		    circumferenceOfCircle = 2 * Math.PI * radiusOfCirclePassedIn;

		    // Display the answer
		    System.out.printf("\nA circle with radius %.2f has a circumference of %.2f",radiusOfCirclePassedIn, circumferenceOfCircle);

	  } // End of circumferenceOfCircle method

} // End of CircleFormulae class