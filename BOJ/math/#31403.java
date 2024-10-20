import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Info: BOJ#31403 A+B-C
 * Ref: https://www.acmicpc.net/problem/31403
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = 3;
        int[] A = new int[N];
        String[] B = new String[N];
        for (int i = 0; i < N; i++) {
            B[i] = br.readLine();
            A[i] = Integer.parseInt(B[i]);
        }
        bw.write(A[0] + A[1] - A[2] + "\n");
        bw.write(Integer.parseInt(B[0] + B[1]) - Integer.parseInt(B[2]) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}