import java.util.*;

/**
 * Info: Leetcode#1047 Remove All Adjacent Duplicates In String
 * Ref: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        String s = "abbaca";
        // CASE 2
        String s = "azxxzy";

        System.out.println(removeDuplicates(s));
    }
    private static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || s.charAt(i) != stack.peek()) {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}