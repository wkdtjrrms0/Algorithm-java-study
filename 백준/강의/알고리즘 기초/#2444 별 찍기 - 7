import java.io.*;

//2444, 2445, 2446, 2522, 10991, 10992
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n - i; j++){
                bw.write(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        for(int i = n - 1; i >= 1; i--){
            for(int j = 0; j < n - i; j++){
                bw.write(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}