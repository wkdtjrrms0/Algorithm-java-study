import java.util.*;

/**
 * Info: Leetcode#1413 Minimum Value to Get Positive Step by Step Sum
 * Ref: https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int[] nums = {-3, 2, -3, 4, 2};
        // CASE 2
//        int[] nums = {1,2};
        // CASE 3
        int[] nums = {1,-2,-3};

        System.out.println(minStartValue(nums));
    }
    private static int minStartValue(int[] nums) {
        int startValue = 0;
        while(true) {
            startValue++;
            int sum = startValue;
            boolean isPositive = true;
            for (int i : nums) {
                sum += i;
                if (sum <= 0) {
                    isPositive = false;
                    break;
                }
            }
            if (isPositive) {
                break;
            }
        }
        return startValue;
    }
}