import java.util.*;

/**
 * Info: Leetcode#2570 Merge Two 2D Arrays by Summing Values
 * Ref: https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int[][] nums1 = {{1, 2}, {2, 3}, {4, 5}};
//        int[][] nums2 = {{1, 4}, {3, 2}, {4, 1}};
        // CASE 2
        int[][] nums1 = {{2, 4}, {3, 6}, {5, 5}};
        int[][] nums2 = {{1, 3}, {4, 3}};

        System.out.println(Arrays.deepToString(mergeArrays(nums1, nums2)));
    }
    private static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] arr : nums1) {
            map.put(arr[0], map.getOrDefault(arr[0], 0) + arr[1]);
        }
        for (int[] arr : nums2) {
            map.put(arr[0], map.getOrDefault(arr[0], 0) + arr[1]);
        }

        List<int[]> result = new ArrayList<>();
        for (int id : map.keySet()) {
            result.add(new int[]{id, map.get(id)});
        }
        result.sort((a, b) -> Integer.compare(a[0], b[0]));

        return result.toArray(new int[result.size()][]);
    }
}