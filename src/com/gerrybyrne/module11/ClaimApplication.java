package com.gerrybyrne.module11;

import java.time.LocalDate;

public class ClaimApplication 
{
	public static void main(String[] args) 
	{
	      int numberOfClaimsEntered = 0;
	      double vatamount;

	   // Read the date from the computer clock
	      LocalDate localDate = LocalDate.now();    

	      String myDateString = localDate.toString();
	      
	      /*
	      Create an instance (copy) of the ClaimDetails class calling
	      it myClaimDetailsInstance. When we use the new keyword with
	      the ClaimDetails() we are calling the constructor method and
	      in this case we have no values between the brackets () so we
	      are not passing any values to the constructor. Obviously then
	      the constructor is the default constructor or the programmer
	      developed constructor is expecting no parameters
	      */
	      // ClaimDetails myClaimDetailsInstance = new ClaimDetails(myDateString);
//	      ClaimDetails myClaimDetailsInstance = new ClaimDetails(myDateString,
//	    		  "\tThank you for our claims \n\tthey will be processed today");

	      ClaimDetails myClaimDetailsInstance = new ClaimDetails(myDateString);
	      
        /*
        Create an instance (copy) of the ClaimDetails class calling
        it myClaimDetailsInstance. When we use the new keyword with
        the ClaimDetails() we are calling the constructor method and
        in this case we have no values between the brackets () so we
        are not passing any values to the constructor. Obviously then
        the constructor is the default constructor or the programmer
        developed constructor is expecting no parameters 
        */
    //ClaimDetails myClaimDetailsInstance = new ClaimDetails();

    int numberOfClaimsBeingMade = myClaimDetailsInstance.HowManyClaimsAreBeingMade();
    
    /*
    As we are using a variable in the loop our code is flexible and can
    be used for any number of claims. 
    An ideal situation and good code.
    */
	do 
	{
		// Call the methods as required
		myClaimDetailsInstance.ReadTheRepairShopId();
		myClaimDetailsInstance.WriteRepairShopIdToTheArray();
		myClaimDetailsInstance.ReadTheVehiclePolicyNumber();
		myClaimDetailsInstance.WriteVehiclePolicyNumberToTheArray();
		myClaimDetailsInstance.ReadTheAmountBeingClaimed();
		myClaimDetailsInstance.WriteClaimAmountToTheArray();
		// myClaimDetailsInstance.ReadTheRepairDate();
		myClaimDetailsInstance.WriteRepairDateToTheArray();	
		
		/* Increment the loop counter by 1 */
		numberOfClaimsEntered++;

	} while (numberOfClaimsEntered < numberOfClaimsBeingMade);

	   for(String item:myClaimDetailsInstance.repairShopClaims)
	   {
	    	System.out.println(item);
	   }
	   
	vatamount = myClaimDetailsInstance.CalculateVATAmount(myClaimDetailsInstance.totalofallclaims);
	
//	myClaimDetailsInstance.DisplayInvoiceReceipt(myClaimDetailsInstance.totalofallclaims, vatamount, "\tThank you for your claims \n\tthey will be processed today");
	
	myClaimDetailsInstance.DisplayInvoiceReceipt(myClaimDetailsInstance.totalofallclaims, vatamount);
	
	} // End of main method()
} // End of ClaimApplication class