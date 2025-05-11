import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * Info: BOJ#10815 숫자 카드
 * Ref: https://www.acmicpc.net/problem/10815
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] SCard = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            SCard[i] = Integer.parseInt(st1.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] InspectCard = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            InspectCard[i] = Integer.parseInt(st2.nextToken());
        }
        System.out.println(Arrays.stream(solution(N, SCard, M, InspectCard))
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" ")));
    }

    private static int[] solution(int N, int[] SCard, int M, int[] InspectCard) {
        int[] result = new int[M];
        Arrays.sort(SCard);
        for (int i = 0; i < M; i++) {
            int left = 0;
            int right = N - 1;
            while (left <= right) {
                int mid = (right + left) / 2;
                if (SCard[mid] == InspectCard[i]) {
                    result[i] = 1;
                    break;
                } else if (SCard[mid] > InspectCard[i]) {
                    right = mid - 1;
                } else if (SCard[mid] < InspectCard[i]) {
                    left = mid + 1;
                }
            }
        }
        return result;
    }
}