package counting_elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrogRiverOneTests {
    FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    public void shouldFindEarliestTime(){
        int[] testData = {1, 3, 1, 4, 2, 3, 5, 4};
        int x = 5;
        Assertions.assertEquals(6, frogRiverOne.solution(x, testData));
    }

    @Test
    public void shouldFindEarliestTime2(){
        int[] testData = {1, 3, 5, 5, 5, 1, 4, 2, 3, 5, 4};
        int x = 5;
        Assertions.assertEquals(7, frogRiverOne.solution(x, testData));
    }
}
