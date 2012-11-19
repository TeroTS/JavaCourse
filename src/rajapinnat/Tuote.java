package rajapinnat;

//Tuote toteuttaa MyyntiArtikkeli rajapinnan
public class Tuote implements MyyntiArtikkeli{

	private double perusHinta;
	private double myyntiHinta;
	private String nimi;
	private int tuoteKoodi;
	
	/**
	 * luodaan uusi instanssi
	 */
	public Tuote(double perusHinta, double myyntiHinta, String nimi, int tuoteKoodi) {
		this.perusHinta = perusHinta;
		this.myyntiHinta = myyntiHinta;
		this.nimi = nimi;
		this.tuoteKoodi = tuoteKoodi;
	}

	/**
	 * palauta perushinta
	 */
	public double getPerusHinta() {
		return perusHinta;
	}

	/**
	 * aseta perushinta
	 */
	public void setPerusHinta(double perusHinta) {
		this.perusHinta = perusHinta;
	}

	/**
	 * palauta myyntihinta
	 */
	public double getMyyntiHinta() {
		return myyntiHinta;
	}

	/**
	 * aseta myyntihinta
	 */
	public void setMyyntiHinta(double myyntiHinta) {
		this.myyntiHinta = myyntiHinta;
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
	public void setTuoteKoodi(int tuoteKoodi) {
		this.tuoteKoodi = tuoteKoodi;
	}

	/**
	 * Palauttaa selväkielisenä tuotteen tiedot.
	 */
	public String toString() {
		return "Tuotteen tiedot: koodi=" + this.tuoteKoodi + ", nimi=" + this.nimi
	        + ", myyntihinta=" + this.myyntiHinta + ", perushinta = "
	        + this.perusHinta;
	}

}

