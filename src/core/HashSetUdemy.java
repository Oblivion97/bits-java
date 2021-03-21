package core;

import java.util.HashSet;

public class HashSetUdemy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cars = new HashSet<String>();
		cars.add("Audi");//add hash set
		cars.add("BMW");
		cars.add("corolla");
		cars.add("F1");
		System.out.println(cars.contains("Audi"));//check if available
		cars.remove("corolla");
		System.out.println(cars.contains("corolla"));
		//clear all
		//cars.clear();
		
		System.out.println(cars);
		
		for (String i : cars) {
			System.out.println(i);
		}
	}

}
