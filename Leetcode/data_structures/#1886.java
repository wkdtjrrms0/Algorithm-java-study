import java.util.*;

/**
 * Info: Leetcode#1886 Determine Whether Matrix Can Be Obtained By Rotation
 * Ref: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/?envType=problem-list-v2&envId=v8lmo911&
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int[][] mat = {{0,1},{1,0}};
//        int[][] target = {{1,0},{0,1}};
        // CASE 2
//        int[][] mat = {{0,1},{1,1}};
//        int[][] target = {{1,0},{0,1}};
        // CASE 3
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};;

        System.out.println(findRotation(mat, target));
    }

    private static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            mat = rotate90(mat);
        }
        return false;
    }

    private static int[][] rotate90(int[][] input) {
        int n = input.length;
        int[][] output = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                output[i][j] = input[n - j - 1][i];
            }
        }
        return output;
    }
}