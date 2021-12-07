import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[n];
        String[] str;
        str = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            numArr[i] = Integer.parseInt(str[i]);
        }

        int result = 0;
        for(int N: numArr){
            int tmp = 0;
            for(int j = 1; j <= N; j++) {
                if (N % j == 0) {
                    tmp++;
                }
            }
            if(tmp == 2){
                result++;
            }
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}