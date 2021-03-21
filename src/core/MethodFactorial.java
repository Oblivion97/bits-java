package core;

import java.util.Scanner;

// The main method must be in a class named "Main".
public class MethodFactorial {
  static void myMethod() {
    System.out.println("Hello World!");
  }
  static void factorial(int number){
      int i,fact=1;  
      //number is the number to calculate factorial    
      for(i=1;i<=number;i++){    
          fact=fact*i;    
      }    
      System.out.println("Factorial of "+number+" is: "+fact);    
    }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("enter an integer to calculate factorial: ");
    int number = keyboard.nextInt();
    
    factorial(number);
    keyboard.close();
  }
}
