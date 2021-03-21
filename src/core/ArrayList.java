package core;

import java.util.Collections;
import java.util.List;

public class ArrayList { 
  public static void main(String[] args) { 
    List<String> cars = new java.util.ArrayList<>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars.get(0));
    System.out.println(cars);
    cars.set(0, "Opel");
    System.out.println(cars.get(0));
    cars.remove(0);
    System.out.println(cars.get(0));
    System.out.println("\n");
    
    // for (int i = 0; i < cars.size(); i++) {
    //   System.out.println(cars.get(i));
    // }
    
    for (String i : cars) {
      System.out.println(i);
    }
    
    //cars.clear();
    
    Collections.sort(cars);
    
    System.out.println(cars);
    
    
  } 
}