package com.gerrybyrne.module07;

import java.util.Scanner;

public class SwitchStringVehicleModel 
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);

	    /*
	      In this section we declare the two variables of data type
	      String that we will use throughout the program code.
	    */
	    String vehicleModel;
	    String vehicleManufacturer;

	    System.out.println();
	    System.out.println("What is the model of the vehicle?\n");

	    /*
	      In this section we read the user input from the console.
	      The console input is by default a String data type which
	      means we can directly assign the value to the String
	      variable called vehicleModel.
	    */
	    vehicleModel = myScanner.next();

	    /*
	      In this section we use the String variable called vehicleModel
	      in the case statement to decide which block of code will be
	      executed. The blocks of code therefore will be based on the
	      model of the vehicle and the code will set the value of the
	      variable called vehicleManufacturer.
	    */
//	    switch (vehicleModel)
	    switch (vehicleModel.toUpperCase())
	    {
	        case "Edge":
	        case "Fiesta":
	        case "Focus":
	        case "Kuga":
	        case "Mondeo":
	        case "Mustang":
	            vehicleManufacturer = "Ford";
	            break;
	        case "Astra":
	        case "Corsa":
	        case "Insignia":
	        case "Viva":
	            vehicleManufacturer = "Vauxhall";
	            break;
	        case "Altima":
	        case "Juke":
	        case "Sentra":
	            vehicleManufacturer = "Nissan";
	            break;
	        case "C-Class":
	        case "E-Class":
	        case "S-Class":
	        case "GLA":
	        case "GLC":
	        case "GLE":
	            vehicleManufacturer = "Mercedes Benz";
	            break;
	        default:
	            vehicleManufacturer = "unknown";
	            break;
	    } // End of Switch statement

	    /*
	      Here we will write the same message to the console in two different
	      ways so we can use a new technique.

	      In this statement we are writing data to the console in our normal
	      way with a concatenated (joined) String and this works fine
	    */
	    System.out.println("\nThe " + vehicleModel + " manufacturer is " + vehicleManufacturer);

	    /*
	      In this statement we are writing data to the console in a different
	      way using a String which has the %s 'placeholder'. Each place holder
	      has a position and this position represents the position of the
	      variable name in the comma separated list at the end of the statement.

	      The example below effectively means:
	      System.out.println("\nThe vehicleModel manufacturer is
	      vehicleManufacturer ");

	      This new format is very neat and means we do not have to keep opening
	      and closing the double quotes and having the concatenation + symbol.
	    */
	 System.out.format("\nThe %s manufacturer is %s ",vehicleModel.toUpperCase(),vehicleManufacturer);

	 myScanner.close();
	 
	} // End of main method()
} // End of SwitchStringVehicleModel class