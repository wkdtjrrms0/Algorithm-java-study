import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.io.IOException;

/**
 * Info: BOJ#25314 코딩은 체육과목 입니다
 * Ref: https://www.acmicpc.net/problem/25314
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String result = "";
		for (int i = 0 ; i <= (N - 4) / 4 ; i++) {
			result += "long ";
		}
		
		result += "int";
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
}