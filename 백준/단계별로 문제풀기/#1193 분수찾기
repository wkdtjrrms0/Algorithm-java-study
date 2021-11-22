import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int bul = 0;
        for(int i = 1;;i++){
            bul += i;
            if(n <= bul){
                if(i % 2 == 0){
                    bw.write((i - bul + n) + "/" + (bul - n + 1));
                }
                else {
                    bw.write((bul - n + 1) + "/" + (i - bul + n));
                }
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}