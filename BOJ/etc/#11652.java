import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        for(int i = 0; i < N; i++){
            arr[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(arr);

        int cnt = 1, max = 1, maxIdx = 0;
        for(int i = 1; i < N; i++){
            if(arr[i] == arr[i - 1]){
                cnt++;
            }
            else{
                cnt = 1;
            }

            if(cnt > max){
                max = cnt;
                maxIdx = i;
            }
        }

        bw.write(String.valueOf(arr[maxIdx]));
        bw.flush();
        bw.close();
        br.close();
    }
}