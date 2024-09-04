package no.hvl.dat108.f06d;

public class Teller {

	private int verdi = 0;

	public synchronized void tellOpp() {
		verdi++;
		/***
		 * verdi++ er IKKE atomisk
		 * verdi++ ~ verdi = verdi + 1
		 * 		1. Hente eksisterende verdi
		 * 		2. Beregne ny verdi: verdi + 1
		 * 		3. Lagre den nye verdien
		 */
	}

	public synchronized void tellNed() {
		verdi--;
	}

	public int getVerdi() {
		return verdi;
	}
}
