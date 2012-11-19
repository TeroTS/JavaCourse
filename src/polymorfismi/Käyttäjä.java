/*
 * K‰ytt‰j‰.java
 *
 */

package polymorfismi;

/**
 * Luokka kuvaa normaalia tietoj‰rjestelm‰n k‰ytt‰j‰‰. K‰ytt‰j‰ll‰ on
 * k‰ytt‰j‰tunnus ja salasana.
 */
public class K‰ytt‰j‰ {

  /**
   * Luo uuden instanssin K‰ytt‰j‰-luokasta annetuilla tiedoilla.
   */
  public K‰ytt‰j‰(String k‰ytt‰j‰Tunnus, String salasana) {
    this.k‰ytt‰j‰Tunnus = k‰ytt‰j‰Tunnus;
    this.salasana = salasana;
  }

  // Luokan sis‰iset muuttujat
  private String k‰ytt‰j‰Tunnus;

  private String salasana;

  /**
   * Palauttaa k‰ytt‰j‰Tunnuksen
   */
  public String getK‰ytt‰j‰Tunnus() {
    return k‰ytt‰j‰Tunnus;
  }

  /**
   * Asettaa k‰ytt‰j‰Tunnuksen.
   */
  public void setK‰ytt‰j‰Tunnus(String k‰ytt‰j‰Tunnus) {
    this.k‰ytt‰j‰Tunnus = k‰ytt‰j‰Tunnus;
  }

  /**
   * Asettaa salasanan
   */
  public void setSalasana(String salasana) {
    this.salasana = salasana;
  }

  /**
   * Tarkistaa onko salasana oikein. Palauttaa true jos annettu salasana on
   * oikein, false jos ei.
   */
  public boolean tarkistaSalasana(String salasana) {
    boolean salasanaOk = false;

    if (this.salasana.equals(salasana)) {
      salasanaOk = true;
    } else {
      salasanaOk = false;
    }

    return salasanaOk;
  }

}  
