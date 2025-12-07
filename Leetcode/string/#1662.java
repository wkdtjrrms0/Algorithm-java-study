import java.util.*;

/**
 * Info: Leetcode#1662 Check If Two String Arrays are Equivalent
 * Ref: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        // CASE 2
//        String[] word1 = {"a", "cb"}, word2 = {"ab", "c"};
        // CASE 3
        String[] word1 = {"abc", "d", "defg"}, word2 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder word1String = new StringBuilder();
        StringBuilder word2String = new StringBuilder();
        for (String word : word1) {
            word1String.append(word);
        }
        for (String word : word2) {
            word2String.append(word);
        }
        return word1String.compareTo(word2String) == 0;
    }
}