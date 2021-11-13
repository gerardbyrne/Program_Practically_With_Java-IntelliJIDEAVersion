package labs.module07;
import java.util.Scanner;
/*Write a Java console application that will ask the user to input a numeric value representing the month the year (1-12) and the number of days in that month will be displayed.*/
public class LabOneDaysInTheMonth 
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		int month, numberOfDaysInMonth = 0;
		
		System.out.print("Enter the numeric number representing the month ");
		month = myScanner.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numberOfDaysInMonth = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numberOfDaysInMonth = 30;
			break;
		case 2:
			numberOfDaysInMonth = 28;
			break;
		default:
			System.out.println("Invalid month! ");
		}
		System.out.println("The number of days in this month is " + numberOfDaysInMonth);
	myScanner.close();
	} // End of main() method
} // End of class LabOneDaysInTheMonth
