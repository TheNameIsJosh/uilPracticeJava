package currentPractice;
import java.util.Scanner;
import java.io.PrintWriter;

public class passFail {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter printWriter = new PrintWriter(System.out,true);
		int score = scan.nextInt();
		char star = '\u2605';
		char smiley = '\u263A';
		char frowny = '\u2639';
		if (score == 100) {
			printWriter.println(star);
		} else if (score > 60) {
			System.out.println("Yay you passed!!");
			printWriter.print(smiley);
		} else {
			System.out.println("You did not pass!");
			System.out.print(frowny);
		}
		scan.close();
		printWriter.close();
	}
	
}
