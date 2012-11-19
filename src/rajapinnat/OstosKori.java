package rajapinnat;

import java.util.ArrayList;

public class OstosKori {
		
	//Arraylist johon voidaan lis‰t‰ mik‰ tahansa MyyntiArtikkelit rajapinnan toteuttava objekti
	static private ArrayList<MyyntiArtikkeli> myyntiArtikkelit = new ArrayList<MyyntiArtikkeli>();
		
	//lis‰‰ MyyntiArtikkeli
	static public void addToList(MyyntiArtikkeli myyntiArtikkeli) {
		System.out.println("Lis‰t‰‰n: " + myyntiArtikkeli.getNimi());
		myyntiArtikkelit.add(myyntiArtikkeli);
	}
	
	//poista myyntiartikkeli
	static public void deleteFromList(MyyntiArtikkeli myyntiArtikkeli) {
		System.out.println("Poistetaan: " + myyntiArtikkeli.getNimi());
		for(int i=0; i < myyntiArtikkelit.size(); i++) {
			//poistetaan elementti tuotekoodin perusteella
			if ((myyntiArtikkelit.get(i)).getTuoteKoodi() == myyntiArtikkeli.getTuoteKoodi()) {
				myyntiArtikkelit.remove(i);
			}
		}
	}
	
	//tulosta lista
	static public void printList() {
		for(MyyntiArtikkeli index : myyntiArtikkelit) {
			System.out.println(index.toString());
		}		
	}

}
