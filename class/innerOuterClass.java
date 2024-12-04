class Outer{
    class Inner{
        void if1(){
            System.out.println("inner class");
        }
    }
}
public class innerOuterClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner o1=o.new Inner();
        o1.if1(); 
    }
}
