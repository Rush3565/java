import java.util.*;
public class sortedset1 {
    public static void main (String[] args) {
        TreeSet h1 = new TreeSet ();
        h1.add("d");
        h1.add("a");
        h1.add("b");
        h1.add("e");
        h1.add("c");

        System.out.println(h1);
        System.out.println(h1.first());
        System.out.println(h1.last());
        System.out.println(h1.headSet("c"));
        System.out.println(h1.tailSet("c"));
        System.out.println(h1.subSet("c","e"));
        System.out.println(h1.comparator());
        System.out.println(h1.ceiling("c"));
        System.out.println(h1.floor("c"));
        System.out.println(h1.higher("c"));
        System.out.println(h1.lower("c"));
    }
}
