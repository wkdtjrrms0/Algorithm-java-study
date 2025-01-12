import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.io.IOException;
import java.util.List;

/**
 * Info: Programmers#42586 기능개발
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java
 */
public class Main {
	public static void main(String[] args) throws IOException {
		// case 1
//		int[] progresses = {93, 30, 55};
//		int[] speeds = {1, 30, 5};

		// case 2
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		System.out.println(Arrays.toString(solution(progresses, speeds)));
	}

	public static int[] solution(int[] progresses, int[] speeds) {

		Deque<Integer> q = new ArrayDeque<>();

		for (int i = 0; i < progresses.length; i++) {
			int remainingDays = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
			q.offer(remainingDays);
		}

		List<Integer> deployments = new ArrayList<>();

		while (!q.isEmpty()) {
			int current = q.poll();
			int count = 1;

			while (!q.isEmpty() && q.peek() <= current) {
				q.poll();
				count++;
			}

			deployments.add(count);
		}

		return deployments.stream().mapToInt(i -> i).toArray();
	}
}