import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Info: BOJ#15810 풍선 공장
 * Ref: https://www.acmicpc.net/problem/15810
 */
public class Main {

    static int N;
    static long M;
    static long[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Long.parseLong(st.nextToken());

        A = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);
        System.out.println(solution());
    }

    private static long solution() {
        long left = 1;
        long right = A[0] * M;
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
        for (long a : A) {
            cnt += mid / a;
            if (cnt >= M) return true;
        }
        return false;
    }
}
