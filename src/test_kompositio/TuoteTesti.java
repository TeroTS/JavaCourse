package test_kompositio;

import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;

public class TuoteTesti {

	public static void main(String[] args) {
		
		String dateString0 = "10.01.2012";
		String dateString1 = "23.4.2012";
		String dateString2 = "23.5.2012";
		DateFormat formatter = DateFormat.getDateInstance(); //("dd.MM.yyyy");
		
		try {
			//luo ja tulosta tuote
			TarjousTuote tarjousTuote = new TarjousTuote(1234, "tarjoustuote", 10.35);
			tarjousTuote.setTarjousHinta(9.99);
			Date date0 = formatter.parse(dateString0);
			tarjousTuote.setTarjouksenAlkuPvm(date0);
			tarjousTuote.setTarjouksenLoppuPvm(date0);
			System.out.println(tarjousTuote.toString());
			//luo tuote, muunna se tarjoustuotteeksi ja tulosta
			Date date1 = formatter.parse(dateString1);
			Date date2 = formatter.parse(dateString2);
			Tuote tuote = new Tuote(5678, "tuote", 23.50);
			tarjousTuote = Apuluokka.muunnin(tuote, 19.99, date1, date2);
			System.out.println(tarjousTuote.toString());
		}
		catch(ParseException pe) {
			System.out.println("parseExcption !");
		}
	}

}
