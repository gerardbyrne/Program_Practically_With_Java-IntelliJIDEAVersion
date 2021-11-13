package labs.module08;

import java.util.Scanner;
/*
  Write a Java console application that will ask the user to input how many new vehicle 
  registration numbers they wish to input. Then continually ask the user to input a vehicle
  registration number until the required number of registrations have been entered. 
  When the vehicle registration number has been entered a message will display the number 
  of entries that have been made.  	
*/
public class LabFourRegistrationNumbers {
	public static void main(String[] args) 
	{	
		Scanner myScanner = new Scanner(System.in);
		
		// Create a variable to hold the number of entries
        int numberOfEntriesBeingMade = 0, numberOfEntriesCompleted = 0;
        
    	// Ask the user to input the number of entries being made
    	System.out.println("How many new vehicle registartions are you entering?");
    	numberOfEntriesBeingMade = myScanner.nextInt();
     myScanner.nextLine();
    	
        while (numberOfEntriesBeingMade > numberOfEntriesCompleted)
        {
        	// Ask the user to input the vehicle registration number
        	System.out.println("What is the vehicle registration number?");
        	String vehicleRegistrationNumber = myScanner.nextLine();
        	
        	// Display a heading for the columns
            System.out.printf("\"You have entered %d vehicle registration number which was %s\n", numberOfEntriesCompleted+1, vehicleRegistrationNumber);
            numberOfEntriesCompleted++;
        }
        System.out.println("Goodbye");
        myScanner.close();
	} // End of main() method
} // End of class LabFourRegistrationNumbers
