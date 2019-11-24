package arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    // Detected time complexity: O(N) or O(N*log(N))
    public int solution(int[] A) {
        Map<Integer, Integer> h = new HashMap<>();
        for(int i:A){
            h.putIfAbsent(i, 0);
            Integer count = h.get(i);
            h.put(i, ++count);
        }
        return getUnpairedValue(h);
    }

    private int getUnpairedValue(Map<Integer, Integer> h){
        int value = -1;
        for(Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if(entry.getValue()%2 == 1) {
                value = entry.getKey();
                break;
            }
        }
        return value;
    }
}
