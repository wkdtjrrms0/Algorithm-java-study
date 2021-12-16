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