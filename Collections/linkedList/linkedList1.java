import java.util.*;
public class linkedList1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("rushan");
        list.addLast("abbasi");
        list.add(1,"husen");
        System.out.println("Linked List: "+list);
        System.out.println("getFirst: "+list.getFirst());
        System.out.println("getLast: "+list.getLast());
        System.out.println("get: "+list.get(1));


    }
}
