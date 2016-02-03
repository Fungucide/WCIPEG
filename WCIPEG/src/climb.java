import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class climb {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		String[] temp = new String[3];
		Integer[] stats = new Integer[3];
		temp = input.split(" ");
		stats[0] = Integer.parseInt(temp[0]);
		stats[1] = Integer.parseInt(temp[1]);
		stats[2] = Integer.parseInt(temp[2]);
		int numberofholds = stats[0];
		int[] H = new int[stats[0] + 1];
		H[0] = 0;
		boolean possible = true;
		int M = stats[1];
		int E = stats[2];
		int distance;
		for (int i = 1; i < numberofholds + 1; i++) {
			H[i] = Integer.parseInt(in.readLine());
		}
		for (int i = 0; i < numberofholds; i++) {
			distance = H[i + 1] - H[i];
			if (distance > M) {
				if (E > 0) {
					if (distance > M * 2) {
						possible = false;
						break;
					} else {
						E--;
					}
				} else {
					possible = false;
					break;
				}
			}
		}
		if (possible) {
			System.out.println("Too easy!");
		} else {
			System.out.println("Unfair!");
		}
	}

}
