import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Info: BOJ#1590 캠프가는 영식
 * Ref: https://www.acmicpc.net/problem/1590
 */
public class Main {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int I = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            solution(T, S, I, C);
        }
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }

    private static void solution(int T, int S, int I, int C) {
        int answer = -1;
        if (T <= S) {
            answer = S - T;
        } else {
            int k = (T - S + I - 1) / I;
            if (k < C) {
                answer = S + k * I - T;
            }
        }
        if (answer != -1) {
            min = Math.min(min, answer);
        }
    }
}