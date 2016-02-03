import java.util.Scanner;

public final class acmtryouts2e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input;
		long rep = in.nextLong();
		boolean unit = false;
		boolean unvisited = true;

		int x;
		int y;
		int px;
		int py;
		Integer[][] map;
		Integer[][] mineral;
		for (int i = 0; i < rep; i++) {
			y = in.nextInt();
			x = in.nextInt();
			in.nextLine();
			map = new Integer[y][x];
			mineral = new Integer[2][2];
			for (int h = 0; h < y; h++) {
				input = in.nextLine();
				for (int j = 0; j < x; j++) {
					if (input.substring(j, j + 1).contains("W")) {
						map[h][j] = -2;
					} else if (input.substring(j, j + 1).contains("E")) {
						map[h][j] = -1;
					} else if (input.substring(j, j + 1).contains("M")) {
						if (mineral[0][0] == null) {
							mineral[0][0] = h;
							mineral[0][1] = j;
						} else {
							mineral[1][0] = h;
							mineral[1][1] = j;
						}
						map[h][j] = -3;
					} else if (input.substring(j, j + 1).contains("U")) {
						map[h][j] = -4;
					} else if (input.substring(j, j + 1).contains("W")) {
						map[h][j] = -5;
					} else if (input.substring(j, j + 1).contains("P")) {
						map[h][j] = 0;
						py = h;
						px = j;
					} else if (input.substring(j, j + 1).contains("C")) {
						map[h][j] = -7;
					}
				}
			}

			// End of data Input

			for (int h = 0; h < y; h++) {
				for (int j = 0; j < x; j++) {
					System.out.println("(" + j + "," + h + ") " + map[h][j]);
					if (map[h + 1][j] == -7 && !unit && h != y - 1) {
						if (map[h][j] > 0) {
							System.out.println(map[h][j] + 1);
						}
					} else if (h != 0 && map[h - 1][j] == -7 && !unit) {
						if (map[h][j] > 0) {
							System.out.println(map[h][j] + 1);
						}
					} else if (j != x - 1 && map[h][j + 1] == -7 && !unit) {
						if (map[h][j] > 0) {
							System.out.println(map[h][j] + 1);
						}
					} else if (j != 0 && map[h][j - 1] == -7 && !unit) {
						if (map[h][j] > 0) {
							System.out.println(map[h][j] + 1);
						}
						// Check for control point
					} else if (h != y - 1 && map[h + 1][j] == -1 && !unit) {
						map[h + 1][j] = map[h][j] + 1;
					} else if (h != 0 && map[h - 1][j] == -1 && !unit) {
						map[h - 1][j] = map[h][j] + 1;
					} else if (j != x - 1 && map[h][j + 1] == -1 && !unit) {
						map[h][j + 1] = map[h][j] + 1;
					} else if (j != 0 && map[h][j - 1] == -1 && !unit) {
						map[h][j - 1] = map[h][j] + 1;
						// Check for not visited
					} else if (h != y - 1 && map[h + 1][j] > 0 && !unit) {
						if (map[h + 1][j] > map[h][j] + 1) {
							map[h + 1][j] = map[h][j] + 1;
						}
					} else if (h != 0 && map[h - 1][j] > 0 && !unit) {
						if (map[h - 1][j] > map[h][j] + 1) {
							map[h - 1][j] = map[h][j] + 1;
						}
					} else if (j != x - 1 && map[h][j + 1] > 0 && !unit) {
						if (map[h][j + 1] > map[h][j] + 1) {
							map[h][j + 1] = map[h][j] + 1;
						}
					} else if (j != 0 && map[h][j - 1] > 0 && !unit) {
						if (map[h][j - 1] > map[h][j] + 1) {
							map[h][j - 1] = map[h][j] + 1;
						}
					} else if (h != y - 1 && map[h + 1][j] == -4 || unit) {
						if (Math.sqrt(Math.pow(h - mineral[0][0], 2) + Math.pow(j - mineral[0][1], 2)) > Math
								.sqrt(Math.pow(h + 1 - mineral[0][0], 2) + Math.pow(j - mineral[0][1], 2))
								|| Math.sqrt(Math.pow(h - mineral[1][0], 2) + Math.pow(j - mineral[1][1], 2)) > Math
										.sqrt(Math.pow(h + 1 - mineral[1][0], 2) + Math.pow(j - mineral[1][1], 2))) {
							map[h + 1][j] = map[h][j] + 1;
							unit = true;
						}
					} else if (h != 0 && map[h - 1][j] == -4 || unit) {
						if (Math.sqrt(Math.pow(h - mineral[0][0], 2) + Math.pow(j - mineral[0][1], 2)) > Math
								.sqrt(Math.pow(h - 1 - mineral[0][0], 2) + Math.pow(j - mineral[0][1], 2))
								|| Math.sqrt(Math.pow(h - mineral[1][0], 2) + Math.pow(j - mineral[1][1], 2)) > Math
										.sqrt(Math.pow(h - 1 - mineral[1][0], 2) + Math.pow(j - mineral[1][1], 2))) {
							map[h - 1][j] = map[h][j] + 1;
							unit = true;
						}
					} else if (j != x - 1 && map[h][j + 1] == -4 || unit) {
						if (Math.sqrt(Math.pow(h - mineral[0][0], 2) + Math.pow(j - mineral[0][1], 2)) > Math
								.sqrt(Math.pow(h - mineral[0][0], 2) + Math.pow(j + 1 - mineral[0][1], 2))
								|| Math.sqrt(Math.pow(h - mineral[1][0], 2) + Math.pow(j - mineral[1][1], 2)) > Math
										.sqrt(Math.pow(h - mineral[1][0], 2) + Math.pow(j + 1 - mineral[1][1], 2))) {
							map[h][j + 1] = map[h][j] + 1;
							unit = true;
						}
					} else if (j != 0 && map[h][j - 1] == -4 || unit) {
						if (Math.sqrt(Math.pow(h - mineral[0][0], 2) + Math.pow(j - mineral[0][1], 2)) > Math
								.sqrt(Math.pow(h - mineral[0][0], 2) + Math.pow(j - 1 - mineral[0][1], 2))
								|| Math.sqrt(Math.pow(h - mineral[1][0], 2) + Math.pow(j - mineral[1][1], 2)) > Math
										.sqrt(Math.pow(h - mineral[1][0], 2) + Math.pow(j - 1 - mineral[1][1], 2))) {
							map[h][j - 1] = map[h][j] + 1;
							unit = true;
						}
						// Check for unit
					}
					map[h][j] = -2;
				}
			}

		}
		in.close();
	}

}
