import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Info: BOJ#11663 선분 위의 점
 * Ref: https://www.acmicpc.net/problem/11663
 */
public class Main {
    static int N;
    static int M;
    static int[] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        a = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            System.out.println(solution(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
    }

    private static int solution(int x1, int x2) {
        return upperBound(x2) - lowerBound(x1);
    }

    private static int upperBound(int x) {
        int left = 0, right = N;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] <= x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private static int lowerBound(int x) {
        int left = 0, right = N;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}