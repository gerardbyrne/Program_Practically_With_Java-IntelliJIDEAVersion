package com.gerrybyrne.module14;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*********************************************************************
Serialisation is a process to convert an object into a stream of bytes so that the bytes 
can be written into a file. Usually we do this so the file can be used in the storing of 
the data to a database or for sending across a network e.g. to a message queue to 
form part of a transaction process. De-serialisation is the process of taking the 
serialised data (file) and returning it to an object as defined by the class. 
The Java Serialisation API provides the features to perform de-serialisation and 
serialisation and a class must implement java.io.Serializable interface to be able 
to serialise data.
********************************************************************/

public class DeserialiseFileToCustomerObject 
{
	public static void main(String[] args) 
	{
		try
		{ 
			/* Create a Customer object  */
			Customer myCustomer = null;

			/* 
			 FileInputStream allows us to read the contents 
			 of a file as a stream of bytes 
			*/
			FileInputStream fileInputStreamForData = new FileInputStream("CustomerSerialisedData.ser");

			/* An ObjectInputStream deserializes primitive data and objects written using an ObjectOutputStream */
			ObjectInputStream objectInputStreamForData = new ObjectInputStream (fileInputStreamForData);

			 /*
			    The serialised file has been read and we use the readObject() method to get the
			    object, we then cast the object to a Customer object
			 */
			myCustomer = (Customer) objectInputStreamForData.readObject();

			System.out.println("Customer Details");
			System.out.println("Customer Name: " + myCustomer.getCustomerName());
			System.out.println("Customer Age: " + myCustomer.getCustomerAge());
			System.out.println("Customer Account No:" + myCustomer.getCustomerAccountNumber());
			System.out.println("Customer Address:" + myCustomer.getCustomerAddress());
			System.out.println("Customer Years a Customer:  " + myCustomer.getCustomerYearsWithCompany());
		
			objectInputStreamForData.close();

			fileInputStreamForData.close();
			} // End of try block

	    catch(Exception exceptionGenerated)
	    {
	        System.out.println(exceptionGenerated);
	    } // End of catch block

	} // End of main() method
} // End of SerialiseCustomer class