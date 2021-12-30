import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = gcf(a, b);
            bw.write(a * b / c + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
    public static int gcf(int a, int b) {
        if (b == 0)
            return a;
        return gcf(b, a % b);
    }
}