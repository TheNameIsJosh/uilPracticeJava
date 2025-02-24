package currentPractice;

public class invitationalB_Akash {
	public static void Akash(String[] args) {
		// Initialize a "StringBuilder" which is needed for appending functions
		StringBuilder printed = new StringBuilder();
		
		//Initialize the size of our number list and the list itself
		int size = 20;
		int[] numbers = new int[size+1];
		
		// Populate the number list and the StringBuilder
		for (int i = 1; i<=size; i++) {
			numbers[i] = i;
			printed.append(i + " ");
		}
		
		// Show the first iteration of the number list
		System.out.println(printed.toString());
		
		// Start the looping
		for (int k = 2; k<size; k++) { 
			// This loop goes through numbers 2 to  K,
			// K is used to check if a number is divisible by something
			
			String temp = printed.toString(); // Temporary string to check back and see if the current string and the last one are the same
			
			printed.delete(0, printed.length()); // We clear the StringBuilder so as to not clutter it
			
			for (int i =0; i<numbers.length;i++) { 
				// This checks for divisibility of all numbers in our number list by checking number k
				if (numbers[i] !=k && numbers[i] % k==0) {
					numbers[i] = 0; // Sets it equal to 0 if divisible, so that we may ignore it when appending to StringBuilder
				}
			}
			for (int num:numbers) { // Appends (ads) numbers to StringBuilder if they are not 0
				if (num!=0) {
					printed.append(num + " ");
				}
			}
			if (!printed.toString().equals(temp)) { // Checks if the current string is the same as the string before
				System.out.println(printed.toString()); // Prints only if the current string is different from the previous one
			}
		}
	}
}
