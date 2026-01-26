/**
 * Info: Leetcode#3602 Hexadecimal and Hexatrigesimal Conversion
 * Ref: https://leetcode.com/problems/hexadecimal-and-hexatrigesimal-conversion
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        int n = 13;
        // CASE 2
        int n = 36;

        System.out.println(concatHex36(n));
    }
    
    private static String concatHex36(int n) {
    	String hex = Integer.toString(n * n, 16).toUpperCase();
        String base36 = Integer.toString(n * n * n, 36).toUpperCase();
        return hex + base36;
    }
}