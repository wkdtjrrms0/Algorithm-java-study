import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] recX = new int[3];
        int[] recY = new int[3];
        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            recX[i] = Integer.parseInt(st.nextToken());
            recY[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(recX);
        if (recX[0] == recX[1]){
            bw.write(Integer.toString(recX[2]));
        }
        else{
            bw.write(Integer.toString(recX[0]));
        }
        bw.write(" ");
        Arrays.sort(recY);
        if (recY[0] == recY[1]){
            bw.write(Integer.toString(recY[2]));
        }
        else{
            bw.write(Integer.toString(recY[0]));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}