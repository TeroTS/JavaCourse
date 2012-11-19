
package kuormittaminen;

import test_kompositio.Tuote;

public class TarjousTuote extends Tuote {
	
	private double alennusProsentti;
	
	/**
	 * Luo uusi instanssi
	 */
	public TarjousTuote(Tuote tuote, double alennusProsentti) {
		super(tuote.getTuoteId(), tuote.getNimi(), tuote.getHinta());
		this.alennusProsentti = alennusProsentti;	
	}
	
	/**
	 * Palauta alennettu hinta
	 */
	public double getHinta() {
		return super.getHinta()*(100 - alennusProsentti)/100;
	}
	
	/**
	 * Palauta normaali hinta
	 */
	public double getPerusHinta() {
		return super.getHinta();
	}
	
	/**  
	 * Palauttaa tuotteen tiedot selväkielisenä 
	 */ 
	 public String toString() 
	 {  
		 return super.toString() + " Tarjoushinta=" + this.getHinta();   
	 } 
	
}
