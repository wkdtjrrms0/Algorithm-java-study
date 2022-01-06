import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = "";
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        while (N >= 1) {
            if(N % B >= 10 && N % B <= 35){
                str = (char) (N % B + 55) + str;
            }
            else {
                str = N % B + str;
            }
            N = N / B;
        }
        bw.write(str);
        bw.flush();
        bw.close();
        br.close();
    }
}