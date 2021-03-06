//Bottom-Up
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] D = new int[num + 1];
        D[1] = 0;
        for(int i = 2; i <= num; i++){
            D[i] = D[i - 1] + 1;
            if(i % 2 == 0 && D[i] > D[i / 2] + 1){
                D[i] = D[i / 2] + 1;
            }
            if(i % 3 == 0 && D[i] > D[i / 3] + 1){
                D[i] = D[i / 3] + 1;
            }
        }
        bw.write(Integer.toString(D[num]));
        bw.flush();
        bw.close();
        br.close();
    }
}

/* Top-Down
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] D = new int[num + 1];
        bw.write(String.valueOf(DP(num, D)));
        bw.flush();
        bw.close();
        br.close();
    }

    static int DP(int n, int[] D){
        if(n == 1){
            return 0;
        }
        if(D[n] > 0) {
            return D[n];
        }
        D[n] = DP(n - 1, D) + 1;
        if(n % 2 == 0) {
            int tmp = DP(n / 2, D) + 1;
            if( D[n] > tmp) {
                D[n] = tmp;
            }
        }
        if(n % 3 == 0){
            int tmp = DP(n / 3, D) + 1;
            if( D[n] > tmp) {
                D[n] = tmp;
            }
        }
        return D[n];
    }
}
*/