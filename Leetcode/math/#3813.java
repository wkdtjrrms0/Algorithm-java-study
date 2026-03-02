import java.util.*;

/**
 * Info: Leetcode#3813 Vowel-Consonant Score
 * Ref: https://leetcode.com/problems/vowel-consonant-score/?envType=problem-list-v2&envId=v8lmo911&
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        String s = "cooear";
        // CASE 2
//        String s = "axeyizou";
        // CASE 3
        String s = "au 123";

        System.out.println(vowelConsonantScore(s));
    }

    private static int vowelConsonantScore(String s) {
        int c = 0;
        int v = 0;
        int answer = 0;
        s = s.replaceAll(" ", "");
        Character[] moum = {'a', 'e', 'i', 'o', 'u'};
        List<Character> vowelList = Arrays.asList(moum);

        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            if (Character.isDigit(k)) {
                continue;
            }
            if (vowelList.contains(k)) {
                v++;
            } else {
                c++;
            }
        }
        if (c > 0) {
            answer = Math.floorDiv(v, c);
        }
        return answer;
    }
}