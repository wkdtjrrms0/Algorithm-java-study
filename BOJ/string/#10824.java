import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");

        bw.write(String.valueOf(Math.round(Double.parseDouble(str[0] + str[1]) + Double.parseDouble(str[2] + str[3]))));
        bw.flush();
        bw.close();
        br.close();
    }
}