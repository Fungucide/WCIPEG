import java.text.DecimalFormat;
import java.util.Scanner;

public final class p124ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double x;
		double p;
		double total;
		for (int i = 0; i < in.nextDouble(); i++) {
			x = in.nextDouble();
			p = in.nextDouble();
			total = Math.pow(x, p);
			DecimalFormat formatter = new DecimalFormat("0.00");
			System.out.println(formatter.format(total));
		}
		in.close();
	}

}
