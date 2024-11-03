import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * Info: BOJ#1181 단어 정렬
 * Ref: https://www.acmicpc.net/problem/1181
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] tmp = new String[N];

        for (int i = 0; i < N; i++) {
            tmp[i] = br.readLine();
        }

        Arrays.sort(tmp, (t1, t2) -> {
            if (t1.length() != t2.length()) {
                return t1.length() - t2.length();
            } else {
                return t1.compareTo(t2);
            }
        });

        bw.write(tmp[0] + "\n");
        for (int i = 1; i < N; i++) {
            if (!tmp[i].equals(tmp[i - 1])) {
                bw.write(tmp[i] + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}