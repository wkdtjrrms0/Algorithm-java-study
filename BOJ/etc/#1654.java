import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Info: BOJ#1654 랜선 자르기
 * Ref: https://www.acmicpc.net/problem/1654
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] LanLength = new int[K];

        long maxLen = 0;
        for (int i = 0; i < K; i++) {
            LanLength[i] = Integer.parseInt(br.readLine());
            maxLen = Math.max(maxLen, LanLength[i]);
        }

        // 이진 탐색 초기화
        long low = 1;
        long high = maxLen;
        long result = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long count = 0;

            // 현재 mid로 자를 수 있는 랜선 개수 계산
            for (int length : LanLength) {
                count += length / mid;
            }

            if (count >= N) {
                result = mid;  // 가능한 최대 길이를 저장
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}