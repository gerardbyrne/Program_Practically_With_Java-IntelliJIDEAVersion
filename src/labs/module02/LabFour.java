package labs.module02;
import java.util.Scanner;
/* Using the same code that you developed for Lab Three, the name and address label, add a  
 statement between of the name and address lines that will require the user to press a key on 
 the keyboard before the display moves to the next line. */
public class LabFour 
{
	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Mr Gerard Byrne");
		System.out.println("Press any key to continue");
		myScanner.nextLine();
		System.out.println("1 Any Street");
		System.out.println("Press any key to continue");
		myScanner.nextLine();
		System.out.println("Any Road");
		System.out.println("Press any key to continue");
		myScanner.nextLine();
		System.out.println("Belfast");
		System.out.println("Press any key to continue");
		myScanner.nextLine();
		System.out.println("BT1 1AN");
	} // This is the end of the method    
} // This is the end of the class