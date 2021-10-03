import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] Num = new int[9];
        for(int i = 0; i < 9; i++){
            Num[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(Num);
        String result = String.valueOf(Num[8]) + "\n" + String.valueOf(Num[0]);
        bw.write(result);
        bw.flush();
        bw.close();
        bf.close();
    }
}