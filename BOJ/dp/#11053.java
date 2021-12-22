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
        for (int i = 0; i < n; i++) {
            Val[i + 1] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i <= n; i++){
            DP[i] = 1;
            for(int j = 1; j <= i; j++){
                if(Val[j] < Val[i] && DP[i] < DP[j] + 1) {
                    DP[i] = DP[j] + 1;
                }
            }
        }
        int max = -1;
        for(int i = 1; i <= n; i++){
            if(DP[i] > max){
                max = DP[i];
            }
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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        DP = new Integer[n + 1];
        Val = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            Val[i + 1] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i <= n; i++) {
            result(i);
        }

        int max = -1;
        for(int i = 1; i <= n; i++){
            if(DP[i] > max){
                max = DP[i];
            }
        }
        bw.write(Integer.toString(max));
        bw.flush();
        bw.close();
        br.close();
    }
    static int result(int n){
        if(DP[n] == null) {
            DP[n] = 1;
            for (int i = n - 1; i >= 1; i--) {
                if (Val[i] < Val[n]) {
                    DP[n] = Math.max(DP[n], result(i) + 1);
                }
            }
        }
        return DP[n];
    }
}
*/