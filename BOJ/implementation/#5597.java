import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Info: BOJ#5597 과제 안 내신 분..?
 * Ref: https://www.acmicpc.net/problem/5597
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] submitted = new boolean[31];
        for (int i = 0; i < 28; i++) {
            submitted[Integer.parseInt(br.readLine())] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}