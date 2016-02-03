import java.util.Scanner;

public final class wc152j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long stones = in.nextLong();
		long total = 0;
		long weight;
		long strenght = in.nextLong();
		for (int i = 0; i < stones; i++) {
			if ((weight = in.nextLong()) <= strenght) {
				total += weight;
			}
		}
		System.out.println(total);

	}
	
}
