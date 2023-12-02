import java.util.Scanner;

public class TwoCrystalBalls {
    // Given two crystal balls that will break if dropped from high enough distance,
    // determine the exact spot in which it will
    // break in the most optimized way
    public static void main(String[] args) {
        boolean[] breaks = { false, false, false, false, false, false, false, true, true, true, true, true,
                true };
        int index = find(breaks);
        System.out.print((index + 1));
    }

    static int find(boolean[] breaks) {
        int jumpAmount = (int) Math.floor(Math.sqrt(breaks.length));
        int i = jumpAmount;
        for (; i < breaks.length; i++) {
            if (breaks[i])
                break;
        }

        i -= jumpAmount;

        for (int j = 0; j <= jumpAmount && j < breaks.length; j++, i++) {
            if (breaks[i])
                break;
        }
        return i;
    }
}
