import java.util.*;
public class Linkedhashset1 {
    public static void main (String[] args) {
        LinkedHashSet h1 = new LinkedHashSet ();
        h1.add("one");
        h1.add("two");
        h1.add("three");
        h1.add("four");
        h1.add("four");

        System.out.println(h1);
    }
}
