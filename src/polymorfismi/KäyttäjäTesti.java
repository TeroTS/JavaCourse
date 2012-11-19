package polymorfismi;

public class K‰ytt‰j‰Testi {

	public static void main(String[] args) {

	    Sis‰‰nKirjautuminen kirjaus = new Sis‰‰nKirjautuminen();

	    // Kirjaudutaan sis‰‰n v‰‰r‰ll‰ salasanalla
	    System.out.println("Kirjaus v‰‰r‰ll‰ salasanalla: " + kirjaus.kirjauduSis‰‰n("kalle", "aaaa"));
	    System.out.println("Kirjaus v‰‰r‰ll‰ salasanalla: " + kirjaus.kirjauduSis‰‰n("Admin", "bbbb"));
	    System.out.println("Onko yll‰pit‰j‰ kirjautuneena: " + kirjaus.onkoYll‰pit‰j‰());

	    // Kirjaudutaan sis‰‰n oikealla salasanalla
	    System.out.println("Kirjaus oikealla salasanalla: " + kirjaus.kirjauduSis‰‰n("kalle", "1234"));
	    System.out.println("Kirjaus oikealla salasanalla: " + kirjaus.kirjauduSis‰‰n("Admin", "qwerty"));
	    System.out.println("Onko yll‰pit‰j‰ kirjautuneena: " + kirjaus.onkoYll‰pit‰j‰());
		
	}

}
