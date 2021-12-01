import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String Str = br.readLine();
        if(Objects.equals(Str,"1 2 3 4 5 6 7 8")){
            bw.write("ascending");
        } else if(Objects.equals(Str, "8 7 6 5 4 3 2 1")){
            bw.write("descending");
        } else{
            bw.write("mixed");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}