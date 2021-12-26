// Bottom-Up
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] upDP = new int[n + 1];
        int[] downDP = new int[n + 1];
        int[] result = new int[n + 1];
        int[] Val = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            Val[i + 1] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i <= n; i++){
            upDP[i] = 1;
            for(int j = 1; j <= i; j++){
                if(Val[j] < Val[i] && upDP[i] < upDP[j] + 1) {
                    upDP[i] = upDP[j] + 1;
                }
            }
        }
        for(int i = n; i >= 1; i--){
            downDP[i] = 1;
            for(int j = i; j <= n; j++){
                if(Val[j] < Val[i] && downDP[i] < downDP[j] + 1) {
                    downDP[i] = downDP[j] + 1;
                }
            }
        }
        int max = -1;
        for(int i = 1; i <= n; i++){
            result[i] = upDP[i] + downDP[i] - 1;
            if(result[i] > max){
                max = result[i];
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
    static Integer[] upDP;
    static Integer[] downDP;
    static int[] Val;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        upDP = new Integer[n];
        downDP = new Integer[n];
        Val = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            Val[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < n; i++) {
            LIS(i); //오름차순
            LDS(i); //내림차순
        }

        int max = -1;
        for(int i = 0; i < n; i++){
            max = Math.max(upDP[i] + downDP[i], max);
        }
        bw.write(Integer.toString(max - 1));
        bw.flush();
        bw.close();
        br.close();
    }
    static int LIS(int n){
        if(upDP[n] == null) {
            upDP[n] = 1;
            for (int i = n - 1; i >= 0; i--) {
                if (Val[i] < Val[n]) {
                    upDP[n] = Math.max(upDP[n], LIS(i) + 1);
                }
            }
        }
        return upDP[n];
    }
    static int LDS(int n){
        if(downDP[n] == null) {
            downDP[n] = 1;
            for (int i = n + 1; i < downDP.length; i++) {
                if (Val[i] < Val[n]) {
                    downDP[n] = Math.max(downDP[n], LDS(i) + 1);
                }
            }
        }
        return downDP[n];
    }
}
*/
