package currentPractice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Ariel {

	public Ariel(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("ariel.dat"));
		ArrayList<Integer> allArrivals = new ArrayList<Integer>();
		ArrayList<Integer> allDepartures = new ArrayList<Integer>();
		// We need to determine the minimum amount of trains needed for no delays
		// We need to check the file
		// First, check the amount of times the program runs
		int trials = scan.nextInt();
		scan.nextLine();
		int compared = 1;
		for (int i =0; i<trials; i++) {
			String[] currentLine = scan.nextLine().split(" ");
			for (String s:currentLine) {
				int arrivalMinutes = Integer.parseInt(s.split(":")[0])*60 + Integer.parseInt(s.split(":")[1]);
				allArrivals.add(arrivalMinutes);
			}
			allArrivals.add(0);
			currentLine = scan.nextLine().split(" ");
			for (String s:currentLine) {
				int departureMinutes = Integer.parseInt(s.split(":")[0])*60 + Integer.parseInt(s.split(":")[1]);
				allDepartures.add(departureMinutes);
			}
			for (int num:allDepartures) {
				if(num>allArrivals.get(allDepartures.indexOf(num)+1)) {
					compared+=1;
				}
				if(num == allArrivals.get(allDepartures.indexOf(num)+1)) {
					compared-=1;
				}
			}
			System.out.println(compared);
			compared-=compared;
			allArrivals.clear();
			allDepartures.clear();
		}
		
		scan.close();
	}

}
