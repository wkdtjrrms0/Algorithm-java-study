import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Stack;

/**
 * Info: BOJ#10773 제로
 * Ref: https://www.acmicpc.net/problem/10773
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> money = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        int n;
        for (int i = 0; i < K; i++) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                if (!money.isEmpty()) {
                    money.pop();
                }
            } else {
                money.push(n);
            }
        }
        int r = 0;
        while (!money.isEmpty()) {
            r += money.pop();
        }

        bw.write(Integer.toString(r));
        bw.flush();
        br.close();
        bw.close();
    }
}