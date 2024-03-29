/* 
 * 
 * Tuote.java 
 * 
 */ 


package test_kompositio; 

/** 
 * Normaalia verkkokaupassa myytävää tuotetta kuvaava luokka. 
 */ 
public class Tuote 
{ 
	
	private int tuoteId; 
	private String nimi; 
	private double hinta; 
 /** 
  * Luo uuden ilmentymän Tuote-luokasta ilman alkuarvoja. 
  */ 
  public Tuote()  
  { 
  } 

 /** 
  * Luo uuden ilmentymän Tuote-luokasta annetuilla 
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
  * Palauttaa tuotteen tiedot selväkielisenä 
  */ 
  public String toString() 
  { 
    return "TuoteId=" + tuoteId + ", nimi=" + nimi + ", hinta=" + hinta;   
  } 

} 