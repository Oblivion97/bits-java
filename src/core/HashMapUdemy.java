package core;

import java.util.HashMap;

public class HashMapUdemy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Bagladesh", "Dhaka");
		capitalCities.put("Swiss", "Zurich");
		capitalCities.put("USA", "New York");
		capitalCities.put("sdrge", "asef");
		capitalCities.put("sfgv", "sse");
		System.out.println(capitalCities);
				
		//Access hash item
		capitalCities.get("England");
		System.out.println(capitalCities);
		
		//Remove hash item
		capitalCities.remove("England");
		System.out.println(capitalCities);
		
		//clear hash
		//capitalCities.clear();
		//System.out.println(capitalCities);
		
		//hash size
		int size = capitalCities.size();
		System.out.println(size);
		
		//loop through hash map-key
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------------");
		
		//loop through hash map-value
		for (String i : capitalCities.values()) {
			System.out.println(i);
		}
				
		//loop through hash map-value
		for (String i : capitalCities.keySet()) {
			System.out.println("Key: "+ i +",  value: " +capitalCities.get(i));
		}
		
		
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		// Add keys and values (Name, Age)
	    people.put("John", 32);
	    people.put("Steve", 30);
	    people.put("Angie", 33);

	    for (String i : people.keySet()) {
	      System.out.println("key: " + i + ",  value: " + people.get(i));
	    }
		
	}

}
