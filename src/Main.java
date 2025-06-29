import java.io.*;
import java.util.*;

/**
 * Info: BOJ#9024
 * Ref: https://www.acmicpc.net/problem/9024
 */
public class Main {
	static int T, n, K;
	static int[] numbers;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder result = new StringBuilder();
		T = Integer.parseInt(br.readLine());

		for (int c = 0; c < T; c++) {
			StringTokenizer tokenizer = new StringTokenizer(br.readLine());
			n = Integer.parseInt(tokenizer.nextToken());
			K = Integer.parseInt(tokenizer.nextToken());
			numbers = new int[n];

			tokenizer = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				numbers[i] = Integer.parseInt(tokenizer.nextToken());
			}

			Arrays.sort(numbers);
			int closestDiff = Integer.MAX_VALUE;
			int count = 0;

			for (int i = 0; i < n; i++) {
				int current = numbers[i];
				int left = i + 1;
				int right = n - 1;

				while (left <= right) {
					int mid = (left + right) / 2;
					int sum = current + numbers[mid];
					int diff = Math.abs(K - sum);

					if (diff < closestDiff) {
						closestDiff = diff;
						count = 1;
					} else if (diff == closestDiff) {
						count++;
					}

					if (sum < K) {
						left = mid + 1;
					} else {
						right = mid - 1;
					}
				}
			}

			result.append(count).append("\n");
		}

		bw.write(result.toString());
		bw.flush();
		bw.close();
	}
}
