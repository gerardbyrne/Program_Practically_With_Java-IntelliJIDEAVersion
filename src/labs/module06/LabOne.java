package labs.module06;
import java.util.Scanner;
/*
Write a Java console application that will simulate a simple payroll program. 
The program should:

•	allow a user to input the number of hours worked by an employee 
•	allow a user to input the rate per hour which the employee is paid
•	calculate the gross wage (the hours worked times the rate per hour)
•	calculate the amount of national insurance to be deducted when the 
	rate of national insurance is 5% of the gross wage
•	calculate the amount of tax to be deducted when the rate of income 
	tax is 20% of the wage after the national insurance has been deducted
•	display a simplified wages slip showing the gross wage, the deductions 
	and the nett pay

	Sample Output using test data
	How many hours were worked? 40
	What was the rate per hour? £ 10.00
	
	Payslip
	Hours	40
	Rate 	£10.00
	Gross	£400.00
	National Insurance Deductions:	£20.00
	Income Tax 	£76.00
	Net Pay	£304.00
*/

public class LabOne
{ 
// Define main() method
 public static void main(String[] args)
 {
	 Scanner myScanner = new Scanner(System.in);
	 
     // Declare variables required
     int hoursWorked;
     double  hourlyRate, nettPay, grossPay, nationalInsuranceDeductions,
	incomeTaxDeductions;
     double  nationalInsuranceRate =0.05, incomeTaxRate=0.2;
     
     // Input Hours Worked 
     System.out.println("\n\nEnter Hours Worked: ");
     hoursWorked = myScanner.nextInt();
     
     // Input Hourly Rate
     System.out.println("\n\nEnter Hourly Rate: ");
     hourlyRate = myScanner.nextDouble();
   
     // Process - calculate the nett pay
     grossPay = hoursWorked * hourlyRate;
     
     nationalInsuranceDeductions = grossPay * nationalInsuranceRate;
     
     incomeTaxDeductions = (grossPay - nationalInsuranceDeductions) * incomeTaxRate;
     
     nettPay = grossPay - nationalInsuranceDeductions - incomeTaxDeductions;
      
     // Output simple payslip
     System.out.println("\n\nPAYSLIP");
     System.out.println("=======");
     System.out.printf("\nHours Worked\t\t %d", hoursWorked);
     System.out.printf("\nHourly Rate \t\t £%.2f", hourlyRate);
     System.out.printf("\nGross Pay \t\t £%.2f", grossPay);
     System.out.printf("\nNational Insurance \t £%.2f",  nationalInsuranceDeductions);
     System.out.printf("\nIncome Tax \t\t £%.2f", incomeTaxDeductions);
     System.out.println("\n\t\t\t =======");
     System.out.printf("Nett Pay \t\t £%.2f", nettPay);
     System.out.println("\n\t\t\t =======");
     
     myScanner.close();
 }  //  End of main() method
}  //  End of class definition
