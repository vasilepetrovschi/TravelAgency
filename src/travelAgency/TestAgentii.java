package travelAgency;

import java.util.ArrayList;
import java.util.HashMap;

public class TestAgentii {

	public static void main(String[] args) {

		Hotel hotel1 = new Hotel("Perla", 50);
		Hotel hotel2 = new Hotel("Aeolis", 40);
		Hotel hotel3 = new Hotel("Acrotiris", 60);
		
		

		ArrayList<Hotel> locatiiSejur1 = new ArrayList<>();
		locatiiSejur1.add(hotel1);
		locatiiSejur1.add(hotel2);
		locatiiSejur1.add(hotel3);

		ArrayList<Hotel> locatiiSejur2 = new ArrayList<>();
		locatiiSejur2.add(hotel2);

		ArrayList<Hotel> locatiiSejur3 = new ArrayList<>();
		locatiiSejur3.add(hotel3);

		HashMap<String, Integer> noptiSejur1 = new HashMap<>();

		noptiSejur1.put(hotel1.hotelNume, 1);
		noptiSejur1.put(hotel2.hotelNume, 2);
		noptiSejur1.put(hotel3.hotelNume, 1);

		HashMap<String, Integer> noptiSejur2 = new HashMap<>();

		noptiSejur2.put(hotel2.hotelNume, 7);

		HashMap<String, Integer> noptiSejur3 = new HashMap<>();

		noptiSejur3.put(hotel3.hotelNume, 7);

		Sejur sejur1 = new Sejur(locatiiSejur1, noptiSejur1);
		Sejur sejur2 = new Sejur(locatiiSejur2, noptiSejur2);
		Sejur sejur3 = new Sejur(locatiiSejur3, noptiSejur3);
		
		ArrayList<Sejur> sejururiAgentia1 = new ArrayList<>();
		sejururiAgentia1.add(sejur1);
		sejururiAgentia1.add(sejur2);
		sejururiAgentia1.add(sejur3);
		
		Agentii agentie1 = new Agentii("Aatravel", sejururiAgentia1);
		System.out.println("Costul sejurului 1 al agentiei " + agentie1.nume + " este de " + sejur1.costTotal());
		System.out.println("Costul sejurului 2 al agentiei " + agentie1.nume + " este de " +sejur2.costTotal());
		System.out.println("Costul sejurului 3 al agentiei " + agentie1.nume + " este de " +sejur3.costTotal());
	}

}
