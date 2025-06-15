import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Info: BOJ#34001 임스의 일일 퀘스트
 * Ref: https://www.acmicpc.net/problem/34001
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        System.out.println(Arrays.stream(getArcaneScore(L))
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" ")));
        System.out.println(Arrays.stream(getAuthenticScore(L))
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" ")));
    }

    private static int[] getArcaneScore(int L) {
        int[][] arcaneLevels = {
            {200, 210, 220},
            {210, 220, 225},
            {220, 225, 230},
            {225, 230, 235},
            {230, 235, 245},
            {235, 245, 250}
        };

        int[] answer = new int[6];
        for (int i = 0; i < 6; i++) {
            int score = 0;
            if (L >= arcaneLevels[i][0]) score = 500;
            if (L >= arcaneLevels[i][1]) score = 300;
            if (L >= arcaneLevels[i][2]) score = 100;
            answer[i] = score;
        }
        return answer;
    }

    private static int[] getAuthenticScore(int L) {
        int[] answer = new int[7];
        for (int i = 0; i < 7; i++) {
            int base = 260 + i * 5;
            int score = 0;
            if (L >= base) score = 500;
            if (L >= base + 5) score = 300;
            if (L >= base + 10) score = 100;
            answer[i] = score;
        }
        return answer;
    }
}