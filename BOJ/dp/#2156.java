// Bottom-Up
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] DP = new int[n + 1];
        int[] Val = new int[n + 1];

        for (int i = 0; i < n; i++) {
            Val[i + 1] = Integer.parseInt(br.readLine());;
        }
        DP[0] = 0;
        DP[1] = Val[1];
        if(n >= 2){
            DP[2] = Val[1] + Val[2];
            for(int i = 3; i <= n; i++){
                DP[i] = Math.max(Math.max(DP[i - 3] + Val[i - 1], DP[i - 2]) + Val[i], DP[i - 1]);
            }
        }
        bw.write(Integer.toString(DP[n]));
        bw.flush();
        bw.flush();
        bw.close();
        br.close();
    }
}
//

/* Top-Down
import java.io.*;

public class Main {
    static Integer[] DP;
    static int[] Val;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        DP = new Integer[n + 1];
        Val = new int[n + 1];
        for (int i = 0; i < n; i++) {
            Val[i + 1] = Integer.parseInt(br.readLine());
        }
        DP[0] = 0;
        DP[1] = Val[1];
        if (n >= 2) {
            DP[2] = Val[1] + Val[2];
        }
        bw.write(Integer.toString(result(n)));
        bw.flush();
        bw.close();
        br.close();
    }
    static int result(int n){
        if(DP[n] != null){
            return DP[n];
        }
        return DP[n] = Math.max(Math.max(result(n - 3) + Val[n - 1], result(n - 2)) + Val[n], result(n - 1));
    }
}
*/