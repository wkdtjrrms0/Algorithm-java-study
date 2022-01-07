import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int result = 0;
        for(int i = 0; i < N.length(); i++){
            double pow = Math.pow(B, N.length() - i - 1);
            if(N.charAt(i) >= 65 && N.charAt(i) <= 90) {
                result += ((N.charAt(i) - 55) * pow);
            }
            else {
                result += ((N.charAt(i) - '0') * pow);
            }
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}