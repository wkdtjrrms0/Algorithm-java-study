import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Info: BOJ#17245 서버실
 * Ref: https://www.acmicpc.net/problem/17245
 */
public class Main {

    static int N;
    static long[][] rack;
    static long pcSum = 0;
    static long max = Long.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        rack = new long[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                long k = Long.parseLong(st.nextToken());
                rack[i][j] = k;
                pcSum += k;
                max = Math.max(max, k);
            }
        }
        System.out.println(solution());
    }

    private static long solution() {
        long left = 1;
        long right = max;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            if (isOK(mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    private static boolean isOK(long mid) {
        long cnt = 0;
        for (long[] i : rack) {
            for (long j : i) {
                if (j <= mid) {
                    cnt += j;
                } else {
                    cnt += mid;
                }
            }
        }
        double activePCRate = ((double) cnt / pcSum) * 100;
        return activePCRate >= 50;
    }
}
