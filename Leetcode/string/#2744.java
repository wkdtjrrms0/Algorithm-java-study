import java.util.*;

/**
 * Info: Leetcode#2744 Find Maximum Number of String Pairs
 * Ref: https://leetcode.com/problems/find-maximum-number-of-string-pairs
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
        String[] words = {"cd","ac","dc","ca","zz"};
        // CASE 2
//        String[] words = {"ab","ba","cc"};
        // CASE 3
//        String[] words = {"aa","ab"};

        System.out.println(maximumNumberOfStringPairs(words));
    }
    private static int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int count = 0;
        for (String w : words) {
            String rev = "" + w.charAt(1) + w.charAt(0);
            if (set.contains(rev)) {
                count++;
                set.remove(rev);
            }
            else {
                set.add(w);
            }
        }
        return count;
    }
}