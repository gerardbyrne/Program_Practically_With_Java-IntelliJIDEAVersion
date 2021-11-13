 // Program Description: 	A simple Java program to output text and read input
// Author:							Gerry Byrne
// Date of creation:    		01/10/2021

/* 
 The package is simply an area that holds our class.
 This package has used the dot . to separate sections of the package name. 
 The parts essentially represent folders within our workspace. 
 Package names are by tradition all small letters
 */

package com.gerrybyrne.module04;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//This is our only class and it will contain the Main method
public class Example3 
{
	/* 
    Creating an instance of the Scanner class so we can use it. The name
    we will use is myScanner as this will help us to remember that it is
    something created by us
  */
static Scanner myScanner = new Scanner(System.in);

/*
We now have our main method which will contain all our code.
As we become a better developer, we will not have all our code 
contained within the main method. 
This would be seen as poor code and not fitting in with the design
principle of modular code.
*/

public static void main(String[] args) 
{
	/*
    In this section we will add the variables we will use throughout the program
    code. These are variables that are going to be of a specific data type. Once
    we declare a variable and have said what its data type is, we cannot change
    the variables data type.

    The data type is immutable, it cannot be changed over time. First we will add
    a variable called vehicleManufacturer of data type string.
	*/
	String vehicleManufacturer;
	String vehicleModel;
	String vehicleColour;
	int vehicleAgeInYears;
	double vehicleEstimatedCurrentPrice;
    int vehicleCurrentMileage;
    String dateOfBirthOfMainDriver;
    
    
	System.out.println();
	System.out.println("------- Car Quotation Application -------");
	System.out.println("\tCar\tInsurance\tApplication\n");
	System.out.println();
	System.out.println("Type the vehicle manufacturer and press the enter key");
	System.out.println();

    /*
    The next line of code tells the program to wait for the user to input something.
    When the user presses the Enter key this will indicate that the input has been
    completed. We have also said that we want the data entered at the console to
    be assigned to the variable vehicleManufacturer which we set up earlier with
    a data type of string. What we can now see is that the data entered through the
    console is going to be held in the program as data type String. 
    */
  vehicleManufacturer = myScanner.next();

  /* 
  The next line of code tells the program to display the text between the 
  double quotes ''" and to add on to this text (indicated by the +) the 
  value of the variable called vehicleManufacturer which has been assigned
  the value typed in by the user at the console (Ford). The + means to 
  concatenate the text and the variable, in other words join them
*/
System.out.println("Your car manufacturer is recorded as " +  vehicleManufacturer);

/* 
In the next three lines we display a question for the user, read 
whatever data the user inputs at the console, assign this data to the 
variable called vehicleModel and write out the concatenated text  
*/
System.out.println("What is the model of the vehicle?\n");

vehicleModel = myScanner.next();

System.out.println("You have told us that the vehicle model is " + vehicleModel);

System.out.println("What is the colour of the vehicle?\n");
vehicleColour = myScanner.next();

System.out.println("We have told us that the vehicle colour is " + vehicleColour);

System.out.println("What is the age, in full years, of the vehicle? \n");
vehicleAgeInYears = myScanner.nextInt();

System.out.println("You have told us that the vehicle age is " + vehicleAgeInYears);

System.out.println("What is the estimated value of the vehicle?\n");
vehicleEstimatedCurrentPrice = myScanner.nextDouble();

System.out.println("You have told us that the estimated vehicle price is £ " + vehicleEstimatedCurrentPrice);

System.out.println("What is the current mileage (in km) of the vehicle?\n");
vehicleCurrentMileage = myScanner.nextInt();
System.out.println("You have told us that the vehicle mileage is " + vehicleCurrentMileage + " km");

myScanner.nextLine();

System.out.println("What is the date of birth (dd-mm-yyyy) of the main driver of the vehicle?\n");

dateOfBirthOfMainDriver = myScanner.nextLine();

SimpleDateFormat myDateFormat=new SimpleDateFormat("dd-mm-yyyy");


try 
{
	Date dateOfBirthOfMainDriverInDateFormat = myDateFormat.parse(dateOfBirthOfMainDriver);
	System.out.println("You have told us that the main driver was born on " + dateOfBirthOfMainDriverInDateFormat);
} 
catch (ParseException e) 
{
	// TODO Auto-generated catch block
	e.printStackTrace();
}


System.out.println();
myScanner.close();

  	} // End of main method()
} // End of Example2 class