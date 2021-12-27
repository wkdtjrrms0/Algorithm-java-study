// Bottom-Up
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] DP = new int[n + 1];
        int[] Val = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 1; i <= n; i++) {
            Val[i] = Integer.parseInt(st.nextToken());
        }
        DP[1] = Val[1];
        int max = DP[1];
        for(int i = 2; i <= n; i++){
            DP[i] = Math.max(DP[i - 1] + Val[i], Val[i]);
            max = Math.max(max, DP[i]);
        }
        bw.write(Integer.toString(max));
        bw.flush();
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
    static Integer[] DP;
    static int[] Val;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        DP = new Integer[n + 1];
        Val = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 1; i <= n; i++) {
            Val[i] = Integer.parseInt(st.nextToken());
        }

        DP[1] = Val[1];
        max = Val[1];

        result(n);

        bw.write(Integer.toString(max));
        bw.flush();
        bw.close();
        br.close();
    }
    static int result(int n){
        if(DP[n] == null) {
            DP[n] = Math.max(result(n - 1) + Val[n], Val[n]);
            max = Math.max(DP[n], max);
        }
        return DP[n];
    }
}
*/