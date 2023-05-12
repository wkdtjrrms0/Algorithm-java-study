import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Info: BOJ#18108 1998년생인 내가 태국에서는 2541년생?!
 * Ref: https://www.acmicpc.net/problem/18108
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long 불기연도 = Long.parseLong(br.readLine());

        bw.write(get서기연도(불기연도));
        bw.flush();
        bw.close();
        br.close();
    }

    private static String get서기연도(Long 불기연도) {
        if (!isValid불기연도(불기연도)) {
            return "불기연도는 1000이상 3000이하 입니다.";
        }

        return calculate서기연도(불기연도).toString();
    }

    private static boolean isValid불기연도(Long 불기연도) {
        if (불기연도 < 1000 || 불기연도 > 3000) {
            return false;
        }

        return true;
    }

    private static Long calculate서기연도(Long 불기연도) {
        return 불기연도 - 543;
    }
}