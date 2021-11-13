// Program Description: 	A Java program to perform arithmetical operations
// Author:              			Gerry Byrne
// Date of creation:    		01/10/2021

package com.gerrybyrne.module06;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class QuoteArithmetic 
{

	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		
		  /* 
	    We will setup our variables that will be used in the mathematical
	    calculation used to produce an insurance quotation for a vehicle.
	    First we will setup the variables that will hold the user input and
	    that will be used in calculating the quote 
	  */
	    int vehicleAgeInYears;
	    int vehicleCurrentMileage;

	  /* 
	    For the quotation we will use 10000 kilometres as a base line for 
	    calculating a mileage factor. If the average kilomteres travelled 
	    per year is above the	base mileage of 10000 the mileage factor will 
	    be above 1, if the average kilomteres travelled per year is the lower
	    than the base mileage of 10000 the mileage factor will be below 1 
	  */
	    double quoteAverageExpectedKilometres = 10000;

	  /* 
	    For the quotation we will use £100 as a base figure (this is just 
	    an example) and this figure will be multiplied by the mileage and 
	    age factors 
	  */
	    double quoteBaseRate = 100.00;

	  /* 
	    For the quotation we will use 10 as a base figure for the age of 
	    the vehicle (this is just an example). If the vehicle is older than
	    10 years, the age factor will be above 1. If the vehicle is younger
	    than 10 years the age factor will be below 1 
	  */
	    int quoteBaseAge = 10;

	  /* This variable will be used to hold the value of the age factor */
	    double quoteAgeFactor;

	  /* 
	    This variable holds the quote amount based on the age factor and 
	    the base rate 
	  */
	    double quoteAgeFactorPremium;

	  /* 
	    This variable holds the quote mileage factor based on the number of 
	    kilometres travelled each year and how the kilometres per year is a
	    ratio of the average expected 10000 kilometres as decided by the 
	    insurance company 
	  */
	    double quoteMileageFactor;

	  /* 
	    This variable will hold the amount for the quote based only on the 
	    mileage factor. The quote also has to take into account the age of 
	    the vehicle
	  */
	    double quoteMileageFactorPremium;

	  /* 
	    This variable will hold the discount amount. A discount will be applied
	    to the quote based on the age of the vehicle. The age of the vehicle is
	    divided into 1 to get the discount. 

	    The decimal value is a representation of the discount and will then be 
	    multiplied by the quote value to get the actual discount in terms of £s 
	  */
	    double quoteDiscount;

	  /* 
	    This variable holds the total of the age factor premium and the mileage 
	    factor premium and will be used by the discount calculation to get the 
	    discount amount 
	  */
	    double quoteAmountForPremium;

	  /* This variable holds the final quotation value, the premium */
	    double quoteFinalAmountForPremium;

		System.out.println();
		System.out.println("------- Car Quotation Application -------");
		System.out.println("\tCar\tInsurance\tApplication\n");
		System.out.println();
		System.out.println("What is the age, in full years, of the vehicle?\n");

	    /* 
	      Perform the conversion from string to int as we will use the age of
	      the vehicle in our calculation and it needs to be numeric 
	    */
	    vehicleAgeInYears = (int)(myScanner.nextInt());

	    /* 
	      Perform the conversion from string to double as we will use the age of
	      the vehicle in our calculation and it needs to be numeric
	      Example: For a 5 year old car the factor is 10/5 = 2
	    */
	    quoteAgeFactor = (double)(quoteBaseAge) / (double)(vehicleAgeInYears);

	    /* The quote amount based on the age is £100 multiplied by the age factor
	        Example £100 * 2 = £200 
	   */
	    quoteAgeFactorPremium = quoteBaseRate * quoteAgeFactor;

        /* The quote amount based on the age is £100 multiplied by the age factor
        Example £100 * 2 = £200 */
    quoteAgeFactorPremium = quoteBaseRate * quoteAgeFactor;
	
    /* Ask the user for the number of kilometres on the odometer */
    System.out.println("What is the current mileage (in km) of the vehicle?\n");
    vehicleCurrentMileage = (int)(myScanner.nextInt());

    /* Calculate the mileage factor. This is based on the number of kilometres
        travelled each year and how the kilometres per year is a ratio of the average
        expected 10000 kilometres as decided by the insurance company 
        Example: For a 5 year old car with 60000km the factor is 
                       (60000/5)/10000 = 12000/10000 = 1.2
    */
    quoteMileageFactor = (vehicleCurrentMileage / vehicleAgeInYears) / quoteAverageExpectedKilometres;

//    quoteMileageFactor += 1;
    quoteMileageFactor = Math.sqrt(quoteMileageFactor);
    
    /* The quote amount based on the mileage is £100 multiplied by the mileage factor
     * Example £100 * 1.2 = £120 */
    quoteMileageFactorPremium = quoteBaseRate * quoteMileageFactor;

    /* 
    Calculate the quotation based on a base rate of £100. This base rate is 
    multiplied by the vehicle age factor and by the vehicle mileage factor. 
    So, the older the vehicle the cheaper the quote or the neour the vehicle the 
    more expensive the quote.
    The more kilometres travelled on average per year the more expensive the quote or 
    the less kilometres travelled on average per year the cheaper the quote 
    Example: For a 5 year old car, 60000km, age factor is 2 and mileage factor is 1.2
   The quote is (£100 * 2) + (£100 * 1.2 )  = £200 + £120 = £320
   */

	/* The quote amount based on the age premium plus the mileage premium  
	    Example £2000 + £120 = £320 
	*/
	quoteAmountForPremium = quoteAgeFactorPremium + quoteMileageFactorPremium;

    /* 
      	The discount amount is based on the age of the vehicle   
    	Example 5 year old vehicle gives discount of 1/5 = 20 percent 
    */
	quoteDiscount = (1 /(double) vehicleAgeInYears) * quoteAmountForPremium;

    /* The final quote with the discount applied    
    Example 5 year old vehicle gives discount of 100/5 = 20 percent
    20% of £320 is £64. So, the actual amount is £320 - £64 = £256 
     */
	quoteFinalAmountForPremium = quoteAmountForPremium - quoteDiscount;

    System.out.println("************************************************\n");
    System.out.println("Quotation price is for 1 year starting today    \n");
    System.out.println("************************************************\n");

    System.out.println("The age of the vehicle is: \t\t" + vehicleAgeInYears);

//    System.out.println("The age factor is for this vehicle is: \t" + quoteAgeFactor);
    System.out.format("The age factor for this vehicle is: \t%.2f" , quoteAgeFactor);

    System.out.println();
    System.out.println("The average kilometres per year is: \t" +  (vehicleCurrentMileage / vehicleAgeInYears));
    
//    System.out.println("The mileage factor is :\t\t\t" + quoteMileageFactor);
    System.out.format("The mileage factor is :\t\t\t%.16f" , quoteMileageFactor);
    System.out.println();

//    System.out.println("The quotation is :\t\t\t£" + quoteAmountForPremium);
    System.out.format("The quotation is :\t\t\t£%.2f" , quoteAmountForPremium);
    System.out.println();

//    System.out.println("The discount is :\t\t\t£" + quoteDiscount);
    System.out.format("The discount is :\t\t\t£%.2f" , quoteDiscount);
    System.out.println();

//    System.out.println("The final discounted amount is :\t£" + quoteFinalAmountForPremium);
    System.out.format("The final discounted amount is :\t£%.2f%n" , quoteFinalAmountForPremium);

    System.out.println("************************************************\n");

    myScanner.next();
    myScanner.close();

  	} // End of main method()
	
} // End of QuoteArithmetic class