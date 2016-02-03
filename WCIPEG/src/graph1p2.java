import java.util.Scanner;

public final class graph1p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] array = new int[N][N];
		int[] du = new int[N];
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++) {
				array[x][y] = in.nextInt();
				if (array[x][y] == 0)
					array[x][y] = -1;
			}
		}
		in.close();

		for (int i = 0; i < N; i++)
			du[i] = -1;

		du[0] = 0;

		boolean[] visited = new boolean[N];

		while (true) {
			boolean flag = true;
			int minnodeidx = 0;
			int minval = -1;
			for (int i = 0; i < N; i++) {
				if (!visited[i])
					if (du[i] != -1) {
						if (minval == -1) {
							minval = du[i];
							minnodeidx = i;
						}
						if (du[i] < minval) {
							minval = du[i];
							minnodeidx = i;
						}
						flag = false;
					}
			}
			if (flag) {
				break;
			}

			for (int i = 0; i < N; i++) {
				if (array[minnodeidx][i] != -1)
					if (!visited[i]) {
						if (du[i] == -1) {
							du[i] = du[minnodeidx] + array[minnodeidx][i];
						}
						if (du[i] > du[minnodeidx] + array[minnodeidx][i]) {
							du[i] = du[minnodeidx] + array[minnodeidx][i];
						}
					}
			}

			visited[minnodeidx] = true;
		}
		System.out.println(du[N - 1]);
	}

}
