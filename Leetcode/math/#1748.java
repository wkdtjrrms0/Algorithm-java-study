import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Info: Leetcode#1748 Sum of Unique Elements
 * Ref: https://leetcode.com/problems/sum-of-unique-elements
 */
public class Main {
    private static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        // CASE 1
//        int[] nums = {1,2,3,2};
        // CASE 2
//        int[] nums = {1,1,1,1,1};
        // CASE 3
        int[] nums = {1,2,3,4,5};
        System.out.println(sumOfUnique(nums));
    }
    private static int sumOfUnique(int[] nums) {
        int[] distinctNums = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() == 1)
            .mapToInt(e -> e.getKey())
            .toArray();
        int answer = 0;
        for (int n : distinctNums) {
            answer += n;
        }
        return answer;
    }
}