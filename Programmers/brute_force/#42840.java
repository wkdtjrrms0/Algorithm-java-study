import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Info: Programmers#42840 모의고사
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/42840
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // case 1
//		int[] answers = {1, 2, 3, 4, 5};

        // case 2
        int[] answers = {1, 3, 2, 4, 2};

        System.out.println(solution(answers));
    }

    public static int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % 5]) {
                score[0]++;
            }
            if (answers[i] == second[i % 8]) {
                score[1]++;
            }
            if (answers[i] == third[i % 10]) {
                score[2]++;
            }
        }

        int max = Arrays.stream(score).max().getAsInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < score.length; i++) {
            if (max == score[i]) {
                list.add(i + 1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}