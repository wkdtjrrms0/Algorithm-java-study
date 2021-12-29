//Bottom-Up
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] DP = new int[n + 1];

        for(int i = 1; i <= n; i++){
            DP[i] = i;
            for(int j = 1; j*j <= i; j++){
                int val = DP[i - j * j] + 1;
                if(DP[i] > val){
                    DP[i] = val;
                }
            }
        }
        bw.write(Integer.toString(DP[n]));
        bw.flush();
        bw.flush();
        bw.close();
        br.close();
    }
}

/* Top-Down, 매우 매우 느리지만, 대부분 Bottom-Up방식으로 풀어 더 나은 코드를 발견하지 못함.
import java.io.*;

public class Main {
    static int[] DP;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        DP = new int[n + 1];
        DP[1] = 1;

        bw.write(Integer.toString(result(n)));
        bw.flush();
        bw.close();
        br.close();
    }
    static int result(int n){
        if(DP[n] > 0){
            return DP[n];
        }
        DP[n] = n;
        for (int j = 1; j * j <= n; j++) {
            int Val = result(n - (j * j)) + 1;
            if (DP[n] > Val) {
                DP[n] = Val;
            }
        }
        return DP[n];
    }
}
*/