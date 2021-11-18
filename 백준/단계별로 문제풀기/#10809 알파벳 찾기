import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int[] alpha = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; //26개의 알파벳
        for(byte value : br.readLine().getBytes()) {
            if(alpha[value - 97] == -1) {
                alpha[value - 97] = count;
            }
            count++;
        }
        for(int i: alpha){
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}