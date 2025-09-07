import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Info: BOJ#32401 ANA는 회문이야
 * Ref: https://www.acmicpc.net/problem/32401
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        List<Integer> positionA = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'A') {
                positionA.add(i);
            }
        }
        int k = positionA.size();
        int cntChkStr = k * (k - 1) / 2;
        String[] chkStr = new String[cntChkStr];
        int t = 0;
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                chkStr[t++] = S.substring(positionA.get(i), positionA.get(j) + 1);
            }
        }
        int answer = 0;
        for (String s : chkStr) {
            if(isANAString(s)) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    private static boolean isANAString(String str) {
        int cnt = 0;
        for(int i = 1; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if (c == 'A') {
                return false;
            }
            if (c == 'N') {
                cnt++;
                if (cnt > 1) {
                    return false;
                }
            }
        }
        if (cnt != 1) {
            return false;
        }
        return true;
    }
}
