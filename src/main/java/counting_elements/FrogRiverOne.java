package counting_elements;

import java.util.HashMap;
import java.util.Map;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        int time = -1;

        for(int i=0; i<A.length; i++){
            map.putIfAbsent(A[i], null);
            if(map.size() == X){
                time=i;
                break;
            }
        }
        return time;
    }
}
