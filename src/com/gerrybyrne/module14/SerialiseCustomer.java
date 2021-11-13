package com.gerrybyrne.module14;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/*********************************************************************
Serialisation is a process to convert an object into a stream of bytes so that the bytes 
can be written into a file. Usually we do this so the file can be used in the storing of 
the data to a database or for sending across a network e.g. to a message queue to form 
part of a transaction process.
De-serialisation is the process of taking the serialised data (file) and returning it to an 
object as defined by the class. 
The Java Serialisation API provides the features to perform serialisation and 
de-serialisation but the class must implement the java.io.Serializable interface to be 
able to serialise data.
*********************************************************************/

public class SerialiseCustomer 
{
	public static void main(String[] args) 
	{
		/*********************************************************************
		Create an instance of the Customer class passing in the initial values that will be 
		used to set the values of the fields (members) in the Customer object being created.		
		As a matter of best practice, when we use Java Serialization, the file name should
		have .ser extension.        
		********************************************************************/
		Customer myCustomerObject = new Customer(123456, 45, "Gerry", "1 Any Street, Belfast, BT1 ANY", 10);

		try{
			// A file output stream is an output stream for writing data to a File
			FileOutputStream fileOutputStreamForData = new FileOutputStream("CustomerSerialisedData.ser");

			// An ObjectOutputStream writes primitive data types of Java objects to an OutputStream
			ObjectOutputStream objectOutputStreamForData = new ObjectOutputStream(fileOutputStreamForData);

			objectOutputStreamForData.writeObject(myCustomerObject);
			
			objectOutputStreamForData.close();

			fileOutputStreamForData.close();

			System.out.println("The serialisation has been completed");
			} // End of try block

	    catch(IOException exceptionGenerated)
	    {
	        System.out.println(exceptionGenerated);
	    } // End of catch block

	} // End of main() method
} // End of SerialiseCustomer class