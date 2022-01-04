// Bottom-Up
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int[] Val = new int[str.length() + 1];
        int[] DP = new int[str.length() + 1];
        for(int i = 1; i <= str.length(); i++){
            Val[i] = str.charAt(i - 1) - 48;
        }
        int result = -1;
        DP[0] = 1;
        if(Val[1] == 0){
            result = 0;
        }
        else {
            DP[1] = 1;
            for (int i = 2; i <= str.length(); i++) {
                if (Val[i] == 0) {
                    if (1 <= Val[i - 1] && Val[i - 1] <= 2) {
                        DP[i] = DP[i - 2];
                    } else {
                        result = 0;
                        break;
                    }
                } else {
                    int x = Val[i - 1] * 10 + Val[i];
                    if (10 <= x && x <= 26) {
                        DP[i] = (DP[i - 1] + DP[i - 2]) % 1000000;
                    } else {
                        DP[i] = DP[i - 1];
                    }
                }
            }
        }
        if(result != 0){
            result = DP[str.length()];
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
//

/* Top-Down
생략
*/