import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Info: BOJ#1919 애너그램 만들기
 * Ref: https://www.acmicpc.net/problem/1919
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        for(int i = 0; i < str1.length(); i++) {
            cnt1[str1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < str2.length(); i++) {
            cnt2[str2.charAt(i) - 'a']++;
        }

        int cnt = 0;
        for(int i = 0; i < 26; i++) {
            cnt += Math.abs(cnt1[i] - cnt2[i]);
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}