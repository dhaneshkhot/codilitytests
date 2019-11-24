package time_complexity;

public class FrogJmp {

    // Detected time complexity: O(1)
    public int solution(int X, int Y, int D) {
        int mustJumps = Y/D;
        int remainder = Y%D;

        int extraJumps = X/D;
        int extraRemainder = X%D;

        if(remainder>extraRemainder)
            mustJumps = mustJumps + 1 - extraJumps;
        else
            mustJumps = mustJumps - extraJumps;

        return mustJumps;
    }

    // Detected time complexity: O(Y-X)
    public int solution2(int X, int Y, int D) {
        int jumps = 0;

        while(!(X>=Y)){
            X = X+D;
            jumps++;
        }
        return jumps;
    }
}
