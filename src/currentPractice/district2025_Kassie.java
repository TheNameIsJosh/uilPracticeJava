package currentPractice;

import java.util.*;
import java.io.*;

public class district2025_Kassie {

	public static void Kassie(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("kassie.dat"));
		
		int trials = scan.nextInt();
		for(int i=0;i<trials;i++) {
			int a = scan.nextInt();
			String sym = scan.next();
			int b = scan.nextInt();
			
			if(sym.equals("+")) {
				System.out.println(a+b);
			}
			if(sym.equals("-")) {
				System.out.println(a-b);
			}
			if(sym.equals("/")) {
				System.out.println(a/b);
			}
			if(sym.equals("*")) {
				System.out.println(a*b);
			}
			scan.nextLine();
		}
		scan.close();

	}

}
