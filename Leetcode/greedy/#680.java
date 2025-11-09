import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Info: Leetcode#680 Valid Palindrome II
 * Ref: https://leetcode.com/problems/valid-palindrome-ii
 */
public class Main {
    private static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        // CASE 1
        String s = "aba";
        // CASE 2
//        String s = "abca";
        // CASE 3
//        String s = "abc";
        System.out.println(validPalindrome(s));
    }
    private static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}