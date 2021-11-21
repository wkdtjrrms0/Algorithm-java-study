import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] cost = br.readLine().split(" ");
        int A = Integer.parseInt(cost[0]);
        int B = Integer.parseInt(cost[1]);
        int C = Integer.parseInt(cost[2]);

        int result;
        if((C - B) > 0){
            if(A % (C - B) == 0){
                result =  A / (C - B) + 1;
            }
            else{
                result = (int) Math.ceil((double) A / (C - B));
            }
        }
        else{
            result = -1;
        }

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}