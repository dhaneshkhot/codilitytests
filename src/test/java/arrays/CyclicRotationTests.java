package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CyclicRotationTests {
    CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    public void shouldTestCyclicRotation(){
        int[] testData = {3, 8, 9, 7, 6};
        int[] expectedData = {9, 7, 6, 3, 8};
        int k = 3;
        Assertions.assertArrayEquals(expectedData, cyclicRotation.solution(testData, k));
    }

    @Test
    public void shouldTestCyclicRotationForEmptyArray(){
        int[] testData = {};
        int[] expectedData = {};
        int k = 3;
        Assertions.assertArrayEquals(expectedData, cyclicRotation.solution(testData, k));
    }

    @Test
    public void shouldTestCyclicRotationForArrayWithOneValue(){
        int[] testData = {5};
        int[] expectedData = {5};
        int k = 3;
        Assertions.assertArrayEquals(expectedData, cyclicRotation.solution(testData, k));
    }
}
