import java.util.Scanner;

public final class p108ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int weight;
		int price;
		for (int i = 0; i < in.nextInt(); i++) {
			weight = in.nextInt();
			price = 73;
			if (0 <= weight && weight <= 30) {
				System.out.println("38");
			} else if (31 < weight && weight <= 50) {
				System.out.println("55");
			} else if (50 < weight && weight <= 100) {
				System.out.println("73");
			} else if (weight > 100) {
				weight -= 100;
				while (weight > 0) {
					weight -= 50;
					price += 24;
				}
				System.out.println(price);
			}
		}
		in.close();
	}

}
