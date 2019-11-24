package iterations;

public class BinaryGap {
    public int solution(int N) {
        String binaryForm = Integer.toBinaryString(N);
        int binaryGap = 0;
        boolean gapStart = false;
        int zeroCounter = 0;
        for(char bit : binaryForm.toCharArray()){
            if(bit=='1')
                gapStart = true;
            if(bit=='0' && gapStart)
                zeroCounter += 1;
            if(bit=='1' && gapStart && zeroCounter>0){
                if(zeroCounter > binaryGap)
                    binaryGap = zeroCounter;
                zeroCounter = 0;
            }
        }
        return binaryGap;
    }
}
