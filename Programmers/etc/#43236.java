import java.io.IOException;
import java.util.Arrays;

/**
 * Info: Programmers#43236 징검다리
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/43236?language=java
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // case 1
        int distance = 25;
        int[] rocks = {2, 14, 11, 21, 17};
        int n = 2;

        System.out.println(solution(distance, rocks, n));
    }

    public static int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        int left = 1;
        int right = distance;
        int answer = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (getRemovedRockCnt(rocks, mid, distance) <= n) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    public static int getRemovedRockCnt(int[] rocks, int mid, int distance) {
        int first = 0;
        int second = distance;
        int removeCnt = 0;

        for (int i = 0; i < rocks.length; i++) {
            if (rocks[i] - first < mid) {
                removeCnt++;
                continue;
            }
            first = rocks[i];
        }
        if (second - first < mid) {
            removeCnt++;
        }
        return removeCnt;
    }
}