import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        if(N == 1){
            bw.write("");
        }
        else {
            for (int i = 2; N != 1; i++) {
                if (N % i == 0) {
                    bw.write(i + "\n");
                    N /= i;
                    i--;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}