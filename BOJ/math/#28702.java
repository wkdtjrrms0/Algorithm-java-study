import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Info: BOJ#28702 FizzBuzz
 * Ref: https://www.acmicpc.net/problem/28702
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = 3;
        String tmp;
        int i = 0;
        for (int j = 0; j < N; j++) {
            tmp = br.readLine();
            if (!"Fizz".equals(tmp) && !"Buzz".equals(tmp) && !"FizzBuzz".equals(tmp)) {
                i = Integer.parseInt(tmp) + N - j;
            }
        }

        if (i % 3 == 0 && i % 5 == 0) {
            bw.write("FizzBuzz");
        } else if (i % 3 == 0) {
            bw.write("Fizz");
        } else if (i % 5 == 0) {
            bw.write("Buzz");
        } else {
            bw.write(String.valueOf(i));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}