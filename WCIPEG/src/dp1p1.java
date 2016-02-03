import java.util.Scanner;
import static java.lang.Math.max;

public class dp1p1 {

	static int[] nums;
	static int[][] dp;
	static int N;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		nums = new int[N];
		dp = new int[N + 1][2];
		for (int i = 0; i < N; i++) {
			nums[i] = s.nextInt();
		}
		for (int i = 0; i <= N; i++) {
			dp[N][0] = -1;
			dp[N][1] = -1;
		}
		s.close();
		System.out.println(max(maxsum(0, 0), maxsum(0, 1)));
	}

	static int maxsum(int idx, int select) {
		if (idx == N)
			return 0;

		if (dp[idx][select] == -1) {
			int result;
			if (select == 0) {
				result = maxsum(idx + 1, 1) + nums[idx];
			} else {
				result = max(maxsum(idx + 1, 0), maxsum(idx + 1, 1));
			}
			dp[idx][select] = result;
			return result;
		} else {
			return dp[idx][select];
		}
	}

}
