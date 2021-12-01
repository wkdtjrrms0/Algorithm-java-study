import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strN = br.readLine().split(" ");
        int A = Integer.parseInt(strN[0]);
        int B = Integer.parseInt(strN[1]);
        int V = Integer.parseInt(strN[2]);

        int result = (V - B) / (A - B);
        if((V - B) % (A - B) != 0){
            result++;
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}