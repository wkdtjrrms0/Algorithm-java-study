import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Info: Leetcode#2373 Largest Local Values in a Matrix
 * Ref: https://leetcode.com/problems/largest-local-values-in-a-matrix
 */
public class Main {
    private static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        // CASE 1
        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        // CASE 2
//        int[][] grid = {{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        System.out.println(Arrays.deepToString(largestLocal(grid)));
    }
    private static int[][] largestLocal(int[][] grid) {
        int N = grid.length;
        int[][] answer = new int[N - 2][N - 2];
        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < N - 2; j++) {
                answer[i][j] = getMaxVal(grid, i, j);
            }
        }
        return answer;
    }
    private static int getMaxVal(int[][] grid, int i, int j) {
        int maxVal = Integer.MIN_VALUE;
        for (int k = i; k < i + 3; k++) {
            for (int p = j; p < j + 3; p++) {
                maxVal = Math.max(grid[k][p], maxVal);
            }
        }
        return maxVal;
    }
}