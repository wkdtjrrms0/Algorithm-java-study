import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Info: BOJ#1018 체스판 다시 칠하기
 * Ref: https://www.acmicpc.net/problem/1018
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;

        for (int ii = 0; ii <= N - 8; ii++) {
            for (int jj = 0; jj <= M - 8; jj++) {
                min = Math.min(min, countRepaints(arr, ii, jj, 'B'));
                min = Math.min(min, countRepaints(arr, ii, jj, 'W'));
            }
        }

        bw.write(Integer.toString(min));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int countRepaints(char[][] arr, int startRow, int startCol, char startColor) {
        int count = 0;
        char expectedColor = startColor;

        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startCol; j < startCol + 8; j++) {
                if (arr[i][j] != expectedColor) {
                    count++;
                }
                expectedColor = (expectedColor == 'B') ? 'W' : 'B';
            }
            expectedColor = (expectedColor == 'B') ? 'W' : 'B';
        }
        return count;
    }
}