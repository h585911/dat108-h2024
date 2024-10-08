package no.hvl.dat108.f06c;

public class _SleepStoppJoinMain {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * I dette eksempelet skal vi se på
		 * - Hvordan legge inn pause i en tråd
		 * - Hvordan stoppe en tråd som ellers går "evig"
		 * - Hvordan vente på at en tråd gjør seg ferdig
		 * - Hvordan avslutte program selv om ikke alle tråder er ferdige
		 */

		TraadSomKanStoppes t = new TraadSomKanStoppes("T");
		t.start();
		
		Thread.sleep(5000);
		t.stopp();
		t.join(); // Vente på at T er helt ferdig før main avsluttes
		
		System.out.println(Thread.currentThread().getName() + " avsluttes");
	}
}
