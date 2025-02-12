package uil_pract;
import java.util.Scanner;

public class prime_Check {
	public static void primeCheck(String[] args) {
		/* Take user input and determine if the number
		 * is prime
		*/
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if (number%2!=0&&number%3!=0&&number%5!=0&&number%7!=0) { //if number is divisible by 2,3,5,7 then do not return 
			System.out.println(number);
		}else if (number==2||number==3||number==5||number==7) {// if number = to 2,3,5,7 then must be prime, so return
			System.out.println(number);
		}
		scan.close();
	}
}
