interface Animal {
    public void animalSound();
    public void hello();
  }
  
  
  class Cat implements Animal {
    public void animalSound() {
      System.out.println("meow1");
    }
    public void hello() {
      System.out.println("hello");
    }
  }
  
  class interface1 {
    public static void main(String[] args) {
      Cat myCat = new Cat(); 
      myCat.animalSound();
      myCat.hello();
    }
  }
