import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.io.IOException;

/**
 * Info: Programmers#42586 기능개발
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java
 */
public class Main {
	public static void main(String[] args) throws IOException {
		// case 1
//		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		// case 2
		int[] arr = {4, 4, 4, 3, 3};
		
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	public static int[] solution(int []arr) {
		Deque<Integer> q = new ArrayDeque<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (q.size() == 0 || q.peekLast() != arr[i]) {
				q.offer(arr[i]);
			}
		}
		
		int[] answer = q.stream()
				.mapToInt(t -> t)
				.toArray();

        return answer;
    }
}