package kuormittaminen;

import test_kompositio.Tuote;

public class AlennusOstoskori {
	
	private TarjousTuote[] tarjousTuotteet;
	private int indeksi;
	private double alennusProsentti;
	
	/**
	 * Luo uusi instanssi
	 */
	public AlennusOstoskori(double alennusProsentti) {
		this.alennusProsentti = alennusProsentti;
		tarjousTuotteet = new TarjousTuote[100];
		indeksi = 0;
	}
	
	/**
	 * Lis‰‰ tuote alennusOstoskoriin
	 */
	public void lis‰‰Tuote(Tuote tuote) {
		if (tuote instanceof TarjousTuote) {
			tarjousTuotteet[indeksi] = (TarjousTuote) tuote;
		} else {
			TarjousTuote tarjousTuote = new TarjousTuote(tuote, alennusProsentti);
			tarjousTuotteet[indeksi] = tarjousTuote;			
		}
		indeksi++;
	}
	
	/**
	 * Tulostaa lis‰ttyjen tuotteiden tiedot.
	 */
	public void tulostaTiedot() {
	    for (int i = 0; i < indeksi; i++) {
	      System.out.println(tarjousTuotteet[i].toString());
	    }
	}
	
}
