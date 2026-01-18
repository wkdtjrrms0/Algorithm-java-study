import java.util.*;

/**
 * Info: Leetcode#3065 Minimum Operations to Exceed Threshold Value I
 * Ref: https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int[] nums = {2, 11, 10, 1, 3}; int k = 10;
        // CASE 2
//        int[] nums = {1,1,2,4,9}; int k = 1;
        // CASE 3
        int[] nums = {1,1,2,4,9}; int k = 9;

        System.out.println(minOperations(nums, k));
    }
    private static int minOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int count = 0;
        for (int n : nums) {
            if (n < k) count++;
            else break;
        }

        return count;
    }
}