import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Info: BOJ#15964 이상한 기호
 * Ref: https://www.acmicpc.net/problem/15964
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        bw.write(String.valueOf(calcAB(A, B)));
        bw.flush();
        bw.close();
        br.close();
    }

    private static long calcAB(long A, long B) {
        return (A + B) * (A - B);
    }
}