import java.util.Arrays;
import java.util.Scanner;

public final class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double length = in.nextLong();
		Double[] marks = new Double[(int) length];
		for (int i = 0; i < length; i++) {
			marks[i] = in.nextDouble();
		}
		Arrays.sort(marks);
		if (length % 2 == 0) {
			System.out.println((marks[(int) (length / 2) - 1] + marks[(int) (length / 2)]) / 2);
		} else {
			System.out.println(marks[(int) ((length + 1) / 2)]);
		}
	}

}
