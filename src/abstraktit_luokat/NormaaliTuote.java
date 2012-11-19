package abstraktit_luokat;

public class NormaaliTuote extends Tuote {
	
	/**
	 * luo uusi instanssi
	 */
	public NormaaliTuote(double normaaliHinta, String nimi, int tuoteKoodi) {
		super(normaaliHinta, nimi, tuoteKoodi);
	}
	
	/**
	 * aseta myyntihinta
	 */
	public double getMyyntiHinta() {
		return getNormaaliHinta();
	}
	
}
