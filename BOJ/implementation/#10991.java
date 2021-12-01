import java.io.*;

//10991, 10992
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n - 1; j++){
                bw.write(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                if(j % 2 == 1){
                    bw.write("*");
                }
                else{
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}