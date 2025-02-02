import java.io.IOException;
import java.util.Arrays;
/**
 * Info: Programmers#42584 주식가격
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/42584?language=java
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // case 1
        int[] prices = {1, 2, 3, 2, 3};

        System.out.println(Arrays.toString(solution(prices)));
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }
        return answer;
    }
}