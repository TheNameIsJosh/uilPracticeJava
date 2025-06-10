package currentPractice;

import java.util.*;
import java.io.*;

public class district2025_Becker {

  // This problem is about calculating compound interest
  // While it is simple and the equation is on the paper
  // You should still be able to do this one wihout problem
  // Just remember the final weeks of Algebra II

  //  *** Try to read this code yourself and make a note to understand it ***
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("becker.dat"));
		while(scan.hasNext()) {
			double goal = scan.nextDouble();
			float rate = scan.nextFloat();
			int CPY = scan.nextInt();
			int years = scan.nextInt();
			
			System.out.println( (int) Math.ceil( goal/Math.pow(1+rate/(100*CPY), CPY*years)) );
		};
		scan.close();
	}
}
