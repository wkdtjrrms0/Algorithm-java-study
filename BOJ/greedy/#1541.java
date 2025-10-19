import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Info: BOJ#1541 잃어버린 괄호
 * Ref: https://www.acmicpc.net/problem/1541
 */
public class Main {

    public static void main(String[] args) throws IOException, ScriptException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expr = "(" + br.readLine().replaceAll("-", ")-(") + ")";

        System.out.println(evaluate(expr));
        br.close();
    }

    public static int evaluate(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<Character> ops = new Stack<>();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') continue;

            if (Character.isDigit(c)) {
                int num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                nums.push(num);
            } else if (c == '(') {
                ops.push(c);
            } else if (c == ')') {
                while (ops.peek() != '(')
                    nums.push(applyOp(ops.pop(), nums.pop(), nums.pop()));
                ops.pop(); // '(' 제거
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c))
                    nums.push(applyOp(ops.pop(), nums.pop(), nums.pop()));
                ops.push(c);
            }
        }

        while (!ops.isEmpty())
            nums.push(applyOp(ops.pop(), nums.pop(), nums.pop()));

        return nums.pop();
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    public static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return 0;
    }
}