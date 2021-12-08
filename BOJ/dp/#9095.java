// Bottom-Up
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] D = new int[12];

        D[1] = 1;
        D[2] = 2;
        D[3] = 4;

        for(int i = 0; i < n; i++){
            bw.write(dp(Integer.parseInt(br.readLine()), D) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int dp(int n, int[] D){
        if(D[n] > 0){
            return D[n];
        }
        for(int i = 4; i <= n; i++){
            D[i] = D[i -1] + D[i - 2] + D[i - 3];
        }
        return D[n];
    }
}
//

/* Top-Down
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] D = new int[12];

        D[1] = 1;
        D[2] = 2;
        D[3] = 4;

        for(int i = 0; i < n; i++){
            bw.write(dp(Integer.parseInt(br.readLine()), D) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int dp(int n, int[] D) {
        if (D[n] > 0) {
            return D[n];
        }
        D[n] = dp(n - 1, D) + dp(n - 2, D) + dp(n - 3, D);
        return D[n];
    }
}
*/