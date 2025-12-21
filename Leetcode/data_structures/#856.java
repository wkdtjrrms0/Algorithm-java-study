import java.util.*;

/**
 * Info: Leetcode#856 Score of Parentheses
 * Ref: https://leetcode.com/problems/score-of-parentheses
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
        String s = "()";
        // CASE 2
//        String s = "(())";
        // CASE 3
//        String s = "()()";
        // CASE 4
//        String s = "(()(()))";

        System.out.println(scoreOfParentheses(s));
    }
    private static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(score);
                score = 0;
            } else {
                score = stack.pop() + Math.max(2 * score, 1);
            }
        }
        return score;
    }
}