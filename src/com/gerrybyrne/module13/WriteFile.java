package com.gerrybyrne.module13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) 
	{
		// Assign the name of the file to be used to a variable.
		String filePath = "txtOutputFile.txt";

		// Enclose the code in a try catch to handle errors
		try
		{
			/* 
        	 Create an instance of the FileWriter and call it fileWriter
        	 FileWriter is used to write text files in the default encoding.
			 */
			FileWriter fileWriter = new FileWriter(filePath);

			/* 
       	 Create an instance of the BufferedWriter and call it bufferedWriter
       	 we should always wrap a FileWriter in a BufferedWriter
			 */
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			/* 
      	 Write text to the file using the write() method.
      	 In Java the write method will not automatically use a newline character
      	 so we will use the newLine() method to add the new line.
			 */
			bufferedWriter.write("Welcome to Java File handling");
			bufferedWriter.newLine();
			bufferedWriter.write("We can write text to files and databases");
			bufferedWriter.newLine();
			bufferedWriter.write("We can read text from files and databases");    

			// Close the BufferedWriter.
			bufferedWriter.close();
			
			// Close the FileWriter.
			fileWriter.close();
		}  // End of the try section of the error handling

        catch(IOException ex) 
        {
            System.out.println("Error writing file '" + filePath + "'");			
        } // End of the catch section of the error handling        

	} // End of main method()
} // End of WriteFile class