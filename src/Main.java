import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Info: BOJ#2417 정수 제곱근
 * Ref: https://www.acmicpc.net/problem/2417
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		System.out.println(solution(N));
	}

	private static long solution(long N) {
		long left = 0, right = N;
		long answer = N;
		while (left <= right) {
			long mid = (left + right) / 2;
			if (mid > 0 && mid > N / mid) {
				right = mid - 1;
			} else {
				answer = mid;
				left = mid + 1;
			}
		}
		if (answer * answer >= N) {
			return answer;
		} else {
			return answer + 1;
		}
	}
}