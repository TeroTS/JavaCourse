/*
*
* Yll‰pit‰j‰.java
*/

package polymorfismi;

/**
* Yll‰pit‰j‰ on vastaava kuin K‰ytt‰j‰, mutta yll‰pit‰j‰ voi muuttaa kenen
* tahansa k‰ytt‰j‰n salasanan.
*/
public class Yll‰pit‰j‰ extends K‰ytt‰j‰ {
 /**
  * Luo uuden instanssin Yll‰pit‰j‰-luokasta annetuilla tiedoilla.
  */
 public Yll‰pit‰j‰(String k‰ytt‰j‰Tunnus, String salasana) {
   super(k‰ytt‰j‰Tunnus, salasana);
 }

 /**
  * Metodi vaihtaa annetun k‰ytt‰j‰n salasanan. Palauttaa true jos
  * vaihtaminen onnistui, false jos ei. Vaihtamiseen tarvitaan yll‰pit‰j‰n
  * salasana.
  */
 public boolean muutaSalasana(K‰ytt‰j‰ k‰ytt‰j‰, String yll‰pit‰j‰nSalasana,
     String uusiSalasana) {
   boolean muutosOnnistui = false;

   // Tarkistetaan, ett‰ yll‰pit‰j‰n salasana on oikein. Jos on oikein,
   // on muuttaminen sallittu.
   if (super.tarkistaSalasana(yll‰pit‰j‰nSalasana)) {
     k‰ytt‰j‰.setSalasana(uusiSalasana);
     muutosOnnistui = true;
   } else {
     muutosOnnistui = false;
   }

   return muutosOnnistui;
 }
} 

