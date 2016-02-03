import java.util.Scanner;

public final class acmtryouts3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int lines = in.nextInt();
		in.nextLine();
		String input;
		int index;
		int count;
		for (int i = 0; i < lines; i++) {
			input = in.nextLine();
			index = input.indexOf("<3");
			count = 0;
			while (index != -1) {
				count++;
				input = input.substring(index + 1);
				index = input.indexOf("<3");
			}
			System.out.print("<3");
			for (int h = 0; h < count; h++) {
				System.out.print(" <3");
			}
			System.out.println();

		}
		in.close();
	}
}
