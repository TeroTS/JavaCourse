package test_periyttäminen;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ViallinenTuote extends Tuote {

	String palauttajanNimi;
	public final Date PALAUTUS_PVM; 
	
	public ViallinenTuote(Tuote tuote, String palauttajanNimi, Date palautusPvm) {
		PALAUTUS_PVM = palautusPvm;
		this.palauttajanNimi = palauttajanNimi;
		this.setTuoteId(tuote.getTuoteId());
		this.setHinta(tuote.getHinta());
		this.setNimi(tuote.getNimi());	
	}
	
	//kuormita toString
	  public String toString() 
	  { 
		StringBuffer sb = new StringBuffer(super.toString());
		sb.append(" " + palauttajanNimi);
		SimpleDateFormat formatter = new SimpleDateFormat(" dd.MM.yyyy");
		sb.append(formatter.format(this.PALAUTUS_PVM));		
	    return sb.toString();   
	  } 
}
