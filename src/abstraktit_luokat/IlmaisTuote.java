package abstraktit_luokat;

public class IlmaisTuote extends Tuote {
	
	//mink� tuotteen kylki�isen� ilmaistuote tulee
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
	 * aseta tuote mink� kylki�isen� ilmaistuote tulee
	 */
	public void setOstosTuote(String ostosTuote) {
		this.ostosTuote = ostosTuote;
	}
	
	/**
	 * palauta tuote mink� kylki�isen� ilmaistuote tulee
	 */
	public String getOstosTuote() {
		return ostosTuote;
	}

}
