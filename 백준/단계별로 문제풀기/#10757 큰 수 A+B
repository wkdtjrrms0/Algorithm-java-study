import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strN = br.readLine().split(" ");
        int max = Math.max(strN[0].length(), strN[1].length());
        int[] A = new int[max + 1];
        int[] B = new int[max + 1];

        for(int i = strN[0].length() - 1, j = 0; i >= 0; i--, j++){
            A[j] = strN[0].charAt(i) - '0';
        }
        for(int i = strN[1].length() - 1, j = 0; i >= 0; i--, j++){
            B[j] = strN[1].charAt(i) - '0';
        }

        for(int i = 0; i < max; i++){
            int value = A[i] + B[i];
            A[i] = value % 10;
            A[i + 1] += value / 10;
        }
        if(A[max] != 0){
            bw.write(Integer.toString(A[max]));
        }
        for(int i = A.length - 2; i >= 0; i--){
            bw.write(Integer.toString(A[i]));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}