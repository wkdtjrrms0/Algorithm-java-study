import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 * Info: Programmers#42578 의상
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/42578?language=java
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // case 1
//		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        // case 2
    	String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
    	
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
    	int answer = 1;
    	
    	HashMap<String, Integer> map = new HashMap<>();
		
    	for (String[] p : clothes) {
    		map.put(p[1], map.getOrDefault(p[1], 0) + 1);
    	}
    	Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
    	
    	while(iter.hasNext()){
    		Map.Entry<String, Integer> entry = iter.next();
    		answer *= entry.getValue() + 1;
    	}
    	
    	return answer -1;
    }
}