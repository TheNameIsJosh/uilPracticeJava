package currentPractice;

import java.io.File; // Import file functionality for reading the file
import java.io.FileNotFoundException; // Import the file class error for safety
import java.util.Scanner; // Import the scanner class to read the file

public class InvitationalB_Amy {

	public static void Amy(String[] args) throws FileNotFoundException {
		File fileName = new File("amy.dat"); // Initialize a new file with the file name
		
		Scanner scan = new Scanner(fileName); // Initialize a new scanner with the file path (using the fileName)
		
		int cases = scan.nextInt(); // Get the number of cases from the file by reading as Int
		
		for (int i =1; i<=cases;i++) { // Cycles through cases (Goes from 1 to case_number)
			
			String passwrd = scan.next(); // Scans the next thing as a String
			
			int passwrdLength = passwrd.length(); // Gets the length of the string
			
			long speed = scan.nextLong(); // Initialize numbers as long since powers are big numbers
			
			long possiblePasswords = (long) Math.pow(36.0,(double) passwrdLength); 
			// Get the possible password amount by doing
			// total number of possible characters ^ the password's length
			
			long seconds = possiblePasswords/speed;// Divide the possible passwords by the passwords per second to get the seconds of guessing
			System.out.println(seconds); // Print the seconds of guessing
		}
		
		scan.close();
	}

}
