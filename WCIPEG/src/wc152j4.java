import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class wc152j4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[][] map;
		String[] direc = { "u", "d", "l", "r" };
		String xy = in.readLine();
		long y = Long.parseLong(xy.substring(0, xy.indexOf(" ")));
		long x = Long.parseLong(xy.substring(xy.indexOf(" ") + 1, xy.length()));
		long ly;
		long lx;
		String input;
		String direction;
		boolean isdead = false;
		long dead = 0;
		map = new String[(int) y][(int) x];
		for (int i = 0; i < y; i++) {
			input = in.readLine();
			for (int h = 0; h < x; h++) {
				map[i][h] = input.substring(h, h + 1);
			}
		}
		for (int i = 0; i < y; i++) {
			for (int h = 0; h < x; h++) {
				// System.out.println("(" + h + "," + i + ")" + map[i][h] + "
				// Check");
				isdead = false;
				if (map[i][h].contains(".")) {
					for (int j = 0; j < 4 && !isdead; j++) {
						direction = direc[j];
						lx = h;
						ly = i;
						// System.out.println(direction);
						while (!isdead) {
							// System.out.println("(" + lx + "," + ly + ")" +
							// map[(int) ly][(int) lx] + " " + direction);
							if (direction.contains("u") && ly != 0) {
								ly--;
								if (map[(int) ly][(int) lx].contains("/")) {
									direction = "r";
								} else if (map[(int) ly][(int) lx].contains("\\")) {
									direction = "l";
								} else if (map[(int) ly][(int) lx].contains("X")) {
									direction = "d";
								} else if (map[(int) ly][(int) lx].contains("#")) {
									break;
								}
							} else if (direction.contains("d") && ly != y - 1) {
								ly++;
								if (map[(int) ly][(int) lx].contains("/")) {
									direction = "l";
								} else if (map[(int) ly][(int) lx].contains("\\")) {
									direction = "r";
								} else if (map[(int) ly][(int) lx].contains("X")) {
									direction = "u";
								} else if (map[(int) ly][(int) lx].contains("#")) {
									break;
								}
							} else if (direction.contains("l") && lx != 0) {
								lx--;
								if (map[(int) ly][(int) lx].contains("/")) {
									direction = "d";
								} else if (map[(int) ly][(int) lx].contains("\\")) {
									direction = "u";
								} else if (map[(int) ly][(int) lx].contains("X")) {
									direction = "r";
								} else if (map[(int) ly][(int) lx].contains("#")) {
									break;
								}
							} else if (direction.contains("r") && lx != x - 1) {
								lx++;
								if (map[(int) ly][(int) lx].contains("/")) {
									direction = "u";
								} else if (map[(int) ly][(int) lx].contains("\\")) {
									direction = "d";
								} else if (map[(int) ly][(int) lx].contains("X")) {
									direction = "l";
								} else if (map[(int) ly][(int) lx].contains("#")) {
									break;
								}
							} else {
								break;
							}
							if (ly == i && lx == h) {
								dead++;
								isdead = true;
							}
						}
					}
				}
			}
		}
		System.out.println(dead);
	}
}