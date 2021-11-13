package labs.module04;
import java.util.Scanner;
/*
 Write a Java console application that will calculate 
 and display the area of a rectangle using the length 
 and breadth that are input at the console by the user. 
*/
public class LabTwo 
{
public static void main(String[] args) 
{
	Scanner myScanner = new Scanner(System.in);
		
        int length;
        int breadth;
        int area;
        
        System.out.println("What is the length of the rectangle in centimteres");
        length = myScanner.nextInt();
        
        System.out.println("What is the breadth of the rectangle in centimteres");
        breadth = myScanner.nextInt();
        
        area = length * breadth;

        System.out.println("");
        System.out.println("The area of the rectangle is " + area + " square centimetres");
        System.out.println("");
        
        myScanner.close();
     } // This is the end of the method    
} // This is the end of the class