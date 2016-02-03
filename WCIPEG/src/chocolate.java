import java.util.Scanner;

public final class chocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int casenumber = in.nextInt();
		in.nextLine();
		String input;
		int a;
		int b;
		for (int i = 0; i < casenumber; i++) {
			input = in.nextLine();
			a = Integer.parseInt(input.substring(0, input.indexOf(" ")));
			b = Integer.parseInt(input.substring(input.indexOf(" ") + 1));
			System.out.println((a * b) - 1);
		}
	}

}
