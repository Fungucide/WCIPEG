import java.util.Scanner;

public final class guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// System.out.println("1000000000");
		long high = 2000000000l;
		long low = 0;
		long guess;
		String input;
		while (true) {
			guess = (high + low) / 2;
			System.out.println((high + low) / 2);
			input = in.nextLine();
			if (input.contains("H")) {
				low = guess;
			} else if (input.contains("L")) {
				high = guess;
			} else if (input.contains("O")) {
				break;
			}
		}
		in.close();
	}

}
