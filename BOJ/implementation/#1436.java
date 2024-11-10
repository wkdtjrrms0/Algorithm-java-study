import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Info: BOJ#1436 영화감독 숌
 * Ref: https://www.acmicpc.net/problem/1436
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int startNum = 0;
        for (int i = 1; i <= N; i++) {
            startNum = getNextFinalNum(startNum + 1);
        }

        bw.write(Integer.toString(startNum));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int getNextFinalNum(int startNum) {
        for (int i = startNum; i < Integer.MAX_VALUE; i++) {
            if (isFinalNum(i)) {
                return i;
            }
        }
        return startNum;
    }

    private static boolean isFinalNum(int num) {
        String s = String.valueOf(num);
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == '6' && s.charAt(i + 1) == '6' && s.charAt(i + 2) == '6') {
                return true;
            }
        }
        return false;
    }
}