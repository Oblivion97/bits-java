package core;


// The main method must be in a class named "Main".
public class JavaReccursion {
  public static void main(String[] args) {
    int result = sum(55);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}