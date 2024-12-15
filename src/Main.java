import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

/**
 * Info: BOJ#2480 주사위 세개
 * Ref: https://www.acmicpc.net/problem/2480
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		if (A == B && B == C) {
			bw.write(String.valueOf(10000 + (A * 1000)));
		} else if (A == B) {
			bw.write(String.valueOf(1000 + (A * 100)));
		} else if (B == C) {
			bw.write(String.valueOf(1000 + (B * 100)));
		} else if (C == A) {
			bw.write(String.valueOf(1000 + (C * 100)));
		} else {
			int max = 1;
			max = Math.max(A, B);
			max = Math.max(max, C);

			bw.write(String.valueOf(max * 100));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}