import java.io.IOException;
import java.util.Arrays;

/**
 * Info: Programmers#42746 가장 큰 수
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/42746?language=java
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // case 1
//		int[] numbers = {6, 10, 2};
        // case 2
        int[] numbers = {3, 30, 34, 5, 9};

        System.out.println(solution(numbers));
    }

    public static String solution(int[] numbers) {
        String[] strNumbers = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);

        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

        if (strNumbers[0].equals("0")) {
            return "0";
        }

        return String.join("", strNumbers);
    }
}