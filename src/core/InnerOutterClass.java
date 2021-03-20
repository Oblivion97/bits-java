package core;



// The main method must be in a class named "Main".
class class1out {
  int x = 10;

  class class2in {
    int y = 5;
  }
  
  class class3in {
    int y = 5;
  }
}

public class InnerOutterClass {
  public static void main(String[] args) {
    class1out myOuter = new class1out();
    class1out.class2in myInner = myOuter.new class2in();
    class1out.class3in myInner1 = myOuter.new class3in();
    System.out.println(myInner.y + myOuter.x);
    System.out.println(myInner1.y + myOuter.x);
  }
}
