import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Info: BOJ#32399 햄버거 정렬
 * Ref: https://www.acmicpc.net/problem/32399
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int answer = 0;
        if ("(1)".equals(S)) {
            answer = 0;
        } else if (")1(".equals(S)) {
            answer = 2;
        } else {
            answer = 1;
        }
        System.out.println(answer);
    }
}
