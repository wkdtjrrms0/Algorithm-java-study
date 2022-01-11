import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double N = Double.parseDouble(br.readLine()); // N은 -20억~20억
        ArrayList<Integer> arr = new ArrayList<>();

        if(N == 0){
            arr.add(0);
        }
        else {
            while (N != 1) {
                arr.add((int) (N - (-2 * Math.ceil(N / -2))));
                N = Math.ceil(N / -2);
            }
            arr.add(1);
            Collections.reverse(arr);
        }
        for(int n : arr) {
            bw.write(Integer.toString(n));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}