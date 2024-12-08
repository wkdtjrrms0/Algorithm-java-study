import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;

/**
 * Info: BOJ#1764 듣보잡
 * Ref: https://www.acmicpc.net/problem/1764
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if (set.contains(s)) {
                result.add(s);
            }
        }
        Collections.sort(result);

        bw.write(String.valueOf(result.size()) + '\n');
        for (String s : result) {
            bw.write(s + "\n");
        }
        bw.close();
        br.close();
    }
}