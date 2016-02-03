import java.util.ArrayList;
import java.util.Scanner;

public final class prac3p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long input;
		long length;
		long total;
		int i;
		long count;
		boolean match = false;
		ArrayList<Long> numbers;
		while ((input = in.nextLong()) != 0) {
			numbers = new ArrayList<Long>();
			count = 2;
			total = 0;
			for (; true; count++) {
				match = false;
				length = String.valueOf(input).length();
				for (i = 0; i < length; i++) {
					// System.out.println(i);
					// System.out.println(Long.parseLong(String.valueOf(input).substring(i,
					// i + 1)));
					total += factorial(Long.parseLong(String.valueOf(input).substring(i, i + 1)));
				}
				input = total;

				// System.out.println(total);

				for (long check : numbers) {
					// System.out.println(check + " : " + total);
					if (total == check) {
						System.out.println(count);
						match = true;
						break;
					}
				}

				if (match) {
					break;
				}
				numbers.add(total);
				total = 0;
			}
		}
	}

	public static long fac;
	public static int h;

	public static long factorial(long number) {
		fac = 1;
		for (h = 1; h != number + 1; h++) {
			fac = fac * h;
		}
		return fac;
	}

}
