import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Info: BOJ#12101 1, 2, 3 더하기 2
 * Ref: https://www.acmicpc.net/problem/12101
 */
public class Main {
    private static List<String> calList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        solution(n, "");
        if (k <= calList.size()) {
            System.out.println(calList.get(k - 1));
        } else {
            System.out.println("-1");
        }
        br.close();
    }

    private static void solution(int n, String str) {
        if (n == 0) {
            calList.add(str.substring(0, str.length() - 1));
            return;
        }
        if (n >= 1) {
            solution(n - 1, str + "1+");
        }
        if (n >= 2) {
            solution(n - 2, str + "2+");
        }
        if (n >= 3) {
            solution(n - 3, str + "3+");
        }
    }
}