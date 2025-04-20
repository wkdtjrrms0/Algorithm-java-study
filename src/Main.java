import java.io.IOException;
import java.util.Scanner;

/**
 * Info: BOJ#1300 K번째 수
 * Ref: https://www.acmicpc.net/problem/1300
 */
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long k = sc.nextInt();
		System.out.println(solution(N, k));
	}

	public static long solution(int N, long k) {
		long left = 1;
		long right = k;
		long answer = 0;

		while (left <= right) {
			long count = 0;
			long mid = (left + right) / 2;
			for (int i = 1; i <= N; i++) {
				count += Math.min(mid / i, N);
			}

			if (count < k) {
				left = mid + 1;
			} else {
				right = mid - 1;
				answer = mid;
			}
		}
		return answer;
	}
}