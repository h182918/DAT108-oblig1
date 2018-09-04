package no.hvl.dat108.oppg2;

public class samtid {

	public static void main(String[] args) {
		Buffer b = new Buffer();
		Consumer c1 = new Consumer(b);
		Producer p1 = new Producer(b);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(c1);
		t1.start();
		t2.start();
		
	}
}
