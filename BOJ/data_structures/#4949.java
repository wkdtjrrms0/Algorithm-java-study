import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Stack;

/**
 * Info: BOJ#4949 균형잡힌 세상
 * Ref: https://www.acmicpc.net/problem/4949
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        while (!".".equals(line)) {
            bw.write(isBalancedString(line) + "\n");
            line = br.readLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }

    private static String isBalancedString(String str) {
        Stack<Character> bracket = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                bracket.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (bracket.isEmpty() || bracket.pop() != '(') {
                    return "no";
                }
            } else if (str.charAt(i) == ']') {
                if (bracket.isEmpty() || bracket.pop() != '[') {
                    return "no";
                }
            }
        }
        if (bracket.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}