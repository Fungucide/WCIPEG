import java.util.Scanner;

public final class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long total = 0;
		int size = in.nextInt();
		Integer[][] map = new Integer[size][size];
		String[] temp = new String[size];
		String input;
		in.nextLine();
		for (int i = 0; i < size; i++) {
			input = in.nextLine();
			temp = input.split(" ");
			for (int h = 0; h < size; h++) {
				map[i][h] = Integer.parseInt(temp[h]);
			}
		}
		int row;
		int column;
		int x;
		int y;
		String place;
		int casen = in.nextInt();
		in.nextLine();
		for (int rep = 0; rep < casen; rep++) {
			place = in.nextLine();
			row = Integer.parseInt(place.substring(0, place.indexOf(" ")));
			column = Integer.parseInt(place.substring(place.indexOf(" ") + 1));
			for (x = 0; x < size; x++) {
				total += map[row - 1][x];
			}
			for (y = 0; y < size; y++) {
				total += map[y][column - 1];
			}
			System.out.println(total);
			total = 0;
		}
	}

}