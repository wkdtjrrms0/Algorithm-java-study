import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());
        String[][] str = new String[test][3];
        int[][] HWN = new int[test][3];
        for(int i = 0; i < test; i++){
            str[i] = br.readLine().split(" ");
            HWN[i][0] = Integer.parseInt(str[i][0]);
            HWN[i][1] = Integer.parseInt(str[i][1]);
            HWN[i][2] = Integer.parseInt(str[i][2]);
            bw.write(Integer.toString(hotelInfo(HWN[i][0], HWN[i][1], HWN[i][2])));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int hotelInfo(int H, int W, int N){
        if(N % H == 0) {
            return H * 100 + (N / H);
        }
        else{
            return (N % H) * 100 + (N / H + 1);
        }
    }
}