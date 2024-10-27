import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Info: BOJ#30802 웰컴 키트
 * Ref: https://www.acmicpc.net/problem/30802
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] size = new int[6];

        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());

        int resultA = 0;
        for (int i = 0; i < 6; i++) {
            resultA += size[i] / T + 1;
            if (size[i] % T == 0) {
                resultA -= 1;
            }
        }
        String resultB = N / P + " " + N % P;

        bw.write(String.valueOf(resultA) + "\n");
        bw.write(resultB);
        bw.flush();
        bw.close();
        br.close();
    }
}