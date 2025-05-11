import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Info: BOJ#4158 CD
 * Ref: https://www.acmicpc.net/problem/4158
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			if (N == 0 && M == 0) {
				break;
			}
			int[] SanggeunCD = new int[N];
			int[] SeonyeongCD = new int[M];
			for (int i = 0; i < N; i++) {
				SanggeunCD[i] = Integer.parseInt(br.readLine());
			}
			for (int i = 0; i < M; i++) {
				SeonyeongCD[i] = Integer.parseInt(br.readLine());
			}
			System.out.println(solution(N, M, SanggeunCD, SeonyeongCD));
		}
	}

	private static int solution(int N, int M, int[] SanggeunCD, int[] SeonyeongCD) {
		int result = 0;
		int s;
		int t;
		int[] source;
		int[] target;
		if (N > M) {
			s = M;
			t = N;
			source = SeonyeongCD;
			target = SanggeunCD;
		} else {
			s = N;
			t = M;
			source = SanggeunCD;
			target = SeonyeongCD;
		}

		for (int i = 0; i < s; i++) {
			int left = 0;
			int right = t - 1;
			while (left <= right) {
				int mid = (right + left) / 2;
				if (target[mid] == source[i]) {
					result++;
					break;
                } else if (target[mid] > source[i]) {
					right = mid - 1;
				} else if (target[mid] < source[i]) {
					left = mid + 1;
				}
			}
		}
		return result;
	}
}