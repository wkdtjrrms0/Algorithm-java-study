import java.util.*;

/**
 * Info: Leetcode#2224 Minimum Number of Operations to Convert TimeMinimum Number of Operations to Convert Time
 * Ref: https://leetcode.com/problems/minimum-number-of-operations-to-convert-time/?envType=problem-list-v2&envId=v8lmo911
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        String current = "02:30", correct = "04:35";
        // CASE 2
        String current = "11:00", correct = "11:01";

        System.out.println(convertTime(current, correct));
    }

    private static int convertTime(String current, String correct) {
        int curr = Integer.parseInt(current.substring(0, 2)) * 60 +
                Integer.parseInt(current.substring(3, 5));
        int corr = Integer.parseInt(correct.substring(0, 2)) * 60 +
                Integer.parseInt(correct.substring(3, 5));
        int timeGap = corr - curr;
        int answer = 0;
        while (timeGap != 0) {
            if (timeGap >= 60) {
                answer += timeGap / 60;
                timeGap %= 60;
            } else if (timeGap >= 15) {
                answer += timeGap / 15;
                timeGap %= 15;
            } else if (timeGap >= 5) {
                answer += timeGap / 5;
                timeGap %= 5;
            } else if (timeGap >= 1) {
                answer += timeGap / 1;
                timeGap %= 1;
            }
        }
        return answer;
    }
}