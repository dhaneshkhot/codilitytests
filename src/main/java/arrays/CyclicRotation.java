package arrays;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int len = A.length;
        if(len==0 || len==1)
            return A;
        for(int i=0; i<K; i++){
            int lastItem = A[len-1];
            for(int j=0; j<len; j++){
                A[len-(j+1)] = A[len-(j+2)];
                if(len-(j+2) ==0)
                    break;
            }
            A[0]=lastItem;
        }
        return A;
    }
}
