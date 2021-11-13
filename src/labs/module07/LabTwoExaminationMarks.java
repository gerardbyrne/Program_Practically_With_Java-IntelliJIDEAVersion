package labs.module07;
import java.util.Scanner;
/* Write a Java console application that will ask the user to input an examination score (out of 100) and the grade will be displayed. The grade will be determined using the business logic:
	•	marks greater than or equal to 90 receive	Distinction
	•	marks greater than  or equal to 75 receive	Pass
	•	marks greater less than 75 receive	Unsuccessful */
public class LabTwoExaminationMarks 
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		String grade = null;
		System.out.print("Enter your examination mark: ");
		int mark = myScanner.nextInt();

		if (mark > 0 && mark <= 100) 
		{
			if (mark >= 90) 
			{
				grade = "Distinction";
			} 
			else if (mark >= 75) 
			{
				grade = "pass";
			} 
			else 
			{
				grade = "unsuccessful";
			}
			System.out.printf("Your mark of %d has given you a grade of '%s'", mark, grade);
		} 
		else 
		{
			System.out.println("Mark must be between 1 and 100");
		}
		myScanner.close();
	} // End of main() method
} // End of class LabTwoExaminationMarks
