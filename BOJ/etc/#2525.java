import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalTime;
import java.util.StringTokenizer;
import java.io.IOException;

/**
 * Info: BOJ#2525 오븐 시계
 * Ref: https://www.acmicpc.net/problem/2525
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        long C = Long.parseLong(br.readLine());

        LocalTime now = LocalTime.of(A, B);
        now = now.plusMinutes(C);

        bw.write(now.getHour() + " " + now.getMinute());
        bw.flush();
        bw.close();
        br.close();
    }
}