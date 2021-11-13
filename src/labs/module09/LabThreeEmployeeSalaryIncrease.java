package labs.module09;

import java.text.DecimalFormat;

/*
 Write a Java console application that will read an array which contains a list of 
 staff alongside their salary, increase the salary by 10% (1.10) and write the new 
 details to a new array. 
 The array is:
 {"Gerry Byrne", "20000.00", "Peter Johnston", "30000.00", "Ryan Jones", "50000.00"}

 The new array will be
 {"Gerry Byrne", "22000.00", "Peter Johnston", "33000.00", "Ryan Jones", "55000.00"}

 Once the new array has been written use an iteration to display each 
 employee in column one and their new salary in column two.
 */
public class LabThreeEmployeeSalaryIncrease 
{

	public  static void  main ( String[] arguments ) 
	{			
		DecimalFormat myDecimalFormat=new DecimalFormat("#.00");

		// Declare and initialise the array of employees and their salary
		String []	employeeAndSalary  =  {"Gerry Byrne", "20000.00", "Peter Johnston", "30000.00", "Ryan Jones", "50000.00"};

		// Declare an array of employees and their new salary
		String []	employeeAndSalaryWithIncrease  =  new String[employeeAndSalary.length];

		// Iterate the array and find every second value which is the salary
		for ( int counter = 0 ; counter < employeeAndSalary.length ; counter+=2 ) 
		{
			employeeAndSalaryWithIncrease[counter] = employeeAndSalary[counter];
			// Create a variable of type Double (wrapper class) not double
			Double newSalary = Double.parseDouble(employeeAndSalary[counter+1]) * 1.10;

			// Write the employee name to the new array
			employeeAndSalaryWithIncrease[counter] =  employeeAndSalary[counter];

			// Write the Double number to the array comverting it to a String
			employeeAndSalaryWithIncrease[counter+1] = 
					myDecimalFormat.format(newSalary).toString();
		}

		System.out.print("Employee name" + "\t\t" + "New Salary" + "\n");
		// Compare all the other numbers to the maximum
		for ( int counter = 0 ; counter < employeeAndSalaryWithIncrease.length ; counter+=2 ) 
		{
			// Display the Employee name and their new salary
			System.out.printf("%s \t\t %s\n", employeeAndSalaryWithIncrease[counter], 
					employeeAndSalaryWithIncrease[counter+1] ) ;
		}

	} // End of main() method
} // End of class LabThreeEmployeeSalaryIncrease
