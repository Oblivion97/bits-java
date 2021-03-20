package core;

// The main method must be in a class named "Main".
public class constructorValuepass {
  int ex;

  public constructorValuepass(int y) {
    ex = y;
  }
  
  public static int subMain(int y, int x){
      int sum= y+x;
       return sum;
  }

  public static void main(String[] args) {
	constructorValuepass myObj = new constructorValuepass(5);
    int myObj1 =  subMain(myObj.ex, 10);
    System.out.println(myObj1);
  }
}
