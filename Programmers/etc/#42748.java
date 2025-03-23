import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Info: Programmers#42748 K번째수
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/42748?language=java
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // case 1
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(array, commands)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = result(array, commands[i]);
        }

        return answer;
    }

    public static int result(int[] array, int[] command) {
        int[] splitArray = IntStream.range(command[0] - 1, command[1]).map(num -> array[num]).toArray();
        Arrays.sort(splitArray);
        return splitArray[command[2] - 1];
    }
}