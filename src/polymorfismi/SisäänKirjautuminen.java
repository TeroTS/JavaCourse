package polymorfismi;

public class SisäänKirjautuminen {
	
	private Ylläpitäjä ylläpitäjä;
	private Käyttäjä käyttäjä;
	private KäyttäjäTunnistus käyttäjäTunnistus;
	
	/**
	* Luo uuden instanssin luokasta annetuilla tiedoilla.
	*/
	public SisäänKirjautuminen() {
		ylläpitäjä = new Ylläpitäjä("Admin", "qwerty");
		käyttäjä = new Käyttäjä("kalle", "1234");
		käyttäjäTunnistus = new KäyttäjäTunnistus();		
	}
	/**
	 * Sisään kirjautuminen.Palauttaa true or false riippuen onnistuiko 
	 * sisäänkirjautuminen
	 */
	public boolean kirjauduSisään(String käyttäjätunnus, String salasana) {
		boolean ok = false;
		if(käyttäjätunnus.equals("Admin")) {
			ok = käyttäjäTunnistus.tarkistaKäyttäjä(ylläpitäjä, salasana);
		} else if (käyttäjätunnus.equals("kalle")) {
			ok = käyttäjäTunnistus.tarkistaKäyttäjä(käyttäjä, salasana);
		}
		return ok;
	}
	
	  /**
	  * Kertoo onko ylläpitäjä kirjatuneena järjestelmään vai ei.
	  */
	  public boolean onkoYlläpitäjä() {
	    return käyttäjäTunnistus.onkoYlläpitäjä();
	  }


}
