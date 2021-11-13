package labs.module13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LabTwoReadRegistrationsFromFile 
{
	// Assign the name of the file to be used to a variable.
	static String filePath = "vehicleregistrations.txt";
	
	static String[] vehicleRegistrations = new String[5];
	
	public static void main(String[] args) 
	{
		readRegistrationFromTextFile();
		displayArrayItems();
	}  // End of main method()


	public static void readRegistrationFromTextFile()
	{
	// Set up a string variable to hold the lines read
	String line = null;
	
	int lineCountValue = 0;
	
	// Enclose the code in a try catch to handle errors
    try
    {
    	/* 
    	 Create an instance of the FileReader and call it fileReader
    	 FileReader is used to read text files in the default encoding.
    	*/
    	FileReader fileReader= new FileReader(filePath);

    	/* 
   	 	Create an instance of the BufferedReader and call it bufferedReader
   	 	we should always wrap a FileReader in a BufferedReader
    	*/
       BufferedReader bufferedReader = new BufferedReader(fileReader);

       /* 
  	 	Iterate the buffer and read one line at a time and display it 
        */
        while((line = bufferedReader.readLine()) != null) 
        {
        	vehicleRegistrations[lineCountValue] = line;
        	lineCountValue++;
        }	// End of while iteration
        
        // Close the files.
        bufferedReader.close();
    }  // End of try section of the error handling

    catch(IOException ex) 
    {
        System.out.println("Error reading file '" + filePath + "'");			
    } // End of the catch section of the error handling  
    
	} // End of readRegistrationFromTextFile() method
	
	public static void displayArrayItems()
	{
		// Iterate the sorted array using the foreach construct
		for(String vehicleRegistrations:vehicleRegistrations)
		{
			System.out.println(vehicleRegistrations);
		}
	} // End of displayArrayItems() method
} // End of LabTwoReadRegistrationsFromFile class
