package com.gerrybyrne.module11;

import java.util.Scanner;

public class ClaimDetails 
{
    Scanner myScanner = new Scanner(System.in);
    
    int numberOfClaimsBeingMade;
    
    /*
    We will setup our variables that will be used in the quote application
    The details will be:

    - the repair shop unique id (String)
    - the vehicle insurance policy number (String)
    - the claim amount and (double)
    - the date of the claim (String)  
    */

    String repairShopID;
    String vehiclePolicyNumber;
    double claimAmount;
    String claimDate;
    String message ="";

    /*
    The array is going to hold the data for 2 claims. Each claim has
    four pieces of information. The number of data items is therefore
                    2 multiplied by 4 = 8
    So, we will make the array for this example of size 8.
    Not the best way to do things but fine for now. */
    String[] repairShopClaims = new String[8];
    double totalofallclaims;
    double vatamount;
    int numberOfClaimsEntered = 0;
    int arrayPositionCounter = 0;

    /*
    This is a constructor that accepts one String argument
    The value that is passed to the constructor is used to
    set the value of the field called claimDate.
    The constructor has the same name as the class, it has
    an access modifier of public, it takes an argument of
    data type String as this is the same data type as the
    field, claimDate, that is being initialised, and it does
    not return a value so there is no return type
  */
    public ClaimDetails(String claimDate)
    {
      this.claimDate = claimDate;
    }

    /*
    This is a second constructor that accepts two String
    arguments and the values that are passed to the constructor 
    are used to set the value of the field called claimDate and 
    the field called message.

    The constructor has the same name as the class, it has an 
    access modifier of public, it takes two arguments of data 
    type String as these are the same data types as the fields, 
    claimDate and message, that are being initialised, and it 
    does not return a value so there is no return type.
    As the constructor has two arguments it is different from
    the first constructor
  */
    public ClaimDetails(String claimDate, String message)
    {
      this.claimDate = claimDate;
      this.message = message;
    }	

    // Method 1
    public int HowManyClaimsAreBeingMade()
    {
        /*
            Read the user input for the number of claims being made and
            convert the string value to an integer data type
        */
        System.out.println("How many claims are we wishing to make?\n");

        // numberOfClaimsBeingMade = myScanner.nextInt();
        return myScanner.nextInt();
    } // End of HowManyClaimsAreBeingMade() method

 // Method 2
    public void CurrentValueOfCounter()
    {
        System.out.println("The current value of the counter is :" +
                                        numberOfClaimsEntered + "\n");
    } // End of CurrentValueOfCounter() method
  
 // Method 3
    public String ReadTheRepairShopId()
    {
        // Read the user input for the repair shop id and keep it as a string
        System.out.println("What is our repair shop id?\n");
        repairShopID = myScanner.next();
        
        return repairShopID;

    } // End of ReadTheReparShopId() method

    
 // Method 4
    public void WriteRepairShopIdToTheArray()
    {
        /*
        Write the first input value to the array and then increment the
        value of the arrayPositionCounter by 1.
        */
        repairShopClaims[arrayPositionCounter] = repairShopID;

        arrayPositionCounter++;
    } // End of WriteRepairShopIdToTheArray() method

 // Method 5
    public String ReadTheVehiclePolicyNumber()
    {
        /*
        Read the user input for the vehicle policy number and keep it 
        as a string
        */
        System.out.println("What is the vehicle policy number?\n");
        vehiclePolicyNumber = myScanner.next();

        return vehiclePolicyNumber;
        } // End of ReadTheVehiclePolicyNumber() method

 // Method 6
    public void WriteVehiclePolicyNumberToTheArray()
    {
        /*
        Write the second input value to the array and then increment the
        value of the arrayPositionCounter by 1 
        */
        repairShopClaims[arrayPositionCounter] = vehiclePolicyNumber;

        arrayPositionCounter++;
        } // End of WriteVehiclePolicyNumberToTheArray() method  

 // Method 7
    public double ReadTheAmountBeingClaimed()
    {
    /* 
      Read the user input for the repair amount and convert it 
      to a double
    */
    System.out.println("What is the amount being claimed for the repair?\n");

    claimAmount = myScanner.nextDouble();

    AccumulateClaimAmount(claimAmount);

    return claimAmount;
    } // End of ReadTheAmountBeingClaimed() method

 // Method 8
    public void WriteClaimAmountToTheArray()
    {
    /*
      Write the third input value to the array and then increment the
      value of the arrayPositionCounter by 1. The value read in from
      the console is of data type double and the array holds Strings,
      so a conversion from double to String must be done 
      */
      repairShopClaims[arrayPositionCounter] = Double.toString(claimAmount);

      arrayPositionCounter++;
    } // End of WriteClaimAmountToTheArray() method

 // Method 9
    public String ReadTheRepairDate()
    {
        /*
          Read the user input for the repair date leaving it as a String
        */
        System.out.println("What was the date of the repair?\n");
        claimDate = myScanner.next();
        
        return claimDate;
        }// End of ReadTheRepairDate() method

 // Method 10
    public void WriteRepairDateToTheArray()
    {
        /*
          Write the fourth input value to the array and then increment the
          value of the arrayPositionCounter by 1 
        */
        repairShopClaims[arrayPositionCounter] = claimDate;

        arrayPositionCounter++;
        }// End of WriteRepairDateToTheArray() method

 // Method 11
    public void DisplayAllItemsInTheArray()
    {
        for (String itemInTheClaimsArray: repairShopClaims)
        {
            System.out.println("The item in the array is:\t" + 
                                        itemInTheClaimsArray + "\n");
        }
    } // End of DisplayAllItemsInTheArray() method

 // Method 12
    public double AccumulateClaimAmount(double claimamountpassedin)
    {
        totalofallclaims = totalofallclaims + claimamountpassedin;
        return totalofallclaims;
    } // End of AccumulateClaimAmount method

    
 // Method 13
    public double CalculateVATAmount(double totalvalueofclaimspassedin)
    {
     vatamount = totalvalueofclaimspassedin - (totalvalueofclaimspassedin/1.20);
     return vatamount;
    } // End of CalculateVATAmount method

 // Method 14
    public void DisplayInvoiceReceipt(double totalvalueofclaimspassedin, double vatPassedIn)
    {
    System.out.println("\nInvoice for vehicle repairs\n");
    System.out.println("Nett claim\t" + (totalofallclaims-vatamount) + "\n");
    System.out.println("VAT amount\t" + vatamount + "\n");
    System.out.println("Total amount\t" + totalofallclaims + "\n");
    
    System.out.println(message);
    } // End of DisplayInvoiceReceipt method

// // Method 15
//    public void DisplayInvoiceReceipt(double totalvalueofclaimspassedin,
//                                    double vatPassedIn, String messagePassedIn)
//    {
//    System.out.println("******************************************");
//    System.out.println("\nInvoice for vehicle repairs\n");
//    System.out.println("Nett claim\t" + (totalofallclaims-vatamount) + "\n");
//    System.out.println("VAT amount\t" + vatamount + "\n");
//    System.out.println("Total amount\t" + totalofallclaims + "\n");
//    System.out.println(messagePassedIn);
//    System.out.println("******************************************");
//    } // End of DisplayInvoiceReceipt method

    
} // End of ClaimDetails class