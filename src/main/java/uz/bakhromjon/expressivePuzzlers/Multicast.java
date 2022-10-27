package uz.bakhromjon.expressivePuzzlers;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 27/10/22, Thu, 08:22
 **/
// Puzzle 6:
public class Multicast {
    public static void main(String[] args) {
        System.out.println((int) (char) (byte) -1);

        // -1 65535 dan keladi. 65535 dan katta bo'lsa 0 dan keladi.
        System.out.println((int) (char) -2);
    }

    /*
        Agar  char ga cast qilmoqchi bo'lgan sonimiz charning max_val 65535 dan katta bo'lsa
        0 dan boshlab sanaydi. Agar son char ning min_val 0 dan kichik bo'lsa, -1 = 65535 dan boshlab sanaydi.
    */
}
