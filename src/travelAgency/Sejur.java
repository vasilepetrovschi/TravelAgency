package travelAgency;

import java.util.ArrayList;
import java.util.HashMap;

public class Sejur {

	ArrayList<Hotel> hoteluri = new ArrayList<>();
	HashMap<String, Integer> noptiHotel;
	
	
	public Sejur(ArrayList<Hotel> hoteluri, HashMap<String, Integer> noptiHotel) {
		super();
		this.hoteluri = hoteluri;
		this.noptiHotel = noptiHotel;
	}
	
	public double costTotal() {
		
		double pretPeNoapte;
		Integer numarNopti;
		double cost = 0.0;
		
		for (Hotel hotel : hoteluri) {
			pretPeNoapte = hotel.pretNoapte;
			numarNopti = this.noptiHotel.get(hotel.hotelNume);
			cost = cost + pretPeNoapte*numarNopti;
			
		}
		
		return cost;
	}
	
}
