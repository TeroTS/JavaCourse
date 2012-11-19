package test_periytt�minen;

import java.util.ArrayList;

public class PalautetutTuotteet {
	
	//arraylist 
	static private ArrayList<ViallinenTuote> viallisetTuotteet = new ArrayList<ViallinenTuote>();
	
	static public void addList(ViallinenTuote viallinenTuote) {
		viallisetTuotteet.add(viallinenTuote);
	}
	
	static public void printList() {
		for(ViallinenTuote index : viallisetTuotteet) {
			System.out.println(index.toString());
		}		
	}
	
}
