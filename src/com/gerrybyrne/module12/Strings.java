package com.gerrybyrne.module12;

public class Strings 
{

	public static void main(String[] args) 
	{
		/*
		 A String is an object in Java and when we created classes we saw that we
		 instantiated the class we used the new keyword. Here we have not created any
		 string object using the new keyword. However the compiler will perform the 
		 task for us and it will create a String object from the String literal. 
		 In this example Home Insurance is only created once and even
		 though we have 2 string instances there is only one string object.
		 */
		String myVehicleInsurance = "Vehicle Insurance";		
		String myHomeInsurance = "Home Insurance";
		String myInsurance = "Home Insurance";

		/*
		 Let us now recreate the same example but using the new keyword. We will need
		 to use different variable names. Using the new keyword causes the compiler to
		 create two different objects in memory, each object having the same string saying
		Home Insurance.
		 */
		String myVehicleInsuranceNew = new String("Vehicle Insurance");
		String myHomeInsuranceNew = new String("Home Insurance");
		String myInsuranceNew = new String("Home Insurance");

		String myVehicleRegistration = new String("ZER 7890");

		/* 
		 Use the charAt() method from the String class to find 
		 which character is at a specific position
		 */
		System.out.println("The first character is: " + myVehicleRegistration.charAt(0));

		/* 
		  Use the substring() method from the String class to find the
		   first 3 characters of the myVehicleRegistration object.
		   Remember substring is inclusive of the char at the first 
		   position but exclusive of the char at the end position 
		 */

		System.out.println("The first 3 characters are: " +myVehicleRegistration.substring(0, 3));

		/* 
		 Use the substring() method from the String class to find the
		 last 4 characters of the myVehicleRegistration object.
		 */
		System.out.println("The last 4 characters are: " +myVehicleRegistration.substring(4, 8));

		/* 
		Use the length() method from the String class to find the
		number of characters in the myVehicleRegistration object.
		 */
		System.out.println("The number of characters is: " +myVehicleRegistration.length());

		// Create an array of String objects
		String[] myVehicleRegistrations =new String[] {"ZER 7890","ZAC 7124", "ARC 3330"};

		for(String registration: myVehicleRegistrations)
		{
			if(registration.startsWith("C",2))
			{
				//System.out.printf("The registration %s starts with the letter Z %n", registration);
				System.out.printf("The registration %s has the letter C at position 3 %n", 
						registration);
			}
			else
			{
				System.out.printf("The registration %s does not have the letter C at position 3 %n", 
						registration);			
			}
		} // End of for each iteration
		
        // Iterate the array and split the items as they are read     
		for(String registration: myVehicleRegistrations)
        {
			// Create an array to hold the 2 parts of the vehicle registration
			String[] splitRegistration = new String[2];

			// Split the array at the space
			splitRegistration = registration.split(" ");

            System.out.printf("Part 0 is %s  %n", splitRegistration[0]);
            System.out.printf("Part 1 is %s  %n", splitRegistration[1]);

        } // End of for each iteration for splitting at the space character

		// Create a new array of String objects
		String[] myMixedVehicleRegistrations =new String[] {"ZER 7890","ZAC_7124", "ARC,3330"};

		// Iterate the array and split the items as they are read		
		for(String mixedRegistrationPart:myMixedVehicleRegistrations)
		{
			// Create an array to hold the 2 parts of the vehicle registration
			String[] splitMixedRegistration = new String[2];
			
			// Split the array at the underscore, space or ,
			splitMixedRegistration =  mixedRegistrationPart.split("[_ ,]");
			
			System.out.printf("Part 0 is %s  %n", splitMixedRegistration[0]);
			System.out.printf("Part 1 is %s  %n", splitMixedRegistration[1]);

		} // End of for each iteration for splitting at the underscore, space or , character

		// Create a new array of String objects
		String[] myDuplicateVehicleRegistrations =new String[] {"ZER 7890","ZAC_7124", "ARC,3330", "ZER 7890", "ARC,3330", "zer 7890"," zac_7124"};

		// Iterate the array and split the items as they are read		
		for(int counter =0; counter < myDuplicateVehicleRegistrations.length; counter++)
		{
			for(int innercounter =counter + 1; innercounter <
					myDuplicateVehicleRegistrations.length; innercounter++)
			{
				if(myDuplicateVehicleRegistrations[counter].compareTo(myDuplicateVehicleRegistrations[innercounter]) == 0)
				{
					System.out.printf("%s is the same String as array index %d %s %n", 
							myDuplicateVehicleRegistrations[counter], innercounter, 
							myDuplicateVehicleRegistrations[innercounter]);
				}	
			} // End of for iteration inner loop
		} // End of for each iteration outer loop

		// Iterate the array and compare the items, ignoring the case, as they are read	
		for(int counter =0; counter < myDuplicateVehicleRegistrations.length; counter++)
		{
			for(int innercounter =counter + 1; innercounter <
					myDuplicateVehicleRegistrations.length; innercounter++)
			{
				if(myDuplicateVehicleRegistrations[counter].compareToIgnoreCase(myDuplicateVehicleRegistrations[innercounter]) == 0)
				{
					System.out.printf("Ignoring case %s at index %d is the same String as array index %d %s %n", 
							myDuplicateVehicleRegistrations[counter], counter, innercounter, 
							myDuplicateVehicleRegistrations[innercounter]);
				}	
			} // End of for iteration inner loop
		} // End of for each iteration outer loop

		// Iterate the array and convert the items to upper case as they are read		
		for(int counter =0; counter < myDuplicateVehicleRegistrations.length; counter++)
		{
			for(int innercounter =counter + 1; innercounter < myDuplicateVehicleRegistrations.length; innercounter++)
			{
				if(myDuplicateVehicleRegistrations[counter] .toUpperCase().compareTo(myDuplicateVehicleRegistrations[innercounter].toUpperCase()) == 0)
				{
					System.out.printf("With Upper Case %s at index %d is the same String as array index %d %s %n", 
							myDuplicateVehicleRegistrations[counter], counter, innercounter, 
							myDuplicateVehicleRegistrations[innercounter]);
				}	
			} // End of for iteration inner loop
		} // End of for each iteration outer loop

		String myInsuredPerson = new String(" Gerry Byrne,");	
		String myWelcome = new String("thank you for taking out insurance with us.");
		String myOfferDetails = myInsuredPerson.concat(" ").concat(myWelcome).concat(" You now have full ").concat(myVehicleInsuranceNew).concat(". ");		
		System.out.printf("%s", myOfferDetails);

		String trimmedMyOfferDetails = myOfferDetails.trim();
		System.out.printf("%n%s", trimmedMyOfferDetails);

		String name = new String("Gerry Byrne");
		String newNameReplace = name.replace('e', 'E');
		System.out.printf("%n%s", newNameReplace);

		String newNameReplaceAll = name.replaceAll("e", "ER");
		System.out.printf("%n%s", newNameReplaceAll);

		String newNameReplaceFirst = name.replaceFirst("e", "E");
		System.out.printf("%n%s", newNameReplaceFirst);

	} // End of main method()
} // End of Strings class
