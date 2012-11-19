package polymorfismi;

public class Sis‰‰nKirjautuminen {
	
	private Yll‰pit‰j‰ yll‰pit‰j‰;
	private K‰ytt‰j‰ k‰ytt‰j‰;
	private K‰ytt‰j‰Tunnistus k‰ytt‰j‰Tunnistus;
	
	/**
	* Luo uuden instanssin luokasta annetuilla tiedoilla.
	*/
	public Sis‰‰nKirjautuminen() {
		yll‰pit‰j‰ = new Yll‰pit‰j‰("Admin", "qwerty");
		k‰ytt‰j‰ = new K‰ytt‰j‰("kalle", "1234");
		k‰ytt‰j‰Tunnistus = new K‰ytt‰j‰Tunnistus();		
	}
	/**
	 * Sis‰‰n kirjautuminen.Palauttaa true or false riippuen onnistuiko 
	 * sis‰‰nkirjautuminen
	 */
	public boolean kirjauduSis‰‰n(String k‰ytt‰j‰tunnus, String salasana) {
		boolean ok = false;
		if(k‰ytt‰j‰tunnus.equals("Admin")) {
			ok = k‰ytt‰j‰Tunnistus.tarkistaK‰ytt‰j‰(yll‰pit‰j‰, salasana);
		} else if (k‰ytt‰j‰tunnus.equals("kalle")) {
			ok = k‰ytt‰j‰Tunnistus.tarkistaK‰ytt‰j‰(k‰ytt‰j‰, salasana);
		}
		return ok;
	}
	
	  /**
	  * Kertoo onko yll‰pit‰j‰ kirjatuneena j‰rjestelm‰‰n vai ei.
	  */
	  public boolean onkoYll‰pit‰j‰() {
	    return k‰ytt‰j‰Tunnistus.onkoYll‰pit‰j‰();
	  }


}
