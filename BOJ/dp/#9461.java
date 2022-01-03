// Bottom-Up
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[] tArr = new int[T];
        int max = -1;
        for(int i = 0; i < T; i++){
            tArr[i] = Integer.parseInt(br.readLine());
            if(tArr[i] > max){
                max = tArr[i];
            }
        }
        long[] DP = new long[101];
        DP[0] = 0;
        DP[1] = 1;
        DP[2] = 1;
        DP[3] = 1;
        DP[4] = 2;
        for(int i = 5; i <= max; i++){
            DP[i] = DP[i - 1] + DP[i - 5];
        }
        for(int i = 0; i < T; i++){
            bw.write(DP[tArr[i]] + "\n");
        }
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
        int T = Integer.parseInt(br.readLine());
        int[] tArr = new int[T];
        int max = -1;
        for(int i = 0; i < T; i++){
            tArr[i] = Integer.parseInt(br.readLine());
            if(tArr[i] > max){
                max = tArr[i];
            }
        }
        long[] DP = new long[101];
        for(int i = 0; i < T; i++){
            bw.write(D(tArr[i], DP) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static long D(int N, long[] DP){
        if(DP[N] > 0){
            return DP[N];
        }
        if(N == 0){
            return 0;
        }
        if(N == 1){
            return 1;
        }
        if(N == 2){
            return 1;
        }
        if(N == 3){
            return 1;
        }
        if(N == 4){
            return 2;
        }
        DP[N] = D(N - 1, DP) + D(N - 5, DP);
        return DP[N];
    }
}
*/