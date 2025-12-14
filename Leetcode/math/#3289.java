import java.util.*;

/**
 * Info: Leetcode#3289 The Two Sneaky Numbers of Digitville
 * Ref: https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int[] nums = {0, 1, 1, 0};
        // CASE 2
//        int[] nums = {0,3,2,1,3,2};
        // CASE 3
        int[] nums = {7,1,5,4,3,4,6,0,9,5,8,2};

        System.out.println(Arrays.toString(getSneakyNumbers(nums)));
    }
    private static int[] getSneakyNumbers(int[] nums) {
        int[] answer = new int[2];
        int idx = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (idx < 2) {
                    answer[idx++] = nums[i];
                }
            }
        }

        return answer;
    }
}