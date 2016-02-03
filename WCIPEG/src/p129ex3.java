import java.util.Scanner;

public final class p129ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long input = in.nextLong();
		long check = 0;
		while (true) {
			if (input <= Math.pow(2, check)) {
				break;
			} else {
				check++;
			}
		}
		System.out.println(check);
		in.close();
	}

}
