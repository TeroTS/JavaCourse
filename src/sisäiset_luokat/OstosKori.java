package sis‰iset_luokat;

import java.util.ArrayList;
import java.util.Date;

import rajapinnat.MyyntiArtikkeli;

public class OstosKori {
	
	//arraylist 
    private ArrayList<MyyntiArtikkeli> myyntiArtikkelit = new ArrayList<MyyntiArtikkeli>();

	public void addToList(MyyntiArtikkeli myyntiArtikkeli) {
		System.out.println("Lis‰t‰‰n: " + myyntiArtikkeli.getNimi());
		myyntiArtikkelit.add(myyntiArtikkeli);
	}
	
	//poista myyntiartikkeli
	public void deleteFromList(MyyntiArtikkeli myyntiArtikkeli) {
		System.out.println("Poistetaan: " + myyntiArtikkeli.getNimi());
		for(int i=0; i < myyntiArtikkelit.size(); i++) {
			//poistetaan elementti tuotekoodin perusteella
			if ((myyntiArtikkelit.get(i)).getTuoteKoodi() == myyntiArtikkeli.getTuoteKoodi()) {
				myyntiArtikkelit.remove(i);
			}
		}
	}
	
	//tulosta myyntiartikkelit
	public void printList() {
		for(MyyntiArtikkeli index : myyntiArtikkelit) {
			System.out.println(index.toString());
		}		
	}
	
	//----------------------------------
	//TuoteVahvistus sis‰inen luokka
	//----------------------------------
	private class TuoteVahvistus implements Vahvistus {
		
		private String viesti;
		private Date p‰iv‰M‰‰r‰;
		private String[] myyntiArtikkeleidenNimet;
		
		public TuoteVahvistus(String viesti, Date p‰iv‰M‰‰r‰) {
			this.viesti = viesti;
			this.p‰iv‰M‰‰r‰ = p‰iv‰M‰‰r‰;
			this.myyntiArtikkeleidenNimet = new String[100];
		}

		/**
		 * palauta viesti
		 */
		public String getViesti() {
			return viesti;
		}
		
		/**
		 * palauta p‰iv‰m‰‰r‰
		 */
		public Date getP‰iv‰m‰‰r‰() {
			return p‰iv‰M‰‰r‰;
		}
		
		/**
		 * palauta myyntiartikkeleiden nimet
		 */
		public String[] getMyyntiartikkeleidenNimet() {
			for(int i=0; i < myyntiArtikkelit.size(); i++) {
				myyntiArtikkeleidenNimet[i] = myyntiArtikkelit.get(i).getNimi();
				//System.out.println(myyntiArtikkelit.get(i).getNimi());
			}
			return myyntiArtikkeleidenNimet;
		}
		
	}
	//----------------------------
	/**
	 * 
	 * luo uusi tilausvahvistus
	 */
	public Vahvistus luoTilausVahvistus(Date p‰iv‰) {
		TuoteVahvistus tilausVahvistus = new TuoteVahvistus("Tilaus vastaanotettu", p‰iv‰);
		return tilausVahvistus;	
	}
	
	/**
	 * 
	 * luo uusi toimitusvahvistus
	 */	
	public Vahvistus luoToimitusVahvistus(Date p‰iv‰) {
		TuoteVahvistus toimitusVahvistus = new TuoteVahvistus("Tavarat postissa", p‰iv‰);	
		return toimitusVahvistus;
	}  
	
	/**
	 * l‰het‰ vahvistus
	 */
	public void l‰het‰Vahvistus(Vahvistus vahvistus) {
		System.out.println("Vahvistus l‰hetetty !");
		System.out.println("viesti: " + vahvistus.getViesti());
		System.out.println("p‰iv‰m‰‰r‰: " + vahvistus.getP‰iv‰m‰‰r‰());
		for(int i = 0; i < vahvistus.getMyyntiartikkeleidenNimet().length; i++) {
        	if (vahvistus.getMyyntiartikkeleidenNimet()[i] != null) {
                System.out.println("myyntiartikkelit: " + vahvistus.getMyyntiartikkeleidenNimet()[i].toString());	
        	}
        }
	}

}
