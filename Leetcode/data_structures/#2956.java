import java.util.Arrays;

/**
 * Info: Leetcode#2956 Find Common Elements Between Two Arrays
 * Ref: https://leetcode.com/problems/find-common-elements-between-two-arrays
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int[] nums1 = {2,3,2}, nums2 = {1,2};
        // CASE 2
//        int[] nums1 = {4,3,2,3,1}, nums2 = {2,2,5,2,3,6};
        // CASE 3
        int[] nums1 = {3,4,2,3}, nums2 = {1,5};

        System.out.println(Arrays.toString(findIntersectionValues(nums1, nums2)));
    }
    private static int[] findIntersectionValues(int[] nums1, int[] nums2) {
    	int answer1 = 0, answer2 = 0;

    	for (int i : nums1) {
    		for (int j : nums2) {
    			if (i == j) {
    				answer1++;
    				break;
    			}
    		}
    	}
    	
    	for (int i : nums2) {
    		for (int j : nums1) {
    			if (i == j) {
    				answer2++;
    				break;
    			}
    		}
    	}
    	
    	return new int[] {answer1, answer2};
    }
}