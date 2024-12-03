abstract class Animal {
  public abstract void animalSound();
  public void hello() {
    System.out.println("hello");
  }
}


class Cat extends Animal {
  public void animalSound() {
    System.out.println("meow");
  }
}

class ab1 {
  public static void main(String[] args) {
    Cat myCat = new Cat(); 
    myCat.animalSound();
    myCat.hello();
  }
}