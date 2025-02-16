import java.io.IOException;
import java.util.HashMap;

/**
 * Info: Programmers#42577 전화번호 목록
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=java
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // case 1
//		String[] phone_book = {"119", "97674223", "1195524421"};

        // case 2
        String[] phone_book = {"123", "456", "789"};

        // case 3
//		String[] phone_book = {"12", "123", "1235", "567", "88"};

        System.out.println(solution(phone_book));
    }

    public static boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))){
                    return false;
                }
            }
        }
        return true;
    }
}