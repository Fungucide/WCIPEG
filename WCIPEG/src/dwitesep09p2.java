import java.util.Scanner;

public final class dwitesep09p2 {
	public static boolean isprime = true;
	public static long result;
	public static String space = "";
	public static boolean numberfound = false;

	public static boolean Check(long number) {
		// TODO Auto-generated method stub
		isprime = true;
		long checknumber = number;
		for (long n = 2; n < Math.sqrt(checknumber); n++) {
			result = checknumber % n;
			System.out.println(checknumber + "%" + n + "=" + result);
			if (result == 0) {
				isprime = false;
				break;
			}
		}
		System.out.println(isprime);
		return isprime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input;
		String check;
		String number;
		for (int h = 0; h < 5; h++) {
			space = "";
			input = in.nextLine();
			numberfound = false;
			int i = 0;
			if (input.substring(0, 1) == "_") {
				i++;
			}
			for (; i < 10; i++) {
				number = Integer.toString(i);
				check = input.replace("_", number);
				// System.out.println(check);
				if (Check(Long.parseLong(check))) {
					System.out.print(space + i);
					space = " ";
					numberfound = true;
				}
			}
			if (!numberfound) {
				System.out.println("Not possible");
			} else {
				System.out.println();
			}
		}
		in.close();
	}

}
