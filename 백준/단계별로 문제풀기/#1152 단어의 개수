import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] strArr = str.trim().split(" ");
        if(Objects.equals(strArr[0], "")){
            bw.write("0");
        }
        else{
            bw.write(Integer.toString(strArr.length));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}