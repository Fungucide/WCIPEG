import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public final class primes2 {
	public static String number;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		number = s.nextLine();
		PrimeNumbers(Long.parseLong(number.substring(number.indexOf(" ") + 1)));

	}

	public static void PrimeNumbers(long max) {
		// TODO Auto-generated method stub
		ArrayList<Long> numbers = new ArrayList<Long>();
		long primenumber;
		// create stuff

		// Tell to start at the number 2
		long primenumbernumber = 2;
		primenumber = 2;
		numbers.add(primenumber);
		// System.out.println("Prime Number#1: 2");
		if (Long.parseLong(number.substring(0, number.indexOf(" "))) <= 2
				&& 2 >= Long.parseLong(number.substring(number.indexOf(" ") + 1))) {
			System.out.println("2");
		}
		// change the number of numbers generated
		for (long n = 2; n <= max;) {
			primenumber++;
			boolean isprime = true;
			// extract the numbers from ArrayList(number)
			for (Long number : numbers) {
				long remainder = primenumber % number;
				// check to see if is divisible by prime number
				// if true then write to array and break
				if (remainder == 0) {
					isprime = false;
					break;
				}
				// if not, check for optimization
				double stop = Math.sqrt(primenumber);
				if (number >= stop) {
					// if checking to large of a number break
					break;
				}
			}
			// display numbers
			if (isprime) {
				numbers.add(primenumber);
				if (Long.parseLong(number.substring(0, number.indexOf(" "))) <= primenumber
						&& primenumber <= Long.parseLong(number.substring(number.indexOf(" ") + 1))) {
					System.out.println(String.valueOf(primenumber));
				}

				// System.out.println(primenumber); //old method
				// System.out.println("Prime Number #" + primenumbernumber + ":
				// " + primenumber); // Current
				// method
				primenumbernumber++;
				n++;
			}
			// primenumber++;
			if (primenumber >= 3) {
				primenumber++;
			}
		}

	}

}
