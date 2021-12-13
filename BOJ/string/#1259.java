import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        while(!Objects.equals(str, "0")) {
            bw.write(inspect(str) + "\n");
            str = br.readLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static String inspect(String str){
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                return "no";
            }
        }
        return "yes";
    }
}