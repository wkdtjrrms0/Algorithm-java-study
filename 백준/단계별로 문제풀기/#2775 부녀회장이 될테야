import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] k = new int[T]; int[] n = new int[T];
        for(int i = 0; i < T; i++){
            k[i] = Integer.parseInt(br.readLine());
            n[i] = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(citizenNum(k[i], n[i])));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int citizenNum(int k, int n){
        if(k == 0){
            return n;
        }
        int sum = 0;
        for(int i = n; i > 0; i--){
            sum += citizenNum(k - 1, i);
        }
        return sum;
    }
}