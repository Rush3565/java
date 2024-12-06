
import java.util.*;

public class cursor1 {

    public static void main(String[] args) {
        // Vector v = new Vector();
        // v.addElement("rushan");
        // v.addElement("abbasi");
        // v.addElement("husen");
        // System.out.println(v);

        // Enumeration e = v.elements();
        // while (e.hasMoreElements()) {
        //     String elem = (String) e.nextElement();
        //     System.out.println(elem + " " + elem.length());
        // }





        // ArrayList a1 = new ArrayList<>(); 
        //     for(int i = 1; i<= 10 ;i++){
        //         a1.add(i);
        //     }
        //     System.out.println(a1);

        //     Iterator it = a1.iterator();
        //     while (it.hasNext()) {
        //         Integer I = (Integer)it.next();
        //         if (I > 3 && I < 7) {
        //             it.remove();
        //         }
        //     }
        //     System.out.println(a1);




        LinkedList l1 = new LinkedList<>();
        l1.add("c");
        l1.add("java");
        l1.add("python");
        l1.add("c++");
        System.out.println(l1);

        ListIterator it = l1.listIterator();
        while (it.hasNext()) {
            String s = (String)it.next();
            if (s.equals("java")) {
                it.set("dsa");
            }
            else if(s.equals("python")){
                it.remove();
            }
            else if(s.equals("c++")){
                it.add("c#");
            }
        }
        System.out.println(l1);
            
    }
}