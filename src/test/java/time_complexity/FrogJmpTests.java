package time_complexity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrogJmpTests {
    FrogJmp frogJmp = new FrogJmp();

    @Test
    public void shouldDoFrogJump(){
        int x=10, y=85, d=30;
        Assertions.assertEquals(3, frogJmp.solution(x, y, d));
    }

    @Test
    public void shouldDoFrogJumpWithExtreamY(){
        int x=3, y=999111321, d=7;
        Assertions.assertEquals(142730189, frogJmp.solution(x, y, d));
    }

    @Test
    public void shouldDoFrogJump2(){
        int x=5, y=105, d=3;
        Assertions.assertEquals(34, frogJmp.solution(x, y, d));
    }

    @Test
    public void shouldDoFrogJump3(){
        int x=50, y=199, d=4;
        Assertions.assertEquals(38, frogJmp.solution(x, y, d));
    }
}
