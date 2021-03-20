package core;

import java.util.List;

public class LinkedList { 
  public static void main(String[] args) { 
	List<String> cars = new java.util.LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    
    cars.add("Mazda");
    System.out.println(cars);
  } 
}
