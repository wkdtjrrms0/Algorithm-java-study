import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Info: BOJ#2512 예산
 * Ref: https://www.acmicpc.net/problem/2512
 */
public class Main {

    static int[] reqBudget;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        reqBudget = new int[N];
        for(int i = 0; i < N; i++) {
            reqBudget[i] = Integer.parseInt(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());
        System.out.println(solution(N));
    }

    private static int solution(int N) {
        Arrays.sort(reqBudget);
        int left = M / N;
        int right = reqBudget[N - 1];
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
        for (int n : reqBudget) {
            if (n > mid) {
                sum += mid;
            } else {
                sum += n;
            }
        }

        return sum <= M;
    }
}