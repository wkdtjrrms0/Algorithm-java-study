import java.io.IOException;
import java.util.Arrays;

/**
 * Info: Programmers#42747 H-Index
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/42747?language=java
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // case 1
        int[] citations = {3, 0, 6, 1, 5};

        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        Arrays.sort(citations);
        int hidx = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                hidx = citations.length - i;
                break;
            }
        }

        return hidx;
    }
}