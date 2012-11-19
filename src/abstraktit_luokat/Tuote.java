package abstraktit_luokat;

public abstract class Tuote {
	
	private double normaaliHinta;
	private String nimi;
	private int tuoteKoodi;
	
	/**
	 * aseta muuttujille arvot, ei luoda instanssia
	 */
	public Tuote(double normaaliHinta, String nimi, int tuoteKoodi) {
		this.normaaliHinta = normaaliHinta;
		this.nimi = nimi;
		this.tuoteKoodi = tuoteKoodi;
	}
	
	/**
	 * palauta myyntihinta, abstrakti metodi
	 */
	public abstract double getMyyntiHinta();

	/**
	 * palauta normaaliHinta
	 */
	public double getNormaaliHinta() {
		return normaaliHinta;
	}

	/**
	 * aseta normaalihinta
	 */
	public void setNormaaliHinta(double normaaliHinta) {
		this.normaaliHinta = normaaliHinta;
	}

	/**
	 * palauta nimi
	 */
	public String getNimi() {
		return nimi;
	}

	/**
	 * aseta nimi
	 */
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	/**
	 * palauta tuotekoodi
	 */
	public int getTuoteKoodi() {
		return tuoteKoodi;
	}

	/**
	 * aseta tuotekoodi
	 */
	public void setTuotekoodi(int tuoteKoodi) {
		this.tuoteKoodi = tuoteKoodi;
	}
	
	/**
	 * Palauttaa selväkielisenä tuotteen tiedot.
	 */
	public String toString() {
		return "Tuotteen tiedot: koodi=" + this.tuoteKoodi + ", nimi=" + this.nimi
	        + ", normaali hinta=" + this.normaaliHinta + ", myyntihinta = "
	        + this.getMyyntiHinta();
	  }

}
