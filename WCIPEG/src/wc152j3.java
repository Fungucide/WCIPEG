import java.util.Scanner;

public final class wc152j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long s = in.nextLong();
		long e = in.nextLong();
		long r = in.nextLong();
		long danger = 0;
		boolean threat = false;
		double distance;
		long type = -1;
		Long[][] storm = new Long[(int) s][3];
		Long[][] ewoks = new Long[(int) e][2];
		for (int i = 0; i < s; i++) {
			storm[i][0] = in.nextLong();
			storm[i][1] = in.nextLong();
			storm[i][2] = in.nextLong();

		}
		for (int h = 0; h < e; h++) {
			ewoks[h][0] = in.nextLong();
			ewoks[h][1] = in.nextLong();
		}
		for (int j = 0; j < e; j++) {
			threat = false;
			for (int k = 0; k < s; k++) {
				distance = Math
						.sqrt(Math.pow((ewoks[j][0] - storm[k][1]), 2) + Math.pow((ewoks[j][1] - storm[k][2]), 2));
				// System.out.println(distance);
				if (distance <= r) {

					if (threat && storm[k][0] != type) {
						danger++;
						break;

					} else {
						threat = true;
						type = storm[k][0];
					}
				}
			}
		}
		System.out.println(danger);
		in.close();
	}

}
