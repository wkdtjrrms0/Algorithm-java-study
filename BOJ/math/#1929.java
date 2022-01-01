import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int M = Integer.parseInt(str.split(" ")[0]);
        int N = Integer.parseInt(str.split(" ")[1]);
        boolean[] c = new boolean[N + 1];
        for(int i = 2; i <= N; i++){
            if(!c[i]){
                if(i >= M) {
                    bw.write(i + "\n");
                }
                for(int j = i + i; j <= N; j += i){
                    c[j] = true;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}