package com.gerrybyrne.module13;

import java.io.*;

public class ReadFile 
{
	public static void main(String[] args) 
	{
		// Assign the name of the file to be used to a variable.
		String filePath = "txtOutputFile.txt";

		// Set up a string variable to hold the lines read
		String line = null;

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

           /*  Iterate the buffer and read one line at a time and display it */
	        while((line = bufferedReader.readLine()) != null) 
	        {
	            System.out.println(line);
	        }	// End of while iteration

	        // Close the bufferedReader
	        bufferedReader.close();
	        
	        // Close the fileReader
	        fileReader.close();
        }  // End of try section of the error handling

        catch(IOException ex) 
        {
            System.out.println("Error reading file '" + filePath + "'");			
        } // End of the catch section of the error handling        

	} // End of main method()
} // End of ReadFile class