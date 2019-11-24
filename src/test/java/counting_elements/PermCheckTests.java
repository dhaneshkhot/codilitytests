package counting_elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PermCheckTests {
    PermCheck permCheck = new PermCheck();

    @Test
    public void shouldCheckForCorrectPermutation(){
        int[] testData = {4, 1, 3, 2};
        Assertions.assertEquals(1, permCheck.solution(testData));
    }

    @Test
    public void shouldCheckForWrongPermutation(){
        int[] testData = {4, 1, 3};
        Assertions.assertEquals(0, permCheck.solution(testData));
    }

}
