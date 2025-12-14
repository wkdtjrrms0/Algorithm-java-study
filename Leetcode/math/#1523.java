import java.util.*;

/**
 * Info: Leetcode#1523 Count Odd Numbers in an Interval Range
 * Ref: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int low = 3, high = 7;
        // CASE 2
//        int low = 8, high = 10;
        // CASE 3
        int low = 0, high = 1000000000;

        System.out.println(countOdds(low, high));
    }
    private static int countOdds(int low, int high) {
        int count = 0;
        boolean isOddsLow = low % 2 != 0;
        boolean isOddsHigh = high % 2 != 0;
        if (isOddsLow && isOddsHigh) {
            count = (high - low + 1) / 2 + 1;
        } else {
            count = (high - low + 1) / 2;
        }
        return count;
    }
}