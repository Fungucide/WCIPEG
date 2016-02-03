import java.util.Arrays;
import java.util.Scanner;

public final class fur2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		Long[][] numbers = new Long[number][2];
		for (int i = 0; i < number; i++) {
			numbers[i][0] = in.nextLong();
		}
		in.close();
	}

}
