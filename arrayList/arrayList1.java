import java.util.*;
public class arrayList1 {
    public static void main(String[] args) {
        ArrayList A1 = new ArrayList(5);
        A1.add("rushan");
        A1.add("keval");
        A1.add(0,"Abbasi");
        Iterator it = A1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
