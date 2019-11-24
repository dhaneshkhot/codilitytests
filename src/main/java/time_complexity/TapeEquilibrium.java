package time_complexity;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class TapeEquilibrium {

    // Detected time complexity: O(N),  // Correctness = 100%, performance = 100%
    public int solution(int[] A) {
        int total = 0;
        for(int j : A)
            total +=j;

        int firstPart = 0;
        int secondPart;
        int minVal = Integer.MAX_VALUE;

        for (int j=1;j<A.length;j++) {
            firstPart += A[j-1];
            secondPart = total - firstPart;
            minVal = Math.min(minVal, Math.abs(firstPart - secondPart));
        }
        return minVal;
    }

    // Detected time complexity: O(N), // Correctness = 100%, performance = 66%, was bad for medium sized array, for large it was good
    // little improvement over solution2
    public int solution3(int[] A) {
        int len = A.length;
        int[] newArr = new int[len-1];

        int firstPart = A[0];
        int secondPart = Arrays.stream(A).parallel().sum() - firstPart;
        newArr[0] = Math.abs(firstPart-secondPart);

        if(len > 2)
        for (int j=1;j<len-1;j++) {
            firstPart += A[j];
            secondPart -= A[j];
            newArr[j] = (Math.abs(firstPart - secondPart));
        }
        return Arrays.stream(newArr).parallel().min().getAsInt();
    }

    // Detected time complexity: O(N), // Correctness = 100%, performance = 66%, was bad for medium sized array, for large it was good
    public int solution2(int[] A) {
        int len = A.length;
        HashMap h = new HashMap();

        int firstPart = A[0];
        int secondPart = Arrays.stream(A).parallel().sum() - firstPart;
        h.putIfAbsent(Math.abs(firstPart-secondPart), null);

        if(len > 2)
            for (int j=1;j<len-1;j++) {
                firstPart += A[j];
                secondPart -= A[j];
                h.putIfAbsent(Math.abs(firstPart - secondPart), null);
            }
        return (int) h.keySet().parallelStream().min(Comparator.naturalOrder()).get();
    }

    // Correctness = 100%, performance = 50%
    public int solution1(int[] A) {
        int len = A.length;
        HashMap h = new HashMap();
        int firstPart = A[0];
        int secondPart = 0;
        for (int j=1;j<len;j++) {
            secondPart += A[j];
        }
        h.put(Math.abs(firstPart-secondPart), null);
        if(len > 2)
        for (int j=1;j<len-1;j++) {
            firstPart = firstPart+A[j];
            secondPart = secondPart-A[j];
            int tmp = firstPart - secondPart;
            h.put(Math.abs(tmp), null);
        }
        return (int) h.keySet().parallelStream().sorted().findFirst().get();
    }
}
