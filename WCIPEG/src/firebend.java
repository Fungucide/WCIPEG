import java.util.Scanner;

public final class firebend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int numberofnumber = in.nextInt();
		int input;
		int total = 0;
		for (int i = 0; i < numberofnumber; i++) {
			input = in.nextInt();
			if (input < 0) {
				total += input * -1;
			} else {
				total += input;
			}
		}
		System.out.print(total);
		in.close();
	}

}
