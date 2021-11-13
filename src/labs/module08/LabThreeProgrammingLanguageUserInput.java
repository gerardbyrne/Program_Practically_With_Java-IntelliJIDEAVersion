package labs.module08;
import java.util.Scanner;
/*
 Write a Java console application that will continually ask the user to input the name of
 a programming language and the message "There are many programming languages 
 including (the language input by the user)". The question will stop being asked when the user
 inputs X as the language. The message should not be displayed when X has been entered. 
*/
public class LabThreeProgrammingLanguageUserInput {
	public static void main(String[] args) 
	{	
		Scanner myScanner = new Scanner(System.in);
		// Create a variable to hold the user input
        String programmingLanguageInput = null;
        do
        {
        	// Ask the user to input the programming language
        	System.out.println("What is the programming language?");
        	programmingLanguageInput = myScanner.next().toUpperCase();
        	
        	if(programmingLanguageInput.equals("X"))
        	{
        	// Display an end message
                System.out.println("Goodbye");
        	}
        	else
        	{
        	// Display a heading for the columns
                System.out.printf("\"There are many programming languages including %s\n", programmingLanguageInput);
        	}
        } while (!"X".equals(programmingLanguageInput));
        
        myScanner.close();
	} // End of main() method
} // End of class Lab3ProgrammingLanguageUserInput
