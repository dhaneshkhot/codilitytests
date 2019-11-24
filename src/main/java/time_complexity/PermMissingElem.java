package time_complexity;

import java.util.HashMap;

public class PermMissingElem {

    // Detected time complexity: O(N) or O(N * log(N))
    public int solution(int[] A) {
        int missingElement = -1;
        int len = A.length;
        HashMap h = new HashMap();
        int j = 0;
        for (int i = 1; i <= (len + 1); i++) {
            boolean found = false;
            if(h.containsKey(i))
                continue;
            for (;j<len;j++) {
                if (i == A[j]) {
                    found = true;
                    break;
                }
                h.put(A[j], null);
            }
            if (!found) {
                missingElement = i;
                break;
            }
        }
        return missingElement;
    }

    // Detected time complexity: O(N ** 2)
    public int solution2(int[] A) {
        int missingElement = -1;
        int len = A.length;
        for (int i = 1; i <= (len + 1); i++) {
            boolean found = false;
            for (int j : A) {
                if (i == j) {
                    found = true;
                }
            }
            if (!found) {
                missingElement = i;
                break;
            }
        }
        return missingElement;
    }

}
