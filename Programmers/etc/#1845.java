import java.io.IOException;

/**
 * Info: Programmers#1845 폰켓몬
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java
 */
public class Main {
	public static void main(String[] args) throws IOException {
		// case 1
		int[] nums = {3,1,2,3};
		// case 2
//		int[] nums = {3,3,3,2,2,4};
		// case 3
//		int[] nums = {3,3,3,2,2,2};

		System.out.println(solution(nums));
	}

	public static int solution(int[] nums) {
		boolean[] chk = new boolean[200001];
		
		for (int n : nums) {
			chk[n] = true;
		}
		
		int answer = 0;
		for (int n = 1; n <= 200000; n++) {
			if (chk[n]) {
				answer++;
			}
			
			if (answer == nums.length / 2) {
				break;
			}
		}
		
		return answer;
	}
}