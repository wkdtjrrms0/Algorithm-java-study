import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numArray = new int[10100];
        for(int i=1; i <= 10000; i++){
            numArray[d(i)] = 1;
            if(numArray[i] != 1){
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int d(int n){
        int result;
        result = n + (n%10) + (n%100)/10 + (n%1000)/100 + (n%10000)/1000 + (n%100000)/10000;
        return result;
    }
}