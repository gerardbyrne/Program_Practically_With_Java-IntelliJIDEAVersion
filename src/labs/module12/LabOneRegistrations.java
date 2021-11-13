package labs.module12;

public class LabOneRegistrations 
{
	static String[] vehicleRegistrations = {"ABC 1000", "FEA 2222", "QWA 4444", "FAC 9098", "FEA 3344"};

	public static void main(String[] args) 
	{
		// Call the method that will find the registration starting with the letter F
		allRegistrationsBeginningWithSpecifiedLetter("F");

	} // End of main () method
		
	public static void allRegistrationsBeginningWithSpecifiedLetter(String 
	letterInRegistration)
	{
		// Iterate the array
		for(int counter=0;counter<vehicleRegistrations.length; counter++)
		{
			// Check if the current element of the array starts with the letter passed to the method
			if(vehicleRegistrations[counter].startsWith(letterInRegistration))
			{
				System.out.println(vehicleRegistrations[counter]);
			}
		}
	} // End of allRegistrationsBeginningWithSpecifiedLetter() method

} // End of LabOneRegistrations class
