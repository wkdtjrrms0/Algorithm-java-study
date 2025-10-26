import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import javax.script.ScriptException;

/**
 * Info: BOJ#32406 의좋은 형제
 * Ref: https://www.acmicpc.net/problem/32406
 */
public class Main {

    public static void main(String[] args) throws IOException, ScriptException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        int[] b = new int[N];
        StringTokenizer inputA = new StringTokenizer(br.readLine());
        StringTokenizer inputB = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(inputA.nextToken());
            b[i] = Integer.parseInt(inputB.nextToken());
        }
        System.out.println(Math.max(getDiff(N, a, b), getDiff(N, b, a)));
        br.close();
    }
    private static int getDiff(int N, int[] a, int[] b) {
        int aEnd = a[N - 1];
        int bEnd = b[N - 1];

        for (int i = 0; i < N - 2; i++) {
            if (a[i] > b[i]) {
                aEnd += a[i];
                bEnd += b[i];
            } else {
                aEnd += b[i];
                bEnd += a[i];
            }
        }

        aEnd += b[N - 2];
        bEnd += a[N - 2];

        return Math.abs(aEnd - bEnd);
    }
}