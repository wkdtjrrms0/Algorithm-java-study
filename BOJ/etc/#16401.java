import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Info: BOJ#16401 과자 나눠주기
 * Ref: https://www.acmicpc.net/problem/16401
 */
public class Main {

    static int M;
    static int N;
    static int[] L;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        L = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            L[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution());
    }

    private static int solution() {
        Arrays.sort(L);
        int left = 1;
        int right = L[N - 1];
        int mid;
        int answer = 0;

        while(left <= right) {
            mid = (left + right) / 2;
            if (isOK(mid)) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    private static boolean isOK(int mid) {
        int sum = 0;
        for (int n : L) {
            sum += n / mid;
        }

        return M <= sum;
    }
}