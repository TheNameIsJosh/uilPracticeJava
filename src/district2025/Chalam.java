package district2021;

import java.util.*;
import java.io.*;

// This priblem extends the requirements of "primeCheck"
// Lets see how this works
// BTW, I recommend clearing clearing comments and making them yourself
public class Chalam {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(new File("chalam.dat")); // Of course, read from file
    int trials = scan.nextInt(); // Number of lines to read
    // We start looping to read the amount of lines
    for (int i=0;i<trials;i++){
      int numberToEvaluate = scan.nextInt(); // We read the number in the line, 
                                             // Which we need to know the prime factors of

      // This loop starts at 2, the first number which we check for primes 
      for (int j=2;j<=numberToEvaluate;j++){
        int count =0;// Count keeps track of how many times it can be divided by a number
        while (numberToEvaluate % j ==0){ // Divides by j max amount of times, and keeps track of times
          numberToEvaluate /= j;
          count++;
        }
        // This is the part that prints if there is a factor
        if (count!=0){
          if (count==1){ // Make single-factor cleaner ex. 5^1 -> 5
            System.out.print(j+" ");
          }
          else{
            System.out.print(j+"^"+count+" ");
          }
        }
      }
      System.out.print("\n"); // Prints the newline so that it looks good 
    }
  }
}
