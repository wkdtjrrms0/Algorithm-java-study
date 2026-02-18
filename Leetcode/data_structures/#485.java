import java.util.*;

/**
 * Info: Leetcode#485 Max Consecutive Ones
 * Ref: https://leetcode.com/problems/max-consecutive-ones/?envType=problem-list-v2&envId=v8lmo911&
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int[] nums = {1,1,0,1,1,1};
        // CASE 2
        int[] nums = {1,0,1,1,0,1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0;
        int tmpValue = 0;
        for (int i : nums) {
            if (i == 1) {
                tmpValue++;
                answer = Math.max(tmpValue, answer);
            } else {
                tmpValue = 0;
            }
        }
        return answer;
    }
}