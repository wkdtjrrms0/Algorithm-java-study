import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
/**
 * Info: BOJ#11279 최대 힙
 * Ref: https://www.acmicpc.net/problem/11279
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] calc = new int[N];
        for (int i = 0; i < N; i++) {
            calc[i] = Integer.parseInt(br.readLine());
        }

        solution(calc);
    }

    public static void solution(int[] calc) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i : calc) {
            queue.offer(i);
            if (i == 0) {
                System.out.println(queue.poll());
            }
        }
    }
}