//Bottom-Up
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] memo = new int[1001];
        memo[1] = 1;
        memo[2] = 2;
        for(int i = 3; i <= n; i++){
            memo[i] = (memo[i - 1] + memo[i - 2]) % 10007;
        }
        bw.write(Integer.toString(memo[n]));
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
        int N = Integer.parseInt(br.readLine());
        int[] Memo = new int[N];
        bw.write(Integer.toString(D(N, Memo)));
        bw.flush();
        bw.close();
        br.close();
    }

    static int D(int N, int[] Memo){
        if(N == 1){
            return 1;
        }
        if(N == 2){
            return 2;
        }
        if(Memo[N - 1] != 0.0){
            return Memo[N - 1];
        }
        Memo[N - 1] = (D(N - 1, Memo) + D(N - 2, Memo)) % 10007;
        return Memo[N - 1];
    }
}
 */