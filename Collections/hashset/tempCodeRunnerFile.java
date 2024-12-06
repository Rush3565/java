import java.util.*;
public class hashset1 {
    public static void main (String[] args) {
        HashSet h1 = new HashSet ();
        h1.add("one");
        h1.add("two");
        h1.add("three");
        h1.add("four");
        h1.add("four");

        System.out.println(h1);
    }
}
