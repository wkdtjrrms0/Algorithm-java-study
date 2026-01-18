import java.util.*;

/**
 * Info: Leetcode#836 Rectangle Overlap
 * Ref: https://leetcode.com/problems/rectangle-overlap
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int[] rec1 = {0,0,2,2}, rec2 = {1,1,3,3};
        // CASE 2
//        int[] rec1 = {0,0,1,1}, rec2 = {1,0,2,1};
        // CASE 3
//        int[] rec1 = {0,0,1,1}, rec2 = {2,2,3,3};
        // CASE 4
        int[] rec1 = {5,15,8,18}, rec2 = {0,3,7,9};

        System.out.println(isRectangleOverlap(rec1, rec2));
    }
    private static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0])
                && Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1]);
    }
}