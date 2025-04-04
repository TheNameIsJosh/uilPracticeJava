package currentPractice;
public class fizzBuzz {
	public fizzBuzz(String[] args) {
		/* Print numbers 1-20 but every multiple of 3 print "Fizz"
		 * Every multiple of 5 print "Buzz"
		 * Every multiple of 3 and five print "FizzBuzz"
		*/
		for (int i = 1; i<21;++i) {
			if (i%3 == 0 && i%5 == 0) { // if i is divisible by 3 and 5, then print out "FizzBuzz"
				System.out.println("FizzBuzz");
			} else if (i%3 == 0) { // if i is divisible by only 3, then print out "Fizz"
				System.out.println("Fizz");
			} else if (i%5 == 0) { // if i is divisible by only 5, then print out "Buzz"
				System.out.println("Buzz");
			} else {
				System.out.println(i); // if the number is not divisible either by 3 or 5, then print out the original number(a.k.a. i)
			}
		}
	}
	
}
