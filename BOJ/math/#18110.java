import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * Info: BOJ#18110 solved.ac
 * Ref: https://www.acmicpc.net/problem/18110
 */
public class Main {
	 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
        bw.write(Integer.toString(calculateDifficulty(arr)));
        bw.flush();
        bw.close();
        br.close();
	}
 
	private static int calculateDifficulty(int[] arr) {
		int exclusionCount = (int) Math.round(arr.length * 0.15);
		float difficulty = 0;
		
		for (int i = exclusionCount; i < arr.length - exclusionCount; i++) {
			difficulty += arr[i];
		}
		
		difficulty = (int) Math.round(difficulty / (arr.length - exclusionCount * 2));
		
		
		return (int) difficulty;
	}
}