package labs.module14;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AgentSerialisation 
{
	public static void main(String[] args) 
	{
		String filename = "agentserialised.ser";

		/*********************************************************************
		Create an instance of the AgentEntity class passing in the initial values that will be used 
		to set the values of the properties in the AgentEntity object being created.        
		 ********************************************************************/
		AgentEntity myAgentEntity = new AgentEntity(190091, 25, "Gerry Byrne", 
				"01/01/1970", 50000.00);

		// Save the myAgentEntity object to the file
		// The file output stream is an output stream for writing data to a File
		FileOutputStream fileOutputStreamForData = null;

		// An ObjectOutputStream writes primitive data types of Java objects to an OutputStream
		ObjectOutputStream objectOutputStreamForData = null;

		// Save the myAgentEntity object to the file
		try 
		{   
			fileOutputStreamForData = new FileOutputStream(filename);

			objectOutputStreamForData = new ObjectOutputStream(fileOutputStreamForData);

			objectOutputStreamForData.writeObject(myAgentEntity);

			objectOutputStreamForData.close();

			fileOutputStreamForData.close();
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	} // End of main() method
} // End of AgentSerialisation class
