import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Info: Leetcode#1353 Maximum Number of Events That Can Be Attended
 * Ref: https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int[][] events = new int[][]{{1, 2}, {2, 3}, {3, 4}};
        // CASE 2
//        int[][] events = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 2}};
        // CASE 3
        int[][] events = new int[][]{{1,2},{1,2},{3,3},{1,5},{1,5}};

        System.out.println(maxEvents(events));
    }
    private static int maxEvents(int[][] events) {
        // 시작일 기준 정렬
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 종료일
        int day = 1;
        int i = 0;
        int answer = 0;

        while (i < events.length || !pq.isEmpty()) {
            // 오늘 시작 가능한 이벤트 모두 추가
            while (i < events.length && events[i][0] <= day) {
                pq.offer(events[i][1]);
                i++;
            }

            // 이미 끝난 이벤트 제거
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            // 오늘 참석
            if (!pq.isEmpty()) {
                pq.poll();
                answer++;
            }

            day++;
        }

        return answer;
    }
}