// Bottom-Up
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        long[][] DP = new long[N + 1][10];
        for(int i = 0; i < 10; i++){
            DP[1][i] = 1;
        }
        for(int i = 2; i <= N; i++){
            for(int j = 0; j < 10; j++){
                for(int k = 0; k <= j; k++) {
                    DP[i][j] += DP[i - 1][k];
                    DP[i][j] %= 10007;
                }
            }
        }
        long result = 0;
        for(long i : DP[N]){
            result += i;
        }
        bw.write(Long.toString(result % 10007));
        bw.flush();
        bw.close();
        br.close();
    }
}
//

/* Top-Down
import java.io.*;

public class Main {
    public static long DP[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        DP = new long[N + 1][10];
        long result = 0;
;
        for(int i = 0; i < 10; i++){
            result += D(N, i);
        }
        bw.write(Long.toString(result % 10007));
        bw.flush();
        bw.close();
        br.close();
    }

    public static long D(int N, int dig){
        if(N == 1){
            return 1;
        }
        if(DP[N][dig] > 0){
            return DP[N][dig];
        }
        for(int j = 0; j < 10; j++){
            for(int k = 0; k <= j; k++) {
                DP[N][j] += D(N - 1, k);
                DP[N][j] %= 10007;
            }
        }
        return DP[N][dig];
    }
}
 */