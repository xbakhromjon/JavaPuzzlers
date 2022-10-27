package uz.bakhromjon.expressivePuzzlers;

import java.math.BigDecimal;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 24/10/22, Mon, 19:21
 **/
// Puzzle 2:
public class TimeForAChange {

    /*
    Consider the following word problem:
        Tom goes to the auto parts store to buy a spark plug that costs $1.10, but all he
        has in his wallet are two-dollar bills. How much change should he get if he pays
        for the spark plug with a two-dollar bill?
    */

    public static void main(String args[]) {
        System.out.println(2.00 - 1.10);

        // Poor solution - still uses binary floating-point!
        System.out.printf("%.2f%n", 2.00 - 1.10);

        // use int or long
        System.out.println((200 - 110) + " cents");

        // There is one caveat: Always use the BigDecimal(String) constructor, never BigDecimal(double)
        // wrong answer: 0.899999999999999911182158029987476766109466552734375
        //System.out.println(new BigDecimal(2.00).subtract(new BigDecimal(1.10)));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));

    }


    /*
        In summary, avoid float and double where exact answers are required;
        for monetary calculations, use int, long, or BigDecimal.
    */
}
