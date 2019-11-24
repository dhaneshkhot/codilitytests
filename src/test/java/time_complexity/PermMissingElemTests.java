package time_complexity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PermMissingElemTests {

    @Test
    public void shouldFindPermMissingElement(){
        PermMissingElem permMissingElem  = new PermMissingElem();

        int[] testData = {2, 3, 1, 5};
        Assertions.assertEquals(4, permMissingElem.solution(testData));
    }

    @Test
    public void shouldFindPermMissingElementDoubleElements(){
        PermMissingElem permMissingElem  = new PermMissingElem();

        int[] testData = {1, 2};
        Assertions.assertEquals(3, permMissingElem.solution(testData));
    }
}
