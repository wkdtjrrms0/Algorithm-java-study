import java.util.*;

/**
 * Info: Leetcode#2367 Number of Arithmetic Triplets
 * Ref: https://leetcode.com/problems/number-of-arithmetic-triplets/?envType=problem-list-v2&envId=v8lmo911&v
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int[] nums = {0,1,4,6,7,10};
//        int diff = 3;
        // CASE 2
        int[] nums = {4,5,6,7,8,9};
        int diff = 2;

        System.out.println(arithmeticTriplets(nums, diff));
    }

    private static int arithmeticTriplets(int[] nums, int diff) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (isArithmeticTriplets(nums, i, diff)) {
                answer++;
            }
        }
        return answer;
    }

    private static boolean isArithmeticTriplets(int[] nums, int startIdx, int diff) {
        int cnt = 1;
        int bfNum = nums[startIdx] + diff;
        for (int i = startIdx; i < nums.length; i++) {
            int n = nums[i];
            if (n == bfNum) {
                bfNum = n + diff;
                cnt++;
                if (cnt == 3) {
                    return true;
                }
            } else if (n > nums[startIdx] + 2 * diff) {
                return false;
            }
        }
        return false;
    }
}