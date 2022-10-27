package uz.bakhromjon.expressivePuzzlers;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 27/10/22, Thu, 08:05
 **/
// Puzzle 3:
public class LongDivision {
    public static void main(String[] args) {
        // This program print incorrect answer 5
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

        // This program print correct answer 1000
        final long MICROS_PER_DAY_C = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY_C = 24L * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY_C / MILLIS_PER_DAY_C);
    }
}
