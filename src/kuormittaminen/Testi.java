package kuormittaminen;

import test_kompositio.Tuote;

public class Testi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//luo uusia tuotteita
		Tuote tuote1 = new Tuote(1111, "tuote1", 10.0);
		Tuote tuote2 = new Tuote(2222, "tuote2", 100.00);
		Tuote tuote3 = new Tuote(3333, "tuote3", 1000.00);
		//luo uusia tarjoustuotteita
		TarjousTuote tarjousTuote1 = new TarjousTuote(tuote1, 10.0);
		TarjousTuote tarjousTuote2 = new TarjousTuote(tuote2, 10.0);
		TarjousTuote tarjousTuote3 = new TarjousTuote(tuote3, 10.0);
		//luo uusi alennuskori
		AlennusOstoskori alennusOstoskori = new AlennusOstoskori(20.0);
		//lis‰‰ tuotteet alennuskoriin
		alennusOstoskori.lis‰‰Tuote(tuote1);
		alennusOstoskori.lis‰‰Tuote(tuote2);
		alennusOstoskori.lis‰‰Tuote(tuote3);
		alennusOstoskori.lis‰‰Tuote(tarjousTuote1);
		alennusOstoskori.lis‰‰Tuote(tarjousTuote2);
		alennusOstoskori.lis‰‰Tuote(tarjousTuote3);
		//tulosta tiedot
		alennusOstoskori.tulostaTiedot();
	}

}
