package uz.bakhromjon.expressivePuzzlers;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 27/10/22, Thu, 08:18
 **/
// Puzzle 5:
public class JoyOfHex {
    public static void main(String[] args) {
        // incorrect
        System.out.println(
                Long.toHexString(0x100000000L + 0xcafebabe));

        // correct
        System.out.println(
                Long.toHexString(0x100000000L + 0xcafebabeL));
    }
}
