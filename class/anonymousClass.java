class Gretting{
    public void sayHello(){
        System.out.println("Hello");
    }
}
class India{
    Gretting g = new Gretting(){
        public void sayHello(){
            System.out.println("hi");
        }
    };
}
public class anonymousClass {
    public static void main(String[] args) {
        India india= new India();
        india.g.sayHello();
    }
}