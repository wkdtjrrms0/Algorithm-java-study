import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] num = new int[n];
            for (int j = 0; j < n; j++) {
                num[j] = Integer.parseInt(st.nextToken());
            }
            bw.write(result(num) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static long result(int[] n){
        long sum = 0;
        for(int i = 0; i < n.length; i++){
            for(int j = i + 1; j < n.length; j++) {
                sum += GCD(n[i], n[j]);
            }
        }
        return sum;
    }
    public static long GCD(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return GCD(b, a % b);
        }
    }
}