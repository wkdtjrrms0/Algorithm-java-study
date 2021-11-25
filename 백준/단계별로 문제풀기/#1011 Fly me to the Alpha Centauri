import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int distance;
        for(int i = 0; i < T; i++){
            String[] str = br.readLine().split(" ");
            distance = Integer.parseInt(str[1]) - Integer.parseInt(str[0]);
            bw.write(String.valueOf(citizenNum(distance)));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int citizenNum(int dis){
        int k = 0;
        for(int i = 1; dis >= Math.pow(i, 2); i++){
            k = i;
        }
        if(dis == k * k){
            return 2 * k - 1;
        }
        else if(dis <= (k * k) + k){
            return 2 * k;
        }
        else if(dis > (k * k) + k){
            return 2 * k + 1;
        }
        return -1;
    }
}