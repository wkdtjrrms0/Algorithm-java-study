import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Info: BOJ#32403 전구 주기 맞추기
 * Ref: https://www.acmicpc.net/problem/32403
 */
public class Main {
    static int T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += calcSetLightInPeriod(Integer.parseInt(st.nextToken()));
        }

        System.out.println(sum);
    }

    private static int calcSetLightInPeriod(int period) {
        int setLightCnt = 0;
        int plusPeriod = period;
        int minusPeriod = period;
        while(T % plusPeriod != 0 && T % minusPeriod != 0) {
            plusPeriod++;
            minusPeriod--;
            setLightCnt++;
        }

        return setLightCnt;
    }
}
