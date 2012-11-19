package rajapinnat;

/**
 * tällä rajapinnalla voidaan toteuttaa mikä tahansa myyntiartikkeli
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

