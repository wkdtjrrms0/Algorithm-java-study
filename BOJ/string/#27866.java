import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Info: BOJ#27866 문자와 문자열
 * Ref: https://www.acmicpc.net/problem/27866
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        bw.write(S.charAt(i - 1));
        bw.flush();
        bw.close();
        br.close();
    }
}