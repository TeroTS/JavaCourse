package test_kompositio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TarjousTuote {
	
	private double tarjousHinta;
	private Date tarjouksenAlkuPvm;
	private Date tarjouksenLoppuPvm;
	
	private Tuote tuote;
	
	/**
	 * Luo uusi TarjousTuote instanssi ilman alkuarvoja
	 */   
	public TarjousTuote()
	{
		tuote = new Tuote();
	}
	
	/**
	 * Luo uusi TarjousTuote instanssi alkuarvoilla
	 */
	public TarjousTuote(int tuoteId, String nimi, double hinta)
	{
		tuote = new Tuote(tuoteId, nimi, hinta);
		
	}

	/**
	 * Aseta tarjoushinta
	 */
	public void setTarjousHinta(double tarjousHinta)
	{
		this.tarjousHinta = tarjousHinta;
	}
	
	/**
	 * Hae tarjoushinta
	 */
	public double getTarjousHinta()
	{
		return tarjousHinta;
	}
	
	/**
	 * Aseta tarjouksenalkupvm
	 */
	public void setTarjouksenAlkuPvm(Date tarjouksenAlkuPvm)
	{
		this.tarjouksenAlkuPvm = tarjouksenAlkuPvm;
	}
	
	/**
	 * Hae tarjouksenalkupvm 
	 */
	public Date getTarjouksenAlkuPvm()
	{
		return tarjouksenAlkuPvm;
	}
	
	/**
	 * Aseta tarjouksenloppupvm
	 */
	public void setTarjouksenLoppuPvm(Date tarjouksenLoppuPvm)
	{
		this.tarjouksenLoppuPvm = tarjouksenLoppuPvm;
	}
	
	/**
	 * Hae tarjouksenloppupvm
	 */
	public Date getTarjouksenLoppuPvm()
	{
		return tarjouksenLoppuPvm;
	}
		
	  /** 
	   * Palauttaa tuoteId:n 
	   */ 
	  public int getTuoteId() 
	  { 
	    return tuote.getTuoteId(); 
	  } 

	  /** 
	   * Asettaa tuoteId:n 
	   */ 
	  public void setTuoteId(int tuoteId) 
	  { 
	    tuote.setTuoteId(tuoteId); 
	  } 

	  /** 
	   * Palauttaa hinnan 
	   */ 
	  public double getHinta() 
	  { 
	    return tuote.getHinta(); 
	  } 

	  /** 
	   * Palauttaa nimen 
	   */ 
	  public String getNimi() 
	  { 
	    return tuote.getNimi(); 
	  } 

	  /** 
	   * Asettaa hinnan 
	   */ 
	  public void setHinta(double hinta) 
	  { 
	    tuote.setHinta(hinta); 
	  } 

	  /** 
	   * Asettaa nimen 
	   */ 
	  public void setNimi(String nimi) 
	  { 
	    tuote.setNimi(nimi); 
	  } 
	   
	 /**  
	  * Palauttaa tuotteen tiedot selväkielisenä 
	  */ 
	  public String toString() 
	  { 
		StringBuffer sb = new StringBuffer(this.tuote.toString());

	    // Tarjoustuotteen tiedot
	    sb.append(", tarjoushinta=");
	    sb.append(this.tarjousHinta);

	   //String -> Date
	    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

	    sb.append(", tarjouksenAlkuPvm=");
	    sb.append(formatter.format(this.tarjouksenAlkuPvm));

	    sb.append(", tarjouksenLoppuPvm=");
	    sb.append(formatter.format(this.tarjouksenLoppuPvm));

	    // Palautetaan lopuksi koko merkkijono
	    return sb.toString();
	  
	  } 
	
}
