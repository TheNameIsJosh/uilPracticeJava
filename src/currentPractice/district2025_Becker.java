package currentPractice;

import java.util.*;
import java.io.*;

public class district2025_Becker {

	public static void Becker(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("becker.dat"));
		while(scan.hasNext()) {
			double goal = scan.nextDouble();
			float rate = scan.nextFloat();
			int CPY = scan.nextInt();
			int years = scan.nextInt();
			
			System.out.println( Math.ceil( goal/Math.pow(1+rate/(100*CPY), CPY*years)) );
		};
		scan.close();
	}
}
