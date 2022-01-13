import java.io.*;

public class Main {
    public static boolean[] c = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n;
        for(int i = 2; i <= 1000000; i++) {
            if(!c[i]) {
                for (int j = i * 2; j <= 1000000; j += i) {
                    c[j] = true;
                }
            }
        }


        while (true) {
            n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }
            bw.write(goldbach(n) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static String goldbach(int n){
        int A = 0;
        String str = null;
        for(int i = 2; i <= n / 2; i++){
            if(!c[i] && !c[n - i]){
                A = i;
                str = n + " = " + A + " + " + (n - A);
                break;
            }
        }
        if(A == 0){
            str = "Goldbach's conjecture is wrong.";
        }
        return str;
    }
}