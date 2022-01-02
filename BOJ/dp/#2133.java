// Bottom-Up
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] DP = new int[31];
        DP[0] = 1; //1X2, 2X1을 아무것도 놓지 않은 경우
        DP[1] = 0;
        DP[2] = 3;
        for(int i = 3; i <= n; i++){
            if((i % 2) == 0) {
                DP[i] = DP[i - 2] * DP[2];
                for(int j = i - 4; j >= 0; j -= 2){
                    DP[i] += DP[j] * 2;
                }
            }
            else{
                DP[i] = 0;
            }
        }
        bw.write(Integer.toString(DP[n]));
        bw.flush();
        bw.close();
        br.close();
    }
}
//

/* Top-Down
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] DP = new int[N + 1];
        bw.write(Integer.toString(D(N, DP)));
        bw.flush();
        bw.close();
        br.close();
    }

    static int D(int N, int[] DP){
        if(DP[N] > 0){
            return DP[N];
        }
        if(N == 0){
            return 1;
        }
        if((N % 2) != 0){
            return 0;
        }
        if(N == 2){
            return 3;
        }
        DP[N] = D(N - 2, DP) * D(2, DP);
        for(int j = N - 4; j >= 0; j -= 2){
            DP[N] += D(j, DP) * 2;
        }
        return DP[N];
    }
}
*/