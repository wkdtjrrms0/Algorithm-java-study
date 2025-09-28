import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Info: BOJ#32404 일이 커졌어
 * Ref: https://www.acmicpc.net/problem/32404
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];

        int mid = N / 2 + 1;
        answer[0] = mid;
        for (int i = 2; i < N; i += 2) {
            answer[i] = answer[i - 2] + 1;
        }
        if (N > 1) {
            answer[1] = mid - 1;
            for (int i = 3; i < N; i += 2) {
                answer[i] = answer[i - 2] - 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(answer[i]).append(" ");
        }

        System.out.println(sb);
    }
}
