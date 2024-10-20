import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Info: BOJ#1874 스택 수열
 * Ref: https://www.acmicpc.net/problem/1874
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int idx = 0;
        int start = 0;
        for (int i = N; i > 0; i--) {
            int tmp = Integer.parseInt(br.readLine());

            if (tmp > start) {
                for (int j = start + 1; j <= tmp; j++) {
                    stack[idx] = j;
                    idx++;
                    sb.append('+').append('\n');
                }
                start = tmp;
            } else if(stack[idx - 1] != tmp) {
                System.out.println("NO");
                return;
            }
            idx--;
            sb.append('-').append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}