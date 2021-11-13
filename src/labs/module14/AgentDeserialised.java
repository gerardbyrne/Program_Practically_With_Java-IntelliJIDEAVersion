package labs.module14;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AgentDeserialised {
	public static void main(String[] args) 
	{
		String filename = "agentserialised.ser";

		/* Create a Customer object */
		AgentEntity myAgentEntity = null;
		/************************************************************************ 
      Read the object from file from the serialised file
      FileInputStream allows us to read the contents of a file as a stream of bytes 
		 ***********************************************************************/
		FileInputStream fileInputStreamForData = null;

		/* 
		 * An ObjectInputStream deserialises primitive data and objects written using an 
	ObjectOutputStream 
		 */
		ObjectInputStream objectInputStreamForData = null;

		try {     	 
			fileInputStreamForData = new FileInputStream(filename);

			/* 
			 * An ObjectInputStream deserialises primitive data and objects written using an 
	ObjectOutputStream 
			 */
			objectInputStreamForData = new ObjectInputStream (fileInputStreamForData);

			/*
	        The serialised file has been read and we use the readObject() method to get the
	        object, we then cast the object to a Vehicle object
			 */
			myAgentEntity = (AgentEntity) objectInputStreamForData.readObject();

			objectInputStreamForData.close();
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println(myAgentEntity);
	} // End of main() method
} // End of AgentDeserialised class
