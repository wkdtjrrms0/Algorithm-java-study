import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Info: Programmers#42583 다리를 지나는 트럭
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/42583?language=java
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // case 1
//		int bridge_length = 2; int weight = 10; int[] truck_weights = {7,4,5,6};
        // case 2
//		int bridge_length = 100; int weight = 100; int[] truck_weights = {10};
        // case 3
        int bridge_length = 100; int weight = 100; int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        int time = 0;

        for (int truck : truck_weights) {
            while(true) {
                if (q.isEmpty()) {
                    q.offer(truck);
                    sum += truck;
                    time++;
                    break;
                } else if (q.size() == bridge_length) {
                    sum -= q.poll();
                } else {
                    if (sum + truck <= weight) {
                        q.offer(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {
                        q.offer(0);
                        time++;
                    }
                }
            }
        }

        return time + bridge_length;
    }
}