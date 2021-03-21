package core;

import java.util.Iterator;
import java.util.List;

public class IteratorListw3s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> FantasyFootball = new java.util.ArrayList<String>();
		
		FantasyFootball.add("Kaka");
		FantasyFootball.add("Messi");
		FantasyFootball.add("Arnold");
		
		Iterator<String> Player = FantasyFootball.iterator();
		System.out.println(Player.next());
		
		
		List<String> FantasyFootball1 = new java.util.ArrayList<String>();

		FantasyFootball1.add("Kaka");
		FantasyFootball1.add("Messi");
		FantasyFootball1.add("Arnold");

		Iterator<String> player1 = FantasyFootball1.iterator();
		while (player1.hasNext()) {
		System.out.println(player1.next());
		}
	}

}
