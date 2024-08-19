package no.hvl.dat108;

public class Main {

	public static void main(String[] args) {
		
		Skapning hund = new Hund();
		hund.siHei();
		
		Skapning fugl = new Fugl();
		fugl.siHei();
	}
}

class Fugl implements Skapning {

	@Override
	public void siHei() {
		System.out.println("Tweet!");
		
	}
	
}