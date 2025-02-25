package currentPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class invitationalB_Dante {

	public static void Dante(String[] args) throws FileNotFoundException, InterruptedException {
		/*  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			Note That I will Leave commenting to my team mates,
			So take this file and make comments--We will eventually review this
		    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  */
		
		File fileName = new File("dante.dat");
		Scanner scan = new Scanner(fileName);
		int cases = scan.nextInt();
		int counter = 0;
		
		for (int i=1;i<=cases;i++) {
			int sP = scan.nextInt();
			int eP = scan.nextInt();
			int times = eP -sP; //
			for (int j=0;j<times;++j) {
				if (sP%2!=0&&sP%3!=0&&sP%5!=0&&sP%7!=0) { // Checks if number is divisible by 2,3,5,7 (Basically, is number prime?)
					counter+=1; // Add to the counter of primes
				}
				if (sP==2||sP==3||sP==5||sP==7) { // This catches when the number is 2,3,5 and 7
					counter+=1; // Add to the counter of primes
				}
				sP+=1;
			}
			System.out.println(counter);
			counter-=counter;
		}
		scan.close();
	}

}
