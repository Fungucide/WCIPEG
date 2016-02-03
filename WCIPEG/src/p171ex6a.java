import java.util.Arrays;
import java.util.Scanner;

public final class p171ex6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Float[] numbers = new Float[in.nextInt()];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextFloat();
		}
		Arrays.sort(numbers);
		System.out.println(numbers[numbers.length - 1]);
		in.close();
	}

}
