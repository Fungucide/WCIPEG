import java.util.Scanner;

public final class fur1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long amount = in.nextLong();
		Long[] cards = new Long[(int) amount];
		long largest;
		long temp;
		for (int i = 0; i < amount; i++) {
			cards[i] = in.nextLong();
		}
		largest = cards[0] * cards[cards.length - 1];
		for (int i = 0; i < amount - 1; i++) {
			temp = cards[i] * cards[i + 1];
			if (temp > largest) {
				largest = temp;
			}
		}
		System.out.println(largest);
		in.close();
	}

}
