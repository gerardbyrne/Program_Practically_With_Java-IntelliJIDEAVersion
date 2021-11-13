package labs.module05;

import java.util.Scanner;
/*
 Write a Java console application that will calculate and display 
 the number of points accumulated by a sports team during their season. 
 The program should ask the user to input the number of games won, 
 the number of games drawn, and the number of games lost. The program 
 should total the number of games played and calculate the number of 
 points won based on the facts that 3 points are given for a win, 
 1 point is given for a draw and 0 points are given for a lost game. 
 Display the number of games played and the number of points accumulated.
*/
public class LabOne 
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
        
		// Declare the variables 
        int numberOfGamesWon, numberOfGamesDrawn, numberOfGamesLost;
        int numberOfGamesPlayed, numberOfPointsAccumulated;
        
        // Input - accept user input
        System.out.println("How many games were won this season? ");
        numberOfGamesWon = myScanner.nextInt();
        
        System.out.println("How many games were drawn this season? ");
        numberOfGamesDrawn = myScanner.nextInt();
        
        System.out.println("How many games were lost this season? ");
        numberOfGamesLost = myScanner.nextInt();
        
        // Process - total the number of games played
        numberOfGamesPlayed = numberOfGamesWon +  numberOfGamesDrawn + 
		numberOfGamesLost;
        
        // Calculate the number of points based on 3 points for a win
        // 1 point for a draw and 0 points for a lost game
        numberOfPointsAccumulated = (3 * numberOfGamesWon) + numberOfGamesDrawn;
        
        // Output the details
        System.out.println("");
        System.out.printf("The number of games season was %d " , numberOfGamesPlayed);
        System.out.println("\n\n");
        System.out.printf("The number of points was %d", numberOfPointsAccumulated);
        
        myScanner.close();

     } // This is the end of the method    
} // This is the end of the class
