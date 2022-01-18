import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[2000001];

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num + 1000000] = true;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]){
                sb.append(i - 1000000).append('\n');
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();
    }
}