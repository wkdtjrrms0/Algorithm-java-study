import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Info: BOJ#14626 ISBN
 * Ref: https://www.acmicpc.net/problem/14626
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    private static int solution(String str) {
        int idx = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '*') {
                sum += i % 2 == 0 ? str.charAt(i) - '0' : (str.charAt(i) - '0') * 3;
            } else {
                idx = i;
            }
        }

        int answer = 0;
        while(true) {
            if (idx % 2 == 0) {
                if ((sum + answer) % 10 == 0) {
                    return answer;
                }
            } else {
                if ((sum + answer * 3) % 10 == 0) {
                    return answer;
                }
            }
            answer++;
        }
    }
}