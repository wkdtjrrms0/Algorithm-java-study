import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Info: BOJ#10158 개미
 * Ref: https://www.acmicpc.net/problem/10158
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer wh = new StringTokenizer(br.readLine());
        StringTokenizer pq = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(wh.nextToken()); // 너비 w
        int h = Integer.parseInt(wh.nextToken()); // 높이 h
        int p = Integer.parseInt(pq.nextToken()); // 초기 좌표 (p,q)의 x값 p
        int q = Integer.parseInt(pq.nextToken()); // 초기 좌표 (p,q)의 y값 q
        int t = Integer.parseInt(br.readLine()); // 시간 t

        bw.write(result(w, h, p, q, t));
        bw.flush();
        bw.close();
        br.close();
    }

    private static String result(int w, int h, int p, int q, int t) {

        int x = (p + t) % (2 * w);
        int y = (q + t) % (2 * h);
        x = w - Math.abs(w-x);
        y = h - Math.abs(h-y);

        return x + " " + y;
    }
}