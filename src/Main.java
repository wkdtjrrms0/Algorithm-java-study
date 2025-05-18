import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Info: BOJ#2776 암기왕
 * Ref: https://www.acmicpc.net/problem/2776
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int note1 = Integer.parseInt(br.readLine());
			int[] note1Num = new int[note1];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < note1; j++) {
				note1Num[j] = Integer.parseInt(st.nextToken());
			}
			int note2 = Integer.parseInt(br.readLine());
			int[] note2Num = new int[note2];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < note2; j++) {
				note2Num[j] = Integer.parseInt(st.nextToken());
			}
			solution(note1, note1Num, note2Num, sb);
		}
		System.out.println(sb);
	}

	private static void solution(int note1, int[] note1Num, int[] note2Num, StringBuilder sb) {
		Arrays.sort(note1Num);
		for (int n : note2Num) {
			int left = 0;
			int right = note1 - 1;
			int mid;
			int result = 0;
			while (left <= right) {
				mid = (left + right) / 2;
				if (note1Num[mid] == n) {
					result = 1;
					break;
				} else if (note1Num[mid] > n) {
					right = mid - 1;
				} else if (note1Num[mid] < n) {
					left = mid + 1;
				}
			}
			sb.append(result).append('\n');
		}
	}
}