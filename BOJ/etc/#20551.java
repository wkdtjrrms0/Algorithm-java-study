import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Info: BOJ#20551 Sort 마스터 배지훈의 후계자
 * Ref: https://www.acmicpc.net/problem/20551
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(A);
        for (int i = 0; i < M; i++) {
            solution(N, A, Integer.parseInt(br.readLine()), sb);
        }
        System.out.println(sb);
    }

    private static void solution(int N, int[] A, int D, StringBuilder sb) {
        int left = 0, right = N - 1;
        int answer = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] < D) {
                left = mid + 1;
            } else {
                if (A[mid] == D) answer = mid;
                right = mid - 1;
            }
        }
        sb.append(answer).append('\n');
    }
}