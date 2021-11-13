package labs.module04;
import java.util.Scanner;
/*
 The class holds variables (properties) and methods. In this example there will only be a main 
  method. This is where the application will start running. 
*/
public class LabFour 
{
	/*
	The main method is where we will add all our variables and write all our code. 
	This is only suitable as we are learning to program but as we develop our skills we will
	modularise our code i.e. we will break the code up into small methods each method having
only one role or  function. We might not want to declare all our variables in the main method, we may want them to be declared inside the smaller methods (modules). This is
where we will begin to  understand about the scope of variables.
	 */
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		
		/*
		 A credit card will have a 16-digit number on the front of the card. We may
		 wish to include hyphens or spaces between each set of 4 digits. For this
		 reason, we are making the data type string.
		 */
		String creditCardNumber;

		/*
		 The month in which the credit card will expire will be entered as a number
		 which will be from 0-12 based on the calendar months. This means we can use a
		 byte. The byte data type has a minimum value of 0 and a maximum value of 255.
		 As a month cannot be a negative, we should use a byte data type.
		 */
		byte expiryMonth;

		/*
		 The year of expiry only requires the last two digits of the year, it will not
		 require the two digits of the century. We should use a byte data type as 0 –
		 255 will be an acceptable range for the year.
		 */
		byte expiryYear;

		/*
		 The card issue number is a one or two digit number on the front of the card.
		 Some credit cards will not have an issue number. For this example we should
		 expect the user to enter a 0 if there is no issue number.
		 */
		byte issueNumber;

		/*
		 A card verification code (CVC) is also known as the card verification value
		 (CVV) and is a security feature used when the user is not present to make the
		 payment and present the card. It is aimed at reducing fraud.
		 */
		int threeDigitSecurityCode;

		/*
		 A credit card will have a name imprinted on it. This must be the exact name
		 used when making a transaction. The name will be treated as a String input.
		 */
		String nameAsItAppearsOnCard;

		// Enter the card holder name as it appears on the credit card
		System.out.println("Enter your name as it appears on your Credit Card");
		nameAsItAppearsOnCard = myScanner.nextLine();

		/*
		 Ask the user to enter the 16-digit credit card number as it appears on the
		 credit card and insert hyphens (-) between each set of 4 digits. Then use the
		 nextLine() method to read the data input at the console as a String. The
		 String input data needs no conversion as we are assigning the value to a
		 variable we declared as data type String.
		 */
		System.out.println("Enter the 16 digit credit number");
		System.out.println("Use hyphens as shown in this example to separate each ");
		System.out.println("set of 4 digits  1234-5678-1234-7890");
		creditCardNumber = myScanner.nextLine();

		/*
		 Ask the user to enter the value of the expiry month. Then use the nextByte()
		 method to read the data input at the console. The input data will be a String
		 but the method handles the conversion.
		 */
		System.out.println("Enter the expiry month number");
		expiryMonth = myScanner.nextByte();

		/*
		 Ask the user to enter the value of the expiry year. Then use the nextByte()
		 method to read the data input at the console and convert it to a byte
		 */
		System.out.println("Enter the expiry year number");
		expiryYear = myScanner.nextByte();

		/*
		 Ask the user to enter the value for the issue number. Then use the nextByte()
		 method to read the data input at the console. The input data will be a String
		 and the nextByte() methods does the conversion.
		 */
		System.out.println("Enter the value for the issue number (enter 0 if there is no issue number on our card)");
		issueNumber = myScanner.nextByte();

		/*
		 Ask the user to enter the value for the 3-digit security number as it appears
		 on the back of the card. Then use the nextInt() method to read the data input
		 at the console. The input data will be a String and the nextInt() methods
		 does the conversion.
		 */
		System.out.println("Enter the 3 digit security number from the back of the card");
		threeDigitSecurityCode = myScanner.nextInt();

		/*
		 Now we will display the data we have accepted from the user. We use the
		 println() method to display the data. The * information we have between the
		 brackets () of the println() is a concatenation of a String of text between
		 the double quotes "" and a variable. We have also used the escape sequence \n
		 (new line) and the \t (tab) in an attempt to format the display.
	    */
		System.out.println("************************************************\n");
		System.out.println("      We have entered the following details \n ");
		System.out.println("************************************************\n");
		System.out.println("\nCardholder name:\t" + nameAsItAppearsOnCard);
		System.out.println("\nCard number:\t\t" + creditCardNumber);
		System.out.println("\nCard expiry month:\t" + expiryMonth);
		System.out.println("\nCard expiry year:\t" + expiryYear);
		System.out.println("\nCard issue number:\t" + issueNumber);
		System.out.println("\nCard security code:\t" + threeDigitSecurityCode);
		System.out.println("************************************************\n");
		System.out.println("************************************************\n");
		myScanner.next();
        
        myScanner.close();
     } // This is the end of the method    
} // This is the end of the class