// Bottom-Up
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        long[][] DP = new long[num + 1][10];
        for(int i = 1; i < 10; i++) {
            DP[1][i] = 1;
        }
        for(int i = 2; i <= num; i++) {
            for (int j = 0; j < 10; j++) {
                DP[i][j] = 0;
                if(j - 1 >= 0){
                    DP[i][j] += DP[i - 1][j - 1];
                }
                if(j + 1 <= 9){
                    DP[i][j] += DP[i - 1][j + 1];
                }
                DP[i][j] %= 1000000000;
            }
        }
        long ans = 0;
        for(int i = 0; i < 10; i++) {
            ans += DP[num][i];
        }
        ans %= 1000000000;
        bw.write(Long.toString(ans));
        bw.flush();
        bw.close();
        br.close();
    }
}
//

/* Top-Down
import java.io.*;

public class Main {
    static Long[][] D;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        D = new Long[num + 1][10];
        for(int i = 0; i < 10; i++) {
            D[1][i] = 1L;
        }

        long ans = 0;
        for(int i = 1; i < 10; i++) {
            ans += DP(num, i);
        }
        bw.write(String.valueOf(ans % 1000000000));
        bw.flush();
        bw.close();
        br.close();
    }

    static long DP(int n, int val){
        if(n == 1){
            return D[n][val];
        }
        if(D[n][val] == null){
            if(val == 0){
                D[n][val] = DP(n - 1, 1);
            }
            else if(val == 9){
                D[n][val] = DP(n - 1, 8);
            }
            else{
                D[n][val] = DP(n - 1, val - 1) + DP(n - 1, val + 1);
            }
        }
        return D[n][val] % 1000000000;
    }
}
*/