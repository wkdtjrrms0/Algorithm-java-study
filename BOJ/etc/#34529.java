import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Info: BOJ#34529 Acquiring SW-IT Corn
 * Ref: https://www.acmicpc.net/problem/34529
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer xyz = new StringTokenizer(br.readLine());
        StringTokenizer uvw = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(xyz.nextToken());
        int Y = Integer.parseInt(xyz.nextToken());
        int Z = Integer.parseInt(xyz.nextToken());
        int U = Integer.parseInt(uvw.nextToken());
        int V = Integer.parseInt(uvw.nextToken());
        int W = Integer.parseInt(uvw.nextToken());

        int answer = X * (U / 100) + Y * (V / 50) + Z * (W / 20);
        System.out.println(answer);
    }
}
