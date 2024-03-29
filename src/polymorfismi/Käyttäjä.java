/*
 * Käyttäjä.java
 *
 */

package polymorfismi;

/**
 * Luokka kuvaa normaalia tietojärjestelmän käyttäjää. Käyttäjällä on
 * käyttäjätunnus ja salasana.
 */
public class Käyttäjä {

  /**
   * Luo uuden instanssin Käyttäjä-luokasta annetuilla tiedoilla.
   */
  public Käyttäjä(String käyttäjäTunnus, String salasana) {
    this.käyttäjäTunnus = käyttäjäTunnus;
    this.salasana = salasana;
  }

  // Luokan sisäiset muuttujat
  private String käyttäjäTunnus;

  private String salasana;

  /**
   * Palauttaa käyttäjäTunnuksen
   */
  public String getKäyttäjäTunnus() {
    return käyttäjäTunnus;
  }

  /**
   * Asettaa käyttäjäTunnuksen.
   */
  public void setKäyttäjäTunnus(String käyttäjäTunnus) {
    this.käyttäjäTunnus = käyttäjäTunnus;
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
