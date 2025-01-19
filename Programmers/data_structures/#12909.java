import java.io.IOException;
import java.util.Stack;

/**
 * Info: Programmers#12909 올바른 괄호
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/12909?language=java
 */
public class Main {
    public static void main(String[] args) throws IOException {

//		String s = "()()"; // case 1 : true
//		String s = "(())()"; // case 2 : true
//		String s = ")()("; // case 3 : false
        String s = "(()("; // case 4 : false

        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}