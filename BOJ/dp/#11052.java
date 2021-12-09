// Bottom-Up
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numArr = new int[n];
        for(int i = 0; i < n; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        int[] D = new int[n + 1];
        D[0] = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++) {
                if(D[i - j] + numArr[j - 1] > D[i])
                    D[i] = D[i - j] + numArr[j - 1];
            }
        }
        bw.write(Integer.toString(D[n]));
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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] D = new int[n + 1];
        D[0] = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numArr = new int[n];
        for(int i = 0; i < n; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(Integer.toString(dp(n, D, numArr)));
        bw.flush();
        bw.close();
        br.close();
    }

    static int dp(int n, int[] D, int[] numArr) {
        if (D[n] > 0) {
            return D[n];
        }
        for (int i = 1; i <= n; i++) {
            if (dp(n - i, D, numArr) + numArr[i - 1] > D[n]) {
                D[n] = dp(n - i, D, numArr) + numArr[i - 1];
            }
        }
        return D[n];
    }
}
*/