package time_complexity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.SplittableRandom;

public class TapeEquilibriumTests {
    TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    public void shouldTestTapeEquilibrium(){
        int[] testData = {3, 1, 2, 4, 3};

        Assertions.assertEquals(1, tapeEquilibrium.solution(testData));
    }

    @Test
    public void shouldTestTapeEquilibrium2(){
        int[] testData = {3, 1};

        Assertions.assertEquals(2, tapeEquilibrium.solution(testData));
    }

    @Test
    public void shouldTestTapeEquilibrium4(){
        int[] testData = {-1000, 1000};

        Assertions.assertEquals(2000, tapeEquilibrium.solution(testData));
    }


    @Test
    public void shouldTestTapeEquilibriumNegative(){
        int[] testData = {-3, -1};

        Assertions.assertEquals(2, tapeEquilibrium.solution(testData));
    }

    @Test
    public void shouldTestTapeEquilibrium3(){
        int[] testData = {5, 6, 2, 4, 1};

        Assertions.assertEquals(4, tapeEquilibrium.solution(testData));
    }

    @Test
    public void shouldTestTapeEquilibrium_array_length_10000_for_0_100(){
        int[] testData = getRandomArray(10000, 0, 100);

        Assertions.assertEquals(true, tapeEquilibrium.solution(testData)>0);
    }

    private int[] getRandomArray(int size, int from, int to){
        int[] arr = new int[size];
        for(int j=0;  j<arr.length; j++){
            arr[0] = new SplittableRandom().nextInt(from,to);
        }
        return arr;
    }
}
