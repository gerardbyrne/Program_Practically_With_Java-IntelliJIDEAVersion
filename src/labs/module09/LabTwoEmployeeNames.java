package labs.module09;
import java.util.Scanner;
/*
  Write a Java console application that will ask the user to enter four employee names, store 
  them in an array and then iterate the array to display the employee name.
*/
public class LabTwoEmployeeNames 
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		
		String[] EmployeeNames = new String[4];
		
		for(int employeenumber=0; employeenumber<4; employeenumber++)
		{	
	        // Ask the user to input the employee name
	        System.out.printf("What is the name of employee %d?", employeenumber+1);
	        EmployeeNames[employeenumber] = myScanner.nextLine();        	        
		}
		
		for(String name: EmployeeNames)
		{
			System.out.println(name);
		}
		myScanner.close();
		
	} // End of main() method
} // End of class LabTwoEmployeeNames
