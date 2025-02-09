import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Info: Programmers#42576 완주하지 못한 선수
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java
 */
public class Main {
	public static void main(String[] args) throws IOException {
		// case 1
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		// case 2
//		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		// case 3
//		String[] participant = {"mislav", "stanko", "mislav", "ana"};
//		String[] completion = {"stanko", "ana", "mislav"};

		System.out.println(solution(participant, completion));
	}

	public static String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> map = new HashMap<>();
		String answer = "";
		
		for (String p : participant) {
			map.put(p, map.getOrDefault(p, 0) + 1);
		}
		
		for (String p : completion) {
			map.put(p, map.get(p) - 1);
		}
		
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
	}
}