import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
/**
 * Info: Programmers#42587 프로세스
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/42587?language=java
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // case 1
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2;

        // case 2
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i : priorities) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;

                    if (location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}