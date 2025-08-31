import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Info: BOJ#32400 다트판
 * Ref: https://www.acmicpc.net/problem/32400
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[20];
        for (int i = 0; i < 20; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int AliceSum = 0;
        for (int i = 0; i < 20; i++) {
            if (A[i] == 20) {
                if (i == 0) {
                    AliceSum = A[i] + A[i + 1] + A[19];
                } else if (i == 19) {
                    AliceSum = A[0] + A[i - 1] + A[i];
                } else {
                    AliceSum = A[i - 1] + A[i] + A[i + 1];
                }
            }
        }

        String answer;
        double AliceAvg = (double) AliceSum / 3;
        if (AliceAvg > 10.5) {
            answer = "Alice";
        } else if (AliceAvg < 10.5) {
            answer = "Bob";
        } else {
            answer = "Tie";
        }
        System.out.println(answer);
    }
}
