import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long result = 0;
        for(int i = 0; i < n; i++){
            result += (str.charAt(i) - 'a' + 1) * pow(31, i);
        }
        bw.write(Long.toString(result % 1234567891));
        bw.flush();
        bw.close();
        br.close();
    }
    static long pow(int a,int b){
        return b == 0 ? 1 : a * pow(a,b-1) % 1234567891;
    }
}