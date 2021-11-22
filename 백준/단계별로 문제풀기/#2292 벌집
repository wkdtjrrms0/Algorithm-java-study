import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int bul = 1;
        for(int i = 0;;i++){
            bul += 6*i;
            if(n <= bul){
                bw.write(String.valueOf(i + 1));
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}