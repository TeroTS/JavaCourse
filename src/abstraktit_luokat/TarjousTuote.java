package abstraktit_luokat;

public class TarjousTuote extends Tuote {
	
	//alennusprosentti
	private double alennus;

	/**
	 * luo uusi instanssi
	 */
	public TarjousTuote(double normaaliHinta, String nimi, int tuoteKoodi, double alennus) {
		super(normaaliHinta, nimi, tuoteKoodi);
		this.alennus = alennus;
	}
	
	/**
	 * aseta myyntihinta, alennettu
	 */
	public double getMyyntiHinta() {
		return (getNormaaliHinta() * (100 - alennus)/100.0);
	}
	
}
