package labs.module05;

import java.util.Scanner;
/* Write a Java console application that will calculate and display the total score for two tests 
	that a student undertakes the average of the two scores the two scores will be input by the 
	user at the console and will be accepted as String values by the program code. */
public class LabTwo 
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		// Declare the variables
		int scoreInTestOne , scoreInTestTwo , totalScoreForTwoTests ;
		double averageOfTheTwoScores ;
			
        // Input - accept user input for test score one
        System.out.println("What was the score for test one? ");
        scoreInTestOne = Integer.parseInt(myScanner.next());		
        System.out.println("What was the score for test two? ");
        scoreInTestTwo = Integer.parseInt(myScanner.next());		
		
        // Process - calculate the total the number of games played
		   totalScoreForTwoTests = scoreInTestOne + scoreInTestTwo ;
		   // Process - calculate the average the two scores 
		   averageOfTheTwoScores = totalScoreForTwoTests / 2.0 ;
		
        // Output the details
        System.out.println("");
        System.out.printf("The total of the two scores is %d " , totalScoreForTwoTests);
        System.out.println("\n\n");
        System.out.printf("The average mark for the two tests is %.2f", 
			averageOfTheTwoScores);
        myScanner.close();
     } // This is the end of the method    
} // This is the end of the class
