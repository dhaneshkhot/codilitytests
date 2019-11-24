package iterations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryGapTests {
    BinaryGap binaryGap = new BinaryGap();

    @Test
    public void shouldGetBinaryGap(){
        Assertions.assertEquals(3, binaryGap.solution(187838748));
    }
}
