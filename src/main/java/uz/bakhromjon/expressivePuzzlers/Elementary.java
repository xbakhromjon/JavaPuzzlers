package uz.bakhromjon.expressivePuzzlers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 27/10/22, Thu, 08:10
 **/
// Puzzle 4:
public class Elementary {
    public static void main(String[] args) {
        System.out.println(12345 + 5432l);
        System.out.println(12345 + 5432L);

        // Bad code - uses el (l) as a variable name
        List<String> l = new ArrayList<String>();
        l.add("Foo");
        System.out.println(l);
    }

    /*
        Always use a capital el (L) in long literals, never a
        lowercase el (l).
        In summary, the lowercase letter el and the digit 1 are nearly identical in most
        typewriter fonts
    */
}
