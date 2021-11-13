package labs.module13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LabOneWriteRegistrationsToFile 
{
	static Scanner myScanner = new Scanner(System.in);

	static String vehicleRegistration;
	
	// Assign the name of the file to be used to a variable.
	static String filePath = "vehicleregistrations.txt";
	
	public static void main(String[] args) 
	{
		 /*
		  Create a loop to iterate 5 times asking the user
		  to input a vehicle registration each time.
		*/
		for(int counter = 1; counter <6; counter++)
		{
			System.out.println("Enter vehicle registration number  " +  counter);	
			vehicleRegistration = myScanner.nextLine();
			writeRegistrationToTextFile(vehicleRegistration);
		} // Enter of iteration

	} // End of main method()
	
	public static void writeRegistrationToTextFile(String vehicleRegistration)
	{
		// Enclose the code in a try catch to handle errors
	    try
	    {
	    	/* 
	    	 Create an instance of the FileWriter and call it fileWriter
	    	 FileWriterr is used to write text files in the default encoding.
	    	*/
	    	FileWriter fileWriter = new FileWriter(filePath, true);
	
	    	/* 
	    	 Create an instance of the BufferedReader and call it bufferedReader
	    	 we should always wrap a FileWriter in a BufferedWriter
	    	*/
	        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	
	    	/* 
	    	 Write text to the file using the write() method.
	    	 In Java the write method will not automatically use a newline character
	    	 so we will use the newLine() method to add the new line.
	    	*/
	    	bufferedWriter.write(vehicleRegistration);
	    	bufferedWriter.newLine();  
	
	    	// Close the files.
	    	bufferedWriter.close();
	    }  // End of the try section of the error handling
	
	    catch(IOException ex) 
	    {
	        System.out.println("Error writing file '" + filePath + "'");					
	    } // End of the catch section of the error handling  
	}

} // End of LabOneWriteRegistrationsToFile class
