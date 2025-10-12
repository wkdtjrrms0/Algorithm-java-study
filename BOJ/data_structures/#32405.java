import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Info: BOJ#32405 배틀 로얄
 * Ref: https://www.acmicpc.net/problem/32405
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] d = new int[N];
        int[] h = new int[N];
        StringTokenizer ds = new StringTokenizer(br.readLine());
        StringTokenizer hs = new StringTokenizer(br.readLine());
        Queue<Integer> surviveUserQueue = new LinkedList<>();
        for (int i = 0; i < N; i ++) {
            surviveUserQueue.offer(i + 1);
            d[i] = Integer.parseInt(ds.nextToken());
            h[i] = Integer.parseInt(hs.nextToken());
        }

        System.out.println(getAnswer(d, h, surviveUserQueue));
    }

    private static int getAnswer(int[] d, int[] h, Queue<Integer> surviveUserQueue) {
        while (surviveUserQueue.size() > 1) {
            int attackSum = 0;
            int repeatCnt = surviveUserQueue.size();
            for (int i = 0; i < repeatCnt; i++) {
                int userNum = surviveUserQueue.poll();
                if (h[userNum - 1] - attackSum > 0) {
                    attackSum += d[userNum - 1];
                    surviveUserQueue.offer(userNum);
                }
            }
            repeatCnt = surviveUserQueue.size();
            for (int i = 0; i < repeatCnt; i++) {
                int userNum = surviveUserQueue.poll();
                h[userNum - 1] -= (attackSum - d[userNum - 1]);
                if (h[userNum - 1] > 0) {
                    surviveUserQueue.offer(userNum);
                }
            }
        }
        return surviveUserQueue.peek();
    }
}
