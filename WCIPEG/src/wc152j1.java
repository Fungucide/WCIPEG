import java.util.Scanner;

public final class wc152j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long number = in.nextLong();
		System.out.print("A long time ago in a galaxy ");
		for (int i = 0; i < number - 1; i++) {
			System.out.print("far, ");
		}
		System.out.println("far away...");
	}

}
