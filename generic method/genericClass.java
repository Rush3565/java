class generic <T>{
    T i;
    public void add(T i1){
        i = i1;
    }
    public T get(){
        return (i) ;
    }
}
public class genericClass {
    public static void main(String[] args) {
        generic <Integer> g1 = new generic<Integer>();
        generic <String> g2 = new generic<String>();
        Integer k = 5;
        g1.add(k);
        g2.add("rahul");
        System.out.println("g1 :" + g1.get() + " g2 :" + g2.get());
    }
}