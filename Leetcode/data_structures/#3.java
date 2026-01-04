import java.util.*;

/**
 * Info: Leetcode#3 Longest Substring Without Repeating Characters
 * Ref: https://leetcode.com/problems/longest-substring-without-repeating-characters
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
        String s = "abcabcbb";
        // CASE 2
//        String s = "bbbbb";
        // CASE 3
//        String s = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s));
    }
    private static int lengthOfLongestSubstring(String s) {
        int prev = 0;
        int idx = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        while(idx < s.length()) {
            char curn = s.charAt(idx);
            if(!set.contains(curn)) {
                set.add(curn);
                idx++;
                max = Math.max(max, set.size());
            }
            else {
                set.remove(s.charAt(prev));
                prev++;
            }
        }
        return max;
    }
}