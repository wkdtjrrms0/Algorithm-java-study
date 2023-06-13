import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Info: BOJ#9086 문자열
 * Ref: https://www.acmicpc.net/problem/9086
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String str = "";
        for(int i = 0; i < T; i++) {
            str = br.readLine();
            bw.write(String.valueOf(str.charAt(0)));
            bw.write(String.valueOf(str.charAt(str.length() - 1)));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}