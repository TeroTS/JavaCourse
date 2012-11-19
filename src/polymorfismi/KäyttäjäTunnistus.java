package polymorfismi;

public class K‰ytt‰j‰Tunnistus {
	
	private boolean yll‰pit‰j‰Kirjautunut = false;
	
	/**
	 * Tarkista salasana
	 */
	public boolean tarkistaK‰ytt‰j‰(K‰ytt‰j‰ k‰ytt‰j‰, String salasana) {
		boolean ok = k‰ytt‰j‰.tarkistaSalasana(salasana);
		if (ok) {
			if (k‰ytt‰j‰ instanceof Yll‰pit‰j‰) {
				yll‰pit‰j‰Kirjautunut = true;
			}
		}
		return ok;
	}
	
	/**
	 * Kirjaudu ulos
	 */
	public void kirjauduUlos(K‰ytt‰j‰ k‰ytt‰j‰) {
		if (k‰ytt‰j‰ instanceof Yll‰pit‰j‰) {
			yll‰pit‰j‰Kirjautunut = false;
		}
	}
	
	/**
	 * Onko yll‰pit‰j‰
	 */
	public boolean onkoYll‰pit‰j‰() {
		return yll‰pit‰j‰Kirjautunut;
	}
	
}
