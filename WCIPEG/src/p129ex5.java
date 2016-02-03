import java.util.Scanner;

public final class p129ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String check = in.nextLine();
		String input = in.nextLine();
		input = input.toLowerCase();
		long count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i + 1).contains(check)) {
				count++;
			}
		}
		System.out.println(input);
		System.out.println(count);
	}

}
