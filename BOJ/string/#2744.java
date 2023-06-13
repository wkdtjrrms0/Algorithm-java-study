import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Info: BOJ#2744 대소문자 바꾸기
 * Ref: https://www.acmicpc.net/problem/2744
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z') {
                bw.write((char)(c - 32));
            } else if(c >= 'A' && c <= 'Z') {
                bw.write((char)(c + 32));
            } else {
                bw.write(c);
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}