package uz.bakhromjon;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 24/10/22, Mon, 19:10
 **/
// Puzzle 1:
public class Oddity {
    // what's wrong this method?
    // this method always return false, if i non-positive int
    public static boolean isOddIncorrect(int i) {
        return i % 2 == 1;
    }

    // 0, -, +
    public static boolean isOddCorrect(int i) {
        return i % 2 != 0;
    }

    // perfect
    public static boolean isOddPerfect(int i) {
        return (i & 1) != 0;
    }
}
