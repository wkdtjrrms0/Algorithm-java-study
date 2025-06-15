import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Info: BOJ#15953
 * Ref: https://www.acmicpc.net/problem/15953
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			solution(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), sb);
		}
		System.out.println(sb);
	}

	private static void solution(int a, int b, StringBuilder sb) {
		int sum = 0;
		if (a == 0) {
			sum += 0;
		} else if (a <= 1) {
			sum += 5000000;
		} else if (a <= 3) {
			sum += 3000000;
		} else if (a <= 6) {
			sum += 2000000;
		} else if (a <= 10) {
			sum += 500000;
		} else if (a <= 15) {
			sum += 300000;
		} else if (a <= 21) {
			sum += 100000;
		}

		if (b == 0) {
			sum += 0;
		} else if (b <= 1) {
			sum += 5120000;
		} else if (b <= 3) {
			sum += 2560000;
		} else if (b <= 7) {
			sum += 1280000;
		} else if (b <= 15) {
			sum += 640000;
		} else if (b <= 31) {
			sum += 320000;
		}

		sb.append(sum).append("\n");
	}
}