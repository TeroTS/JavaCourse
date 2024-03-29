package polymorfismi;

public class KäyttäjäTesti {

	public static void main(String[] args) {

	    SisäänKirjautuminen kirjaus = new SisäänKirjautuminen();

	    // Kirjaudutaan sisään väärällä salasanalla
	    System.out.println("Kirjaus väärällä salasanalla: " + kirjaus.kirjauduSisään("kalle", "aaaa"));
	    System.out.println("Kirjaus väärällä salasanalla: " + kirjaus.kirjauduSisään("Admin", "bbbb"));
	    System.out.println("Onko ylläpitäjä kirjautuneena: " + kirjaus.onkoYlläpitäjä());

	    // Kirjaudutaan sisään oikealla salasanalla
	    System.out.println("Kirjaus oikealla salasanalla: " + kirjaus.kirjauduSisään("kalle", "1234"));
	    System.out.println("Kirjaus oikealla salasanalla: " + kirjaus.kirjauduSisään("Admin", "qwerty"));
	    System.out.println("Onko ylläpitäjä kirjautuneena: " + kirjaus.onkoYlläpitäjä());
		
	}

}
