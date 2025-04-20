import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Info: BOJ#2110 공유기 설치
 * Ref: https://www.acmicpc.net/problem/2110
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] houses = new int[N];
        for (int i = 0; i < N; i++) {
            houses[i] = sc.nextInt();
        }
        System.out.println(solution(houses, M, N));
    }

    public static int solution(int[] houses, int M, int N) {
        Arrays.sort(houses);

        int left = 0;
        int right = houses[N - 1] - houses[0];
        int answer = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (getSumInstalledLouter(houses, mid) >= M) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    public static long getSumInstalledLouter(int[] houses, int mid) {
        long installedLouter = 1;
        long distance = 0;
        for (int i = 0; i < houses.length - 1; i++) {
            distance += (houses[i + 1] - houses[i]);
            if (distance >= mid) {
                installedLouter++;
                distance = 0;
            }
        }
        return installedLouter;
    }
}