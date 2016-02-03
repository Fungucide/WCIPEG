import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public final class wc151j4 {
	public static void calculate(String bf, int reptition) {
		exlevel = 0;
		long food = 0;
		long thisprice = hotel[1];
		ArrayList<Long> hotelp = new ArrayList<Long>();
		hotelp.add(hotel[2]);
		food = hotel[3];
		for (int i = 0; i < bf.length(); i++) {
			// System.out.println(bf.charAt(i));
			if (bf.charAt(i) == '1') {
				// System.out.println("true");
				// System.out.println(attraction[0][i]);
				exlevel = exlevel + attraction[0][i];
			}
		}
		if (exlevel < hotel[0]) {
			return;
		}
		// System.out.println("Length: " + hotelp.size());
		for (int i = 0; i < bf.length(); i++) {
			if (bf.charAt(i) == '1') {
				// System.out.println("Hotel: " + attraction[2][i]);
				hotelp.add(attraction[2][i]);
				thisprice += attraction[1][i];
				food -= attraction[3][i];
			}
		}
		Long[] sort = new Long[hotelp.size()];
		sort = hotelp.toArray(sort);
		Arrays.sort(sort);
		thisprice += sort[sort.length - 1];
		if (food > 0) {
			thisprice += food;
		}
		price.add(thisprice);

	}

	public static Long[][] attraction;
	public static ArrayList<Long> price;
	public static long exlevel = 0;
	public static Long[] hotel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);// Scanner
		// Excitement Level
		hotel = new Long[4];
		String[] temp = new String[4];
		Double[] ratio = new Double[20];
		Double[] ratiotemp = new Double[20];
		String inputhotel = s.nextLine();
		String bforce = "";
		long bfmax;
		temp = inputhotel.split(" ");
		for (int i = 0; i < 4; i++) {
			hotel[i] = Long.parseLong(temp[i]);
		}
		long numberofattractions = s.nextLong();
		s.nextLine();
		attraction = new Long[4][(int) numberofattractions];
		Boolean[] choosen = new Boolean[(int) numberofattractions];

		String input;
		for (int aaa = 0; aaa < numberofattractions; aaa++) {
			input = s.nextLine();
			temp = input.split(" ");
			for (int aa = 0; aa < 4; aa++) {
				attraction[aa][aaa] = Long.parseLong(temp[aa]);
				// System.out.println(temp[aaa]);
			}
			// System.out.println();
		}

		for (int iii = 0; iii < numberofattractions; iii++) {
			bforce = bforce + "1";
			for (int ii = 0; ii < 4; ii++) {
				// System.out.print(attraction[ii][iii] + " ");

			}
			// System.out.println();
		}
		// System.out.println(bforce);
		bfmax = Long.parseLong(bforce, 2) + 1;
		// System.out.println(bfmax);
		price = new ArrayList<Long>();
		// System.out.println();
		String zerostring = "";
		for (int bf = 0; bf < bfmax; bf++) {
			zerostring = Long.toBinaryString(bf);
			while (zerostring.length() != numberofattractions) {
				zerostring = "0" + zerostring;
			}
			// System.out.println(zerostring + "  " + bf);
			calculate(zerostring, bf);
		}
		Long[] prices = new Long[price.size()];
		prices = price.toArray(prices);
		Arrays.sort(prices);
		System.out.println(prices[0]);
	}
}