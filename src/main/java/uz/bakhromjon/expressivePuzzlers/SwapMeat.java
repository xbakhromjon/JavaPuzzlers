package uz.bakhromjon.expressivePuzzlers;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 30/10/22, Sun, 10:26
 **/
// Puzzle 7:
public class SwapMeat {
    public static void main(String[] args) {
        int x = 1984; // (0x7c0)
        int y = 2001; // (0x7d1)
        x ^= y ^= x ^= y;
        System.out.println("x = " + x + "; y = " + y);
    }
}
