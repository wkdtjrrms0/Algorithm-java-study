import java.util.*;

/**
 * Info: Leetcode#1470 Shuffle the Array
 * Ref: https://leetcode.com/problems/shuffle-the-array/?envType=problem-list-v2&envId=v8lmo911
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int[] nums = {2,5,1,3,4,7}; int n = 3;
        // CASE 2
//        int[] nums = {1,2,3,4,4,3,2,1}; int n = 4;
        // CASE 3
        int[] nums = {1,1,2,2}; int n = 2;

        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] answer = new int[2 * n];

        System.arraycopy(nums, 0, arr1, 0, n);
        System.arraycopy(nums, n, arr2, 0, n);

        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                answer[i] = arr1[i / 2];
            } else {
                answer[i] = arr2[i / 2];
            }
        }

        return answer;
    }
}