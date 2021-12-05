import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringBuilder s = new StringBuilder();
        String[] strArr = new String[str.length()];

        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++) {
                s.append(str.charAt(j));
            }
            strArr[i] = s.toString();
            s = new StringBuilder();
        }

        Arrays.sort(strArr);
        for(String result: strArr){
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}