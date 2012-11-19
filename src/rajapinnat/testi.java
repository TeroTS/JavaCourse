package rajapinnat;

public class testi {

	public static void main(String[] args) {
		
		//luo uusi tuote
		Tuote tuote = new Tuote(10.0, 5.0, "tuote", 1000);
		//luo uusi palvelu
		Palvelu palvelu = new Palvelu(20.0, 20.0, "Palvelu", 1111, "Kalle");
		//lis‰‰ tuotteet ostoskoriin
		OstosKori.addToList(tuote);
		OstosKori.addToList(palvelu);
		//tulosta ostoskori
		OstosKori.printList();
		//poista tuote
		OstosKori.deleteFromList(tuote);
		//tulosta ostoskori
		OstosKori.printList();
	}

}
