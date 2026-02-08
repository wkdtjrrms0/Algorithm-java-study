import java.util.*;

/**
 * Info: Leetcode#448 Find All Numbers Disappeared in an Array
 * Ref: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/?envType=problem-list-v2&envId=v8lmo911
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
        int[] nums = {4,3,2,7,8,2,3,1};
        // CASE 2
//        int[] nums = {1,1};

        System.out.println(findDisappearedNumbers(nums));
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}