import java.io.IOException;
import java.util.Scanner;

/**
 * Info: BOJ#12738 가장 긴 증가하는 부분 수열 3
 * Ref: https://www.acmicpc.net/problem/12738
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(solution(A));
	}
	public static int solution(int[] A) {
		int[] LIS = new int[A.length];
		LIS[0] = A[0];
		int answer = 1;

		for (int i = 1; i < A.length; i++) {
			int num = A[i];
			if (num > LIS[answer - 1]) {
				answer++;
				LIS[answer - 1] = num;
			} else {
				int left = 0;
				int right = answer - 1;
				int ans = 0;

				while (left < right) {
					int mid = (left + right) / 2;
					if (LIS[mid] >= num) {
						right = mid;
					} else {
						left = mid + 1;
						ans = left;
					}
				}
				LIS[ans] = num;
			}
		}
		return answer;
	}
}