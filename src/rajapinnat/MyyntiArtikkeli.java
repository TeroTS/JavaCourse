package rajapinnat;

/**
 * t�ll� rajapinnalla voidaan toteuttaa mik� tahansa myyntiartikkeli
 */
public interface MyyntiArtikkeli {
	
	double getMyyntiHinta();
	double getPerusHinta();
	String getNimi();
	int getTuoteKoodi();
	void setMyyntiHinta(double myyntiHinta);
	void setPerusHinta(double perusHinta);
	void setNimi(String nimi);
	void setTuoteKoodi(int tuoteKoodi);

}

