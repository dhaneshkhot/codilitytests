package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddOccurrencesInArrayTests {
    OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    public void shouldFindOddOccurrence(){
        int [] testData = {9, 3, 9, 3, 9, 7, 9};
        Assertions.assertEquals(7, oddOccurrencesInArray.solution(testData));
    }
}
