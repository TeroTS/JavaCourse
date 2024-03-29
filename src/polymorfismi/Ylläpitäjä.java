/*
*
* Ylläpitäjä.java
*/

package polymorfismi;

/**
* Ylläpitäjä on vastaava kuin Käyttäjä, mutta ylläpitäjä voi muuttaa kenen
* tahansa käyttäjän salasanan.
*/
public class Ylläpitäjä extends Käyttäjä {
 /**
  * Luo uuden instanssin Ylläpitäjä-luokasta annetuilla tiedoilla.
  */
 public Ylläpitäjä(String käyttäjäTunnus, String salasana) {
   super(käyttäjäTunnus, salasana);
 }

 /**
  * Metodi vaihtaa annetun käyttäjän salasanan. Palauttaa true jos
  * vaihtaminen onnistui, false jos ei. Vaihtamiseen tarvitaan ylläpitäjän
  * salasana.
  */
 public boolean muutaSalasana(Käyttäjä käyttäjä, String ylläpitäjänSalasana,
     String uusiSalasana) {
   boolean muutosOnnistui = false;

   // Tarkistetaan, että ylläpitäjän salasana on oikein. Jos on oikein,
   // on muuttaminen sallittu.
   if (super.tarkistaSalasana(ylläpitäjänSalasana)) {
     käyttäjä.setSalasana(uusiSalasana);
     muutosOnnistui = true;
   } else {
     muutosOnnistui = false;
   }

   return muutosOnnistui;
 }
} 

