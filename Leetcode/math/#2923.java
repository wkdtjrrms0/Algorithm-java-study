import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Info: Leetcode#2923 Find Champion I
 * Ref: https://leetcode.com/problems/find-champion-i
 */
public class Main {
    private static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        // CASE 1
//        int[][] grid = {{0,1},{0,0}};
        // CASE 2
        int[][] grid = {{0,0,1},{1,0,1},{0,0,0}};
        System.out.println(findChampion(grid));
    }
    private static int findChampion(int[][] grid) {
        int n = grid.length;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    if (answer == j || answer == Integer.MIN_VALUE) {
                        answer = i;
                    }
                }
            }
        }
        return answer;
    }
}