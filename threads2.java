class A extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("thread A" + i);
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("thread B" + i);
        }
    }
}
public class threads2 {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        t1.start();
        t2.start();
    }
}