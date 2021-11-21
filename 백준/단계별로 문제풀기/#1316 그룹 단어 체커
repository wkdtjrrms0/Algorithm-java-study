import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            if(inspect(str)){
                result++;
            }
        }

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
    static boolean inspect(String str) {
        char prev = 0;
        boolean[] alpha = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);
            if (now != prev) {
                if (alpha[now - 97]) {
                    return false;
                } else {
                    alpha[now - 97] = true;
                }
            }
            prev = now;
        }
        return true;
    }
}