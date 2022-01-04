// Bottom-Up
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        long[][] DP = new long[K + 1][N + 1];
        DP[0][0] = 1;

        for(int i = 1; i <= K; i++){
            for(int j = 0; j <= N; j++){
                for(int l = 0; l <= j; l++){
                    DP[i][j] += DP[i - 1][j - l];
                    DP[i][j] %= 1000000000;
                }
            }
        }
        bw.write(Long.toString(DP[K][N]));
        bw.flush();
        bw.close();
        br.close();
    }
}
//

/* Top-Down
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] DP;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        DP = new int[K + 1][N + 1];
        bw.write(Long.toString(DP(K, N)));
        bw.flush();
        bw.close();
        br.close();
    }

    static int DP(int K, int N){
        if(N == 1){
            DP[K][N] = K;
        }
        else if(K == 1){
            DP[K][N] = 1;
        }
        else if(DP[K][N] == 0){
            DP[K][N] = DP(K, N - 1) + DP(K - 1, N);
        }
        return DP[K][N] % 1000000000;
    }
}
*/