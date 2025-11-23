import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Info: Leetcode#2085 Count Common Words With One Occurrence
 * Ref: https://leetcode.com/problems/count-common-words-with-one-occurrence
 */
public class Main {
    private static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        // CASE 1
//        String[] words1 = {"leetcode","is","amazing","as","is"};
//        String[] words2 = {"amazing","leetcode","is"};
        // CASE 2
//        String[] words1 = {"b","bb","bbb"};
//        String[] words2 = {"a","aa","aaa"};
        // CASE 3
        String[] words1 = {"a","ab"};
        String[] words2 = {"a","a","a","ab"};

        System.out.println(countWords(words1, words2));
    }
    private static int countWords(String[] words1, String[] words2) {
        int answer = 0;

        String[] tmpWords1 = Arrays.stream(words1)
                .filter(s -> Collections.frequency(Arrays.asList(words1), s) == 1)
                .toArray(String[]::new);
        String[] tmpWords2 = Arrays.stream(words2)
                .filter(s -> Collections.frequency(Arrays.asList(words2), s) == 1)
                .toArray(String[]::new);

        for (String word : tmpWords1) {
            for(String word2 : tmpWords2) {
                if(word.equals(word2)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}