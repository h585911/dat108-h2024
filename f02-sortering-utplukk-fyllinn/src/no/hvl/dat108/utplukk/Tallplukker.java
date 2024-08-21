package no.hvl.dat108.utplukk;

import java.util.ArrayList;
import java.util.List;


public class Tallplukker {

	public static List<Integer> plukkUt(List<Integer> liste, Betingelse b) {
		
		List<Integer> svar = new ArrayList<>();
		for(int tall : liste) {
			if(b.sjekk(tall)) { //Denne linjen
				svar.add(tall);
			}
		}
		return svar;
	}
}
