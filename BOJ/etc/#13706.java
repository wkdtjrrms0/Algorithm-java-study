import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Info: BOJ#13706 제곱근
 * Ref: https://www.acmicpc.net/problem/13706
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        System.out.println(solution(N));
    }

    private static BigInteger solution(BigInteger N) {
        BigInteger left = BigInteger.ZERO;
        BigInteger right = N;
        BigInteger answer = BigInteger.ZERO;

        while (left.compareTo(right) <= 0) {
            BigInteger mid = left.add(right).divide(BigInteger.valueOf(2));
            BigInteger square = mid.multiply(mid);

            if (square.compareTo(N) > 0) {
                right = mid.subtract(BigInteger.ONE);
            } else {
                answer = mid;
                left = mid.add(BigInteger.ONE);
            }
        }

        return answer;
    }
}
