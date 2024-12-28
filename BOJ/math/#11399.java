import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

/**
 * Info: BOJ#11399 ATM
 * Ref: https://www.acmicpc.net/problem/11399
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] P = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(P);
		int result = P[0];
		for (int i = 0;i < N - 1; i++) {
			P[i + 1] += P[i];
			result += P[i + 1];
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}