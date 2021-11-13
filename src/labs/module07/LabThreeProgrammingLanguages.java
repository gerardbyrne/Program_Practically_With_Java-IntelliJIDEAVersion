package labs.module07;
import java.util.Scanner;
/*
 Write a Java console application that will ask the user to input the name of a programming
  language (Java, Python or C#) and a short description of the language will be displayed. 
 Use an if-else construct and be careful when comparing the String values.
 */
public class LabThreeProgrammingLanguages 
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		String userInputLanguage = null;
		
		System.out.println("Enter the programming: ");
		 userInputLanguage = myScanner.next();

		if (userInputLanguage.equalsIgnoreCase("Java")) 
		{
			System.out.println("Java is a programming language and computing platform first "
			+ "\n" + " released by Sun Microsystems in 1995. There are lots of applications "
			+ "\n" + " and websites that will not work unless you have Java installed, and "
			+ "\n" + " more are created every day.");
		}
			else if (userInputLanguage.equalsIgnoreCase("C#")) 
			{
			System.out.println("C# pronounced as (See Sharp) is a modern, "
			+ "\n" + "object-oriented, and type-safe programming language. "
			+ "\n" + "C# enables developers to build many types of secure "
			+ "\n" + "and robust applications that run in the .NET ecosystem.");
			} 
			else if (userInputLanguage.equalsIgnoreCase("Python")) 
			{
			System.out.println("Python is an interpreted, object-oriented, high-level "
			+ "\n" + "programming language with dynamic semantics. ");
			}
		else 
		{
			System.out.println("Sorry, this is not one of our programming languages");
		}
		myScanner.close();
	} // End of main() method
} // End of class LabThreeProgrammingLanguages
