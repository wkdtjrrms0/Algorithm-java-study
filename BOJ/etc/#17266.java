import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Info: BOJ#17266 어두운 굴다리
 * Ref: https://www.acmicpc.net/problem/17266
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] x = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(N, M, x));
    }

    private static int solution(int N, int M, int[] x) {
        int left = 1;
        int right = N;
        int answer = N;

        while (left <= right) {
            int mid = (left + right) / 2;
            int prev = 0;
            boolean possible = true;

            for (int i = 0; i < M; i++) {
                int lightStart = x[i] - mid;
                int lightEnd = x[i] + mid;

                if (lightStart > prev) {
                    possible = false;
                    break;
                }

                prev = lightEnd;
            }

            if (prev < N) possible = false;

            if (possible) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}