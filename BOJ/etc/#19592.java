import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Info: BOJ#19592 장난감 경주
 * Ref: https://www.acmicpc.net/problem/19592
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] V = new int[N];
            for (int j = 0; j < N; j++) {
                V[j] = Integer.parseInt(st.nextToken());
            }
            System.out.println(solution(N, X, Y, V));
        }
    }

    private static int solution(int N, int X, int Y, int[] V) {
        double[] spendTime = new double[N];
        for (int i = 0; i < N; i++) {
            spendTime[i] = (double) X / V[i];
        }
        double mySpendTimeWithoutBoost = spendTime[N - 1];
        Arrays.sort(spendTime);
        if ((spendTime[0] == mySpendTimeWithoutBoost) && (spendTime[0] != spendTime[1])) {
            return 0;
        } else if(spendTime[0] <= ((double) (X - Y) / V[N - 1]) + 1) {
            return -1;
        }

        int left = 0;
        int right = Y;
        int mid = (right + left) / 2;
        while (left <= right) {
            mid = (right + left) / 2;
            if (spendTime[0] == ((double) (X - mid) / V[N - 1]) + 1) {
                return mid + 1;
            } else if (spendTime[0] > ((double) (X - mid) / V[N - 1]) + 1) {
                right = mid - 1;
            } else if (spendTime[0] < ((double) (X - mid) / V[N - 1]) + 1) {
                left = mid + 1;
            }
        }
        return left;
    }
}