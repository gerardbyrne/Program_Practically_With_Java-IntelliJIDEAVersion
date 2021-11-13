package labs.module04;
import java.util.Scanner;
/* 
Using the code from Lab Two write a Java console application that will 
calculate and display the volume of a cuboid using the length, breadth 
and height that are input at the console by the user. 
The formula for the volume of a cuboid is length * breadth * height.
*/
public class LabThree 
{
public static void main(String[] args) 
{
		Scanner myScanner = new Scanner(System.in);
        int length;
        int breadth;
        int height;
        int volume;
        
        System.out.println("What is the length of the cuboid in centimteres");
        length = myScanner.nextInt();
        
        System.out.println("What is the breadth of the cuboid in centimteres");
        breadth = myScanner.nextInt();

        System.out.println("What is the height of the cuboid in centimteres");
        height = myScanner.nextInt();
        
        volume = length * breadth * height;

        System.out.println("");
        System.out.println("The volume of the cuboid is " + volume + " cubic centimetres");
        System.out.println("");
        myScanner.close();
     } // This is the end of the method    
} // This is the end of the class
