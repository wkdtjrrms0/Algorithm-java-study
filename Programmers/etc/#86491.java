import java.io.IOException;
/**
 * Info: Programmers#86491 최소직사각형
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/86491?language=java
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // case 1
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        // case 2
//    	int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
    	
    	// case 3
//    	int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
    	
        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
    	int maxWidth = 0;
    	int maxHeight = 0;
		for (int[] p : sizes) {
			maxWidth = Math.max(maxWidth, Math.max(p[0],p[1]));
			maxHeight = Math.max(maxHeight, Math.min(p[0],p[1]));
		}
    	return maxWidth * maxHeight;
    }
}