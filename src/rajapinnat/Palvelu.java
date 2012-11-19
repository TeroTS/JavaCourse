package rajapinnat;

//Palvelu on periytetty Tuote luokasta ja toteuttaa MyyntiArtikkeli rajapinnan
public class Palvelu extends Tuote implements MyyntiArtikkeli{

	private String henkilö;
	
	/**
	 * luodaan uusi instanssi
	 */
	public Palvelu(double perusHinta, double myyntiHinta, String nimi, int tuoteKoodi, String henkilö) {
		super(perusHinta, myyntiHinta, nimi, tuoteKoodi);
		this.henkilö = henkilö;
	}

	 /**
	   * Palauttaa henkilön
	   */
	  public String getHenkilö() {
	    return henkilö;
	  }

	  /**
	   * Asettaa henkilön
	   */
	  public void setHenkilö(String henkilö) {
	    this.henkilö = henkilö;
	  }
	
}
