import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            str = inspect(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            if(Objects.equals(str, "finish")){
                break;
            }
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static String inspect(int x, int y, int z){
        int[] arr = new int[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        Arrays.sort(arr);

        x = arr[0];
        y = arr[1];
        z = arr[2];

        if(x == 0 && y == 0 && z == 0){
            return "finish";
        }
        if(Math.pow(z, 2) == Math.pow(x, 2) + Math.pow(y, 2)){
            return "right";
        }
        else{
            return "wrong";
        }
    }
}