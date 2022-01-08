import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] N = br.readLine().toCharArray();
        int nLen = N.length;
        StringBuilder result = new StringBuilder();
        if (nLen % 3 == 1){
            result.append(N[0] - '0');
        }
        else if (nLen % 3 == 2){
            result.append((N[0] - '0') * 2 + (N[1] - '0'));
        }
        for(int i = nLen % 3; i < nLen; i += 3){
            result.append((N[i] - '0')*4 +
                    (N[i + 1] - '0')*2 +
                    (N[i + 2] - '0'));
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}