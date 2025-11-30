import java.util.*;

/**
 * Info: Leetcode#738 Monotone Increasing Digits
 * Ref: https://leetcode.com/problems/monotone-increasing-digits
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
        int n = 10;
        // CASE 2
//        int n = 1234;
        // CASE 3
//        int n = 332;
        // CASE 4
//        int n = 963856657;

        System.out.println(monotoneIncreasingDigits(n));
    }
    private static int monotoneIncreasingDigits(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int mark = arr.length;

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] > arr[i]) {
                arr[i - 1]--;
                mark = i;
            }
        }
        for (int i = mark; i < arr.length; i++) {
            arr[i] = '9';
        }
        return Integer.parseInt(new String(arr));
    }
}