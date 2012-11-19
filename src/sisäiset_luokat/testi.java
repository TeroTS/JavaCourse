package sis‰iset_luokat;

import rajapinnat.Tuote;
import java.util.Date;

public class testi {

	public static void main(String[] args) {
		
		//luo uusia tuotteita
		Tuote tuote0 = new Tuote(10.0, 5.0, "tuote0", 1000);
		Tuote tuote1 = new Tuote(20.0, 10.0, "tuote1", 1001);
		Tuote tuote2 = new Tuote(30.0, 15.0, "tuote2", 1011);
		//luo uusi ostoskori
		OstosKori ostosKori = new OstosKori();
		//lis‰‰ tuotteet ostoskoriin
		ostosKori.addToList(tuote0);
		ostosKori.addToList(tuote1);
		ostosKori.addToList(tuote2);
		//tee tilausvahvistus
		Vahvistus tilausVahvistus = ostosKori.luoTilausVahvistus(new Date());
		ostosKori.l‰het‰Vahvistus(tilausVahvistus);
		//tee toimitusvahvistus
		Vahvistus toimitusVahvistus = ostosKori.luoToimitusVahvistus(new Date());
		ostosKori.l‰het‰Vahvistus(toimitusVahvistus);		
	
	}

}
