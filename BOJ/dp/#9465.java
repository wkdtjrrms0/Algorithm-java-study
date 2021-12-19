// Bottom-Up
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] Val = new int[n + 1][2];


            for(int j = 0; j < 2; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k = 1; k <= n; k++){
                    Val[k][j] = Integer.parseInt(st.nextToken(" "));
                }
            }
            bw.write(result(n, Val) + "\n");
        }
        bw.flush();
        bw.flush();
        bw.close();
        br.close();
    }

    public static int result(int n, int[][] Val) {
        int[][] DP = new int[n + 1][2];
        DP[1][0] = Val[1][0];
        DP[1][1] = Val[1][1];
        if(n >= 2) {
            DP[2][0] = Val[1][1] + Val[2][0];
            DP[2][1] = Val[1][0] + Val[2][1];
        }
        if(n >= 3) {
            for (int i = 3; i <= n; i++) {
                DP[i][0] = Math.max(DP[i - 1][1], DP[i - 2][1]) + Val[i][0];
                DP[i][1] = Math.max(DP[i - 1][0], DP[i - 2][0]) + Val[i][1];
            }
        }
        return Math.max(DP[n][0], DP[n][1]);
    }
}
//

/* Top-Down
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[][] DP = new int[100001][2];
    public static int[][] Val = new int[100001][2];;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            for(int j = 0; j < 2; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k = 1; k <= n; k++){
                    Val[k][j] = Integer.parseInt(st.nextToken(" "));
                    DP[k][j] = -1;
                }
            }
            DP[1][0] = Val[1][0]; DP[1][1] = Val[1][1];
            DP[2][0] = Val[1][1] + Val[2][0]; DP[2][1] = Val[1][0] + Val[2][1];
            bw.write(Math.max(result(n, 0), result(n, 1)) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static int result(int n, int i) {
        if (DP[n][i] >= 0 || n <= 2) {
            return DP[n][i];
        }
        int tmp = (i + 1) % 2;
        return DP[n][i] = Math.max(result(n - 1, tmp), result(n - 2, tmp)) + Val[n][i];
    }
}
*/