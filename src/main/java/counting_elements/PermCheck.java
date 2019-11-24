package counting_elements;

import java.util.HashMap;
import java.util.Map;

public class PermCheck {

    // Detected time complexity: O(N) or O(N * log(N))  // Correctness = 100%, performance = 100%
    public int solution(int[] A) {
        int permCheck=0;
        Map<Integer,Integer> map = new HashMap<>();

        int k = 0;
        for (; k < A.length; k++) {
            if (map.containsKey(A[k])) {
                permCheck = 0;
                break;
            } else {
                map.put(A[k], null);
            }
        }
        if(k==map.size()){
            int i = 1;
            for (; i <= A.length; i++) {
                if(map.containsKey(i))
                    continue;
                else
                    break;
            }
            if(i==A.length+1)
                permCheck = 1;
        }
        return permCheck;
    }
}
