import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Info: BOJ#1072
 * Ref: https://www.acmicpc.net/problem/1072
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(solution(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }

    private static long solution(long X, long Y) {
        long Z = Y * 100 / X;
        if (Z >= 99) {
            return -1;
        }
        double target = ((X * (Z + 1)) - 100.0 * Y) / (99 - Z);
        if (target <= 0) {
            return 1;
        }
        return (long) Math.ceil(target);
    }
}