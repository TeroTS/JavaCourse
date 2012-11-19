package test_periytt‰minen;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class testi {

	public static void main(String[] args) {
		
		//luo uusi tuote 0
		Tuote tuote0 = new Tuote(1234, "testituote0", 23.45);
		//luo uusi tuote 1
		Tuote tuote1 = new Tuote(5678, "testituote1", 67.77);
		//luo uusi tuote 2
		Tuote tuote2 = new Tuote(9999, "testituote2", 19.99);

		
		try {
			Date date0 = new SimpleDateFormat("dd.MM.yyyy").parse("15.01.2012");
			Date date1 = new SimpleDateFormat("dd.MM.yyyy").parse("23.05.2012");
			Date date2 = new SimpleDateFormat("dd.MM.yyyy").parse("19.07.2012");			
			//luo uusi viallinen tuote 0
			ViallinenTuote viallinenTuote0 = new ViallinenTuote(tuote0, "Erkki Jussi", date0);
			//luo uusi viallinen tuote 1
			ViallinenTuote viallinenTuote1 = new ViallinenTuote(tuote1, "Kalle Ville", date1);
			//luo uusi viallinen tuote 2
			ViallinenTuote viallinenTuote2 = new ViallinenTuote(tuote2, "Heikki Pertti", date2);
			//lis‰‰ palautetuttuotteet
			PalautetutTuotteet.addList(viallinenTuote0);
			PalautetutTuotteet.addList(viallinenTuote1);
			PalautetutTuotteet.addList(viallinenTuote2);
			//printtaa palautetuttuotteet
			PalautetutTuotteet.printList();
		}
		catch (ParseException pe) {
			System.out.println("parseExcption !");
		}
	}

}
