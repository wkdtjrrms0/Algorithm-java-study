import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Info: BOJ#10448 유레카 이론
 * Ref: https://www.acmicpc.net/problem/10448
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long T = Integer.parseInt(br.readLine()); // T는 자연수

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            bw.write(isEureka(K) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    /**
     * @Desc K가 유레카 수인지 판별하는 함수
     * @param K
     * @return  K가 유레카 수이면 1, 아니면 0
     */
    private static int isEureka(int K) {
        int result = 0;
        int[] triangle = new int[45];
        for (int i = 1; i < 45; i++) {
            triangle[i] = (i * (i + 1)) / 2;
        }
        for (int i = 1; i < 45; i++) {
            for (int j = 1; j < 45; j++) {
                for (int k = 1; k < 45; k++) {
                    if (triangle[i] + triangle[j] + triangle[k] == K) {
                        result = 1;
                        break;
                    }
                }
            }
        }
        return result;
    }
}