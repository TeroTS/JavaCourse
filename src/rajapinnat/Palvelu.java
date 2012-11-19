package rajapinnat;

//Palvelu on periytetty Tuote luokasta ja toteuttaa MyyntiArtikkeli rajapinnan
public class Palvelu extends Tuote implements MyyntiArtikkeli{

	private String henkil�;
	
	/**
	 * luodaan uusi instanssi
	 */
	public Palvelu(double perusHinta, double myyntiHinta, String nimi, int tuoteKoodi, String henkil�) {
		super(perusHinta, myyntiHinta, nimi, tuoteKoodi);
		this.henkil� = henkil�;
	}

	 /**
	   * Palauttaa henkil�n
	   */
	  public String getHenkil�() {
	    return henkil�;
	  }

	  /**
	   * Asettaa henkil�n
	   */
	  public void setHenkil�(String henkil�) {
	    this.henkil� = henkil�;
	  }
	
}
