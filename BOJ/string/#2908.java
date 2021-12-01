import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numStr = br.readLine().split(" ");
        int a = Integer.parseInt(numStr[0].substring(2)) * 100 + Integer.parseInt(numStr[0].substring(1, 2)) * 10 + Integer.parseInt(numStr[0].substring(0, 1));
        int b = Integer.parseInt(numStr[1].substring(2)) * 100 + Integer.parseInt(numStr[1].substring(1, 2)) * 10 + Integer.parseInt(numStr[1].substring(0, 1));

        if(a > b){
            bw.write(Integer.toString(a));
        } else {
            bw.write(Integer.toString(b));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}