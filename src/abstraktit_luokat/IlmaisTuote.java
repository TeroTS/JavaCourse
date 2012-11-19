package abstraktit_luokat;

public class IlmaisTuote extends Tuote {
	
	//minkä tuotteen kylkiäisenä ilmaistuote tulee
	private String ostosTuote;

	/**
	 * luo uusi instanssi
	 */
	public IlmaisTuote(double normaaliHinta, String nimi, int tuoteKoodi, String ostos) {
		super(normaaliHinta, nimi, tuoteKoodi);
		this.ostosTuote = ostos;
	}
	
	/**
	 * aseta myyntihinta
	 */
	public double getMyyntiHinta(){
		return 0.0;
	}
	
	/**
	 * aseta tuote minkä kylkiäisenä ilmaistuote tulee
	 */
	public void setOstosTuote(String ostosTuote) {
		this.ostosTuote = ostosTuote;
	}
	
	/**
	 * palauta tuote minkä kylkiäisenä ilmaistuote tulee
	 */
	public String getOstosTuote() {
		return ostosTuote;
	}

}
