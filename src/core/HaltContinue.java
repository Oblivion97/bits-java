package core;



// The main method must be in a class named "Main".
public class HaltContinue {
  public static void main(String[] args) {
    int result = sum(15, 10);
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}