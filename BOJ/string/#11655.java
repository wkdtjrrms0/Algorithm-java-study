import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                if(str.charAt(i) >= 'N'){
                    bw.write((str.charAt(i) + 12 - 'Z' + 'A'));
                }
                else {
                    bw.write(str.charAt(i) + 13);
                }
                continue;
            }
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                if(str.charAt(i) >= 'n'){
                    bw.write(str.charAt(i) + 12 - 'z' + 'a');
                }
                else {
                    bw.write(str.charAt(i) + 13);
                }
                continue;
            }
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                bw.write(str.charAt(i));
                continue;
            }
            if(str.charAt(i) == ' '){
                bw.write(" ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}