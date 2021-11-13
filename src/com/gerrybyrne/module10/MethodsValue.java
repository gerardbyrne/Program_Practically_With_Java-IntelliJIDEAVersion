package com.gerrybyrne.module10;

import java.util.Scanner;

public class MethodsValue 
{
    static Scanner myScanner = new Scanner(System.in);

    static double totalofallclaims;
    
    static double vatamount;
    
    
    /* 
      The array is going to hold the data for 2 claims. Each claim has four 
      pieces of information. The number of data items is therefore 
      2 multiplied by 4 = 8. So, we will make the array for this example
      of size 8.

      Not the best way to do things but fine for now. 
    */
       static String[] repairShopClaims = new String[8];

       /*
       We will setup our variables that will be used in the quote application
       The details will be: 
         - the repair shop unique id             	(String)
         - the vehicle insurance policy number   	(String)
         - the claim amount and                  	(double)
         - the date of the claim	(String)    
     */       
     static String repairShopID;
     static String vehiclePolicyNumber;
     static double claimAmount;
     static String claimDate;
     static int numberOfClaimsBeingMade;
     static int numberOfClaimsEntered = 0;
     static int arrayPositionCounter = 0;

	public static void main(String[] args) 
	{
		 // Call the method that asks how many claims will be entered
		 numberOfClaimsBeingMade = HowManyClaimsAreBeingMade();


	    /*
	        As we are using a variable in the loop our code is flexible and can be used
	        for any number of claims. An ideal situation and good code.
	    */
	    do {
	        // Call the methods as required
	        CurrentValueOfCounter();
	        repairShopID = ReadTheRepairShopId();

	        WriteRepairShopIdToTheArray();
	        
	        vehiclePolicyNumber = ReadTheVehiclePolicyNumber();	        
	        WriteVehiclePolicyNumberToTheArray();
	        
	        claimAmount = ReadTheAmountBeingClaimed();
	        WriteClaimAmountToTheArray();
	        
	        claimDate = ReadTheRepairDate();
	        WriteRepairDateToTheArray();

	        /* Increment the loop counter by 1 */
	        numberOfClaimsEntered++;
	    } while (numberOfClaimsEntered < numberOfClaimsBeingMade);

	    vatamount = CalculateVATAmount(totalofallclaims);
	    
	    DisplayAllItemsInTheArray();
	    
	    System.out.println("The total amount claimed is:\t" + totalofallclaims);

	    DisplayInvoiceReceipt(totalofallclaims, vatamount);
	    
	    DisplayInvoiceReceipt(totalofallclaims, vatamount, "\tThank you for your claims\n\tthey will be processed today");

	} // End of main method()
	
    /*
    All the methods will be located here. 
    They are outside the main but inside the class 
*/
// Method 1
public static int HowManyClaimsAreBeingMade()
{
/* 
    Read the user input for the number of claims being made and convert
    the string value to an integer data type 
*/
    System.out.println("How many claims are we wishing to make?\n");
    // numberOfClaimsBeingMade = myScanner.nextInt();
    
    return myScanner.nextInt();
} // End of HowManyClaimsAreBeingMade() method

//Method 2
public static void CurrentValueOfCounter()
{
System.out.println("The current value of the counter is :" + 
numberOfClaimsEntered + "\n");
} // End of CurrentValueOfCounter() method

// Method 3
public static String ReadTheRepairShopId()
{
    /* 
        Read the user input for the repair shop id and keep it 
        as a string 
    */
        System.out.println("What is our repair shop id?\n");
        //  repairShopID = myScanner.next();
        
        return myScanner.next();
} // End of ReadTheRepairShopId() method

//Method 4
public static void WriteRepairShopIdToTheArray()
{
 /* 
     Write the first input value to the array and then increment the
     value of the arrayPositionCounter by 1.  
 */
 repairShopClaims[arrayPositionCounter] = repairShopID;
 arrayPositionCounter++;
} // End of WriteRepairShopIdToTheArray() method

//Method 5
public static String ReadTheVehiclePolicyNumber()
{
	/* 
	 Read the user input for the vehicle policy number and keep it 
	 as a string 
	*/
	System.out.println("What is the vehicle policy number?\n");
	// vehiclePolicyNumber = myScanner.next();
	
	return myScanner.next();
} // End of ReadTheVehiclePolicyNumber() method

// Method 6
public static void WriteVehiclePolicyNumberToTheArray()
{
    /* 
      Write the second input value to the array and then increment the
      value of the arrayPositionCounter by 1 
    */
    repairShopClaims[arrayPositionCounter] = vehiclePolicyNumber;
    arrayPositionCounter++;
}    // End of WriteVehiclePolicyNumberToTheArray() method

// Method 7
public static double ReadTheAmountBeingClaimed()
{
	/* 
	    Read the user input for the repair amount and convert it 
	    to a double 
	*/
	System.out.println("What is the amount being claimed for the repair?\n");
	double claimAmountFromUser = myScanner.nextDouble();
	
	AccumulateClaimAmount(claimAmountFromUser);
	
	return claimAmountFromUser;

} // End of ReadTheAmountBeingClaimed() method

// Method 8
public static void WriteClaimAmountToTheArray()
{
    /*
        Write the third input value to the array and then increment the
        value of the arrayPositionCounter by 1 
    */
    repairShopClaims[arrayPositionCounter] = String.valueOf(claimAmount);
    arrayPositionCounter++;
}// End of WriteClaimAmountToTheArray() method

// Method 9
public static String ReadTheRepairDate()
{
    /* 
      Read the user input for the repair date leaving it 
      as a String 
    */
    System.out.println("What was the date of the repair?\n");
    //claimDate = myScanner.next();
    
    return myScanner.next();
} // End of ReadTheRepairDate() method

// Method 10
public static void WriteRepairDateToTheArray()
{
    /* 
      Write the fourth input value to the array and then increment the
     value of the arrayPositionCounter by 1 
    */
    repairShopClaims[arrayPositionCounter] = claimDate;
    arrayPositionCounter++;
}// End of WriteRepairDateToTheArray() method

// Method 11
public static void DisplayAllItemsInTheArray()
{
    for (String itemInTheClaimsArray: repairShopClaims)
    {
        System.out.println("The item in the array is:\t" + itemInTheClaimsArray + "\n");
    }
} // End of DisplayAllItemsInTheArray() method

//Method 12
public static double AccumulateClaimAmount(double claimamountpassedin)
{
	 totalofallclaims = totalofallclaims + claimamountpassedin;
	 return totalofallclaims;
}

// Method 13
public static double CalculateVATAmount(double totalvalueofclaimspassedin)
{
	vatamount = totalvalueofclaimspassedin - (totalvalueofclaimspassedin/1.20);
	return vatamount;
}

// Method 14
public static void DisplayInvoiceReceipt(double totalvalueofclaimspassedin, double vatPassedIn)
{
	System.out.println("\nInvoice for vehicle repairs\n");
	System.out.println("Nett claim\t" + (totalofallclaims - vatamount) + "\n");
	System.out.println("VAT amount\t" +  vatamount + "\n");
	System.out.println("Total amount\t" + totalofallclaims + "\n");
}

// Method 15
public static void DisplayInvoiceReceipt(double totalvalueofclaimspassedin, double vatPassedIn, String messagePassedIn)
{
	 System.out.println("*****************************************");
	 System.out.println("\nInvoice for vehicle repairs\n");
	 System.out.println("Nett claim\t" + (totalofallclaims-vatamount) + "\n");
	 System.out.println("VAT amount\t" +  vatamount + "\n");
	 System.out.println("Total amount\t" + totalofallclaims + "\n");
	
	 System.out.println(messagePassedIn);
	
	 System.out.println("*****************************************");
 }

} // End of MethodsValue class