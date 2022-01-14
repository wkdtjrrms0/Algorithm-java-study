import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long count5 = five_power(n) - five_power(n - m) - five_power(m);
        long count2 = two_power(n) - two_power(n - m) - two_power(m);
        bw.write(String.valueOf(Math.min(count2, count5)));
        bw.flush();
        bw.close();
        br.close();
    }

    static long five_power(int n){
        int count = 0;
        while(n >= 5){
            count += n/5;
            n /= 5;
        }
        return count;
    }
    static long two_power(int n){
        int count = 0;
        while(n >= 2){
            count += n/2;
            n /= 2;
        }
        return count;
    }
}