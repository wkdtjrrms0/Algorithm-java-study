import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.io.IOException;

/**
 * Info: BOJ#1620 나는야 포켓몬 마스터 이다솜
 * Ref: https://www.acmicpc.net/problem/1620
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<Integer, String> idToName = new HashMap<>();
		Map<String, Integer> nameToId = new HashMap<>();
		
		String info;
		for (int i = 0; i < N; i++) {
			info = br.readLine();
			idToName.put(i + 1, info);
			nameToId.put(info, i + 1);
		}
		
		String request;
		for (int i = 0; i < M; i++) {
			request = br.readLine();
			if (isInteger(request)) {
				bw.write(idToName.get(Integer.parseInt(request)) + "\n");
			} else {
				bw.write(nameToId.get(request) + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean isInteger(String strValue) {
		try {
			Integer.parseInt(strValue);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}
}