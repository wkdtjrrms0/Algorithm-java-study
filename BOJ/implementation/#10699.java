import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 * Info: BOJ#10699 오늘 날짜
 * Ref: https://www.acmicpc.net/problem/10699
 */
public class Main {

    public static void main(String[] args) throws IOException {
        LocalDate now = LocalDate.now(ZoneId.of("Asia/Seoul"));
        System.out.println(now);
    }
}