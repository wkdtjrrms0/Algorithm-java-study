import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] N = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : N) {
            sb.append(result(c - '0'));
        }
        String str = sb.toString();
        if(str.charAt(0) == '0'){
            str = str.substring(1);
            if(str.charAt(0) == '0'){
                str = str.substring(1);
            }
        }
        bw.write(str);
        bw.flush();
        bw.close();
        br.close();
    }

    public static String result(int N){
        char[] c = new char[3];
        if (N >= 4) {
            c[0] = '1';
            N -= 4;
        } else { c[0] = '0'; }
        if (2 <= N && N < 4) {
            c[1] = '1';
            N -= 2;
        } else { c[1] = '0'; }
        if (N == 1) {
            c[2] = '1';
        } else { c[2] = '0'; }
        return String.valueOf(c);
    }
}