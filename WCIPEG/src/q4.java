import java.util.Scanner;

public final class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int rep = in.nextInt();
		in.nextLine();
		for (int q = 0; q < rep; q++) {
			String input;
			Integer[][] map = new Integer[4][4];
			boolean four = false;
			for (int i = 0; i < 4; i++) {
				input = in.nextLine();
				for (int h = 0; h < 4; h++) {
					if (input.substring(h, h + 1).contains("X")) {
						map[i][h] = 1;
					} else {
						map[i][h] = 0;
					}
				}
			}
			if (map[0][0] + map[1][1] + map[2][2] + map[3][3] != 4
					&& map[0][3] + map[1][2] + map[2][1] + map[3][0] != 4) {
				for (int i = 0; i < 4; i++) {
					if (map[i][0] + map[i][1] + map[i][2] + map[i][3] == 4) {
						four = true;
						break;
					}
					if (map[0][i] + map[1][i] + map[2][i] + map[3][i] == 4) {
						four = true;
						break;
					}
				}
			} else {
				four = true;
			}
			if (four) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			in.nextLine();
		}
	}

}
