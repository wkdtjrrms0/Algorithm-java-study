import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Info: Leetcode#1 Two Sum
 * Ref: https://leetcode.com/problems/two-sum
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int[] nums = {2,7,11,15}; int target = 9;
        // CASE 2
        int[] nums = {3,2,4}; int target = 6;
        // CASE 3
//        int[] nums = {3, 3}; int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    private static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}