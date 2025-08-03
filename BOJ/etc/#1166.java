import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Info: BOJ#1166 선물
 * Ref: https://www.acmicpc.net/problem/1166
 */
public class Main {
    static int N;
    static int L;
    static int W;
    static int H;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());


        System.out.println(solution());
    }

    private static double solution() {
        double left = 0;
        double right = Math.min(L, Math.min(W, H));
        double mid;

        while (left < right) {
            mid = (left + right) / 2;
            if((long)(L/mid) * (long)(W/mid) * (long)(H/mid)<N){
                if(right == mid) {
                    break;
                }
                right = mid;
            } else {
                if(left == mid) {
                    break;
                }
                left = mid;
            }
        }

        return left;
    }
}