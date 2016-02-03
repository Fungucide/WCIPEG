import java.util.Arrays;
import java.util.Scanner;

public final class avatarwater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Long[] weight = new Long[3];
		for (int i = 0; i < 3; i++) {
			weight[i] = in.nextLong();
		}
		Arrays.sort(weight);
		System.out.println(weight[2] - weight[1]);
		in.close();
	}

}
