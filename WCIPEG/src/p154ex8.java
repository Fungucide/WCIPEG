import java.util.Scanner;

public class p154ex8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long number = in.nextLong();
		for (long rep = 1; rep <= Math.sqrt(number); rep++) {
			if (number % rep == 0) {
				System.out.println(rep);
				if (rep != number / rep) {
					System.out.println(number / rep);
				}
			}
		}
		in.close();
	}
}
