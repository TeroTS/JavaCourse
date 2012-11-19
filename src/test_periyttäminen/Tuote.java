package test_periytt‰minen;

/** 
 * Normaalia verkkokaupassa myyt‰v‰‰ tuotetta kuvaava luokka. 
 */ 
public class Tuote 
{ 
	// Luokassa on kolme sis‰ist‰ muuttujaa 
	// ja n‰ille luodut akssessorit. Lis‰ksi luokassa 
	// on toString()-metodi, joka palauttaa tuotteen  
	// tiedot selv‰kielisen‰.     
	private int tuoteId; 
	private String nimi; 
	private double hinta; 
 /** 
  * Luo uuden ilmentym‰n Tuote-luokasta ilman alkuarvoja. 
  */ 
  public Tuote()  
  { 
  } 

 /** 
  * Luo uuden ilmentym‰n Tuote-luokasta annetuilla 
  * alkuarvoilla 
  */ 
  public Tuote(int tuoteId, String nimi, double hinta)  
  { 
    this.tuoteId = tuoteId; 
    this.nimi = nimi; 
    this.hinta = hinta;   
  } 
  
  /** 
   * Palauttaa tuoteId:n 
   */ 
  public int getTuoteId() 
  { 
    return tuoteId; 
  } 

  /** 
   * Asettaa tuoteId:n 
   */ 
  public void setTuoteId(int tuoteId) 
  { 
    this.tuoteId = tuoteId; 
  } 

  /** 
   * Palauttaa hinnan 
   */ 
  public double getHinta() 
  { 
    return hinta; 
  } 

  /** 
   * Palauttaa nimen 
   */ 
  public String getNimi() 
  { 
    return nimi; 
  } 

  /** 
   * Asettaa hinnan 
   */ 
  public void setHinta(double hinta) 
  { 
    this.hinta = hinta; 
  } 

  /** 
   * Asettaa nimen 
   */ 
  public void setNimi(String nimi) 
  { 
    this.nimi = nimi; 
  } 
   
 /**  
  * Palauttaa tuotteen tiedot selv‰kielisen‰ 
  */ 
  public String toString() 
  { 
    return "TuoteId=" + tuoteId + ", nimi=" + nimi + ", hinta=" + hinta;   
  } 

} 