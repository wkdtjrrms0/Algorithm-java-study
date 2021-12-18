// Bottom-Up
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        long[][] DP = new long[N + 1][2];
        DP[1][0] = 0; DP[1][1] = 1;

        for(int i = 2; i <= N; i++) {
            DP[i][0] = DP[i - 1][0] + DP[i - 1][1];
            DP[i][1] = DP[i - 1][0];
        }
        long result = 0;
        for(long i : DP[N]){
            result += i;
        }
        bw.write(Long.toString(result));
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
        DP = new long[N + 1][2];
        long result = 0;
;
        for(int i = 0; i < 2; i++){
            result += D(N, i);
        }
        bw.write(Long.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }

    public static long D(int N, int dig){
        if(DP[N][dig] > 0){
            return DP[N][dig];
        }
        if(dig == 0){
            if(N == 1){
                return 0;
            }
            DP[N][dig] = D(N - 1, 0) + D(N - 1, 1);
        }
        else if(dig == 1){
            if(N == 1){
                return 1;
            }
            DP[N][dig] = D(N - 1, 0);
        }
        return DP[N][dig];
    }
}
*/