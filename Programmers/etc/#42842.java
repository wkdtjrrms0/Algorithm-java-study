import java.io.IOException;
import java.util.Arrays;
/**
 * Info: Programmers#42842 카펫
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/42842?language=java
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // case 1
		int brown = 10; int yellow = 2;

        // case 2
//		int brown = 8; int yellow = 1;
    	
    	// case 3
//		int brown = 24; int yellow = 24;
    	
        System.out.println(Arrays.toString(solution(brown, yellow)));
    }

    public static int[] solution(int brown, int yellow) {
    	int[] answer = {0, 0};
    	
    	int sum = brown + yellow;
    	int edgeSum = 0;
    	for (int width = sum / 3; width >= 0 ; width--) {
    		int height = sum / width;
    		if (sum == width * height) {
    			edgeSum = 2 * width + 2 * (height - 2);
    			if (edgeSum == brown) {
    				answer[0] = width;
        			answer[1] = height;
        			break;
    			}
    		}
    	}
    	
    	
        return answer;
    }
}