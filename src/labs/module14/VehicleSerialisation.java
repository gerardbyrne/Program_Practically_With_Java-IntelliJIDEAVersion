package labs.module14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class VehicleSerialisation {
	public static void main(String[] args) {
		String filename = "vehicleserialised.ser";

		/*********************************************************************
		 * Create an instance of the Vehicle class passing in the initial values that
		 * will be used to set the values of the properties (members, fields) in the
		 * Vehicle object being created.
		 ********************************************************************/
		Vehicle myVehicle = new Vehicle("Ford", "Mondeo", "VIN 1234567890");

		// Save the myVehicle object to the file
		// The file output stream is an output stream for writing data to a File
		FileOutputStream fileOutputStreamForData = null;

		// An ObjectOutputStream writes primitive data types of Java objects to an
		// OutputStream
		ObjectOutputStream objectOutputStreamForData = null;

		// Save the myVehicle object to the file
		try {
			fileOutputStreamForData = new FileOutputStream(filename);

			objectOutputStreamForData = new ObjectOutputStream(fileOutputStreamForData);

			objectOutputStreamForData.writeObject(myVehicle);

			objectOutputStreamForData.close();

			fileOutputStreamForData.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		/********************************************************************
		 * Read the object from file from the serialised file FileInputStream allows us
		 * to read the contents of a file as a stream of bytes
		 ********************************************************************/
		FileInputStream fileInputStreamForData = null;

		/*
		 * An ObjectInputStream deserialises primitive data and objects written using an
		 * ObjectOutputStream
		 */
		ObjectInputStream objectInputStreamForData = null;
		try {
			fileInputStreamForData = new FileInputStream(filename);

			/*
			 * An ObjectInputStream deserialises primitive data and objects written using an
			 * ObjectOutputStream
			 */
			objectInputStreamForData = new ObjectInputStream(fileInputStreamForData);

			/*
			 * The serialised file has been read and we use the readObject() method to get
			 * the object, we then cast the object to a Vehicle object
			 */
			myVehicle = (Vehicle) objectInputStreamForData.readObject();

			objectInputStreamForData.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println(myVehicle);
	} // End of main() method

} // End of VehicleSerialisation class
