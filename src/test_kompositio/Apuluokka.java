package test_kompositio;

import java.util.Date;

public class Apuluokka {
	
	/**
	 * Muunna tuote tarjoustuotteeksi k�ytt�en get- ja set-metodeja
	 */
	public static TarjousTuote muunnin(Tuote tuote, double tarjousHinta, Date tarjouksenAlkuPvm, Date tarjouksenLoppuPvm)
	{
		TarjousTuote tarjousTuote = new TarjousTuote();
		tarjousTuote.setTuoteId(tuote.getTuoteId());
		tarjousTuote.setNimi(tuote.getNimi());
		tarjousTuote.setNimi(tuote.getNimi());
		tarjousTuote.setTarjousHinta(tarjousHinta);
		tarjousTuote.setTarjouksenAlkuPvm(tarjouksenAlkuPvm);
		tarjousTuote.setTarjouksenLoppuPvm(tarjouksenLoppuPvm);
		return tarjousTuote;
	}
}
