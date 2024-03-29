package polymorfismi;

public class KäyttäjäTunnistus {
	
	private boolean ylläpitäjäKirjautunut = false;
	
	/**
	 * Tarkista salasana
	 */
	public boolean tarkistaKäyttäjä(Käyttäjä käyttäjä, String salasana) {
		boolean ok = käyttäjä.tarkistaSalasana(salasana);
		if (ok) {
			if (käyttäjä instanceof Ylläpitäjä) {
				ylläpitäjäKirjautunut = true;
			}
		}
		return ok;
	}
	
	/**
	 * Kirjaudu ulos
	 */
	public void kirjauduUlos(Käyttäjä käyttäjä) {
		if (käyttäjä instanceof Ylläpitäjä) {
			ylläpitäjäKirjautunut = false;
		}
	}
	
	/**
	 * Onko ylläpitäjä
	 */
	public boolean onkoYlläpitäjä() {
		return ylläpitäjäKirjautunut;
	}
	
}
