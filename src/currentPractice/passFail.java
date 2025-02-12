package uilPracticeJava;
import java.util.Scanner;
import java.io.PrintWriter;
public class passFail {
	static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter printWriter = new PrintWriter(System.out,true);
		int score = scan.nextInt();
		if (score == 100) {
			printWriter.println(\u2605);
		} else if (score > 60) {
			System.out.println("Yay you passed!!");
			printWriter.print(\u263A);
		} else {
			System.out.println("You did not pass!");
			System.out.print(\u2639);
		}
		scan.close();
		printWriter.close();
	}
	
}
