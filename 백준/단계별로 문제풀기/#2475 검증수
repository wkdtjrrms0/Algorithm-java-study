import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numStr = br.readLine().split(" ");
        int sum = 0;
        for(String str: numStr){
            sum += square(Integer.parseInt(str));
        }
        bw.write(String.valueOf(sum % 10));
        bw.flush();
        bw.close();
        br.close();
    }
    static int square(int n){
        return n * n;
    }
}