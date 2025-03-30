import java.io.IOException;
import java.util.Arrays;

/**
 * Info: Programmers#43238 입국심사
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/43238?language=java
 */
public class Main {
	public static void main(String[] args) throws IOException {
		// case 1
		int n = 6;
		int[] times = {7, 10};

		System.out.println(solution(n, times));
	}

	public static long solution(int n, int[] times) {
		Arrays.sort(times);
		long answer = 0;
		long left = 0;
		long right = (long) times[times.length - 1] * n;

		while (left <= right) {
			long mid = (left + right) / 2;
			long p = 0;
            for (int time : times) {
                p += mid / time;
            }
			if (p < n) {
				left = mid + 1;
			} else {
				right = mid - 1;
				answer = mid;
			}
		}
		return answer;
	}
}