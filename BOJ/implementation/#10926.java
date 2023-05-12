import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Info: BOJ#10926 ??!
 * Ref: https://www.acmicpc.net/problem/10926
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String userId = br.readLine();

        // Do validation checks on the userId
        if (isValidUserId(userId)) {
            bw.write("사용 가능한 아이디입니다.");
        } else {
            bw.write(userId + "??!");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isValidUserId(String userId) {
        if (userId.length() < 1 || userId.length() > 50) {
            return false;
        }

        if (userId.equalsIgnoreCase(findUserById(userId))) {
            return false;
        }

        return true;
    }

    private static String findUserById(String userId) {
        return userId;
    }
}