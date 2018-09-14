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
	
	
	/*//2d)
 	 *Svar: Grunnen til at man kunne synkronisert dem er fordi utskrift fra produsering og 
 	 *konsumering skal være samkjørt, i form av at den vil produsere et element og deretter konsumere et element osv.
     *Med dette vil vi unngå at det vil komme utskrift for to eller 
     *flere produksjoner før den vil skrive ut en konsumering.  
	 */
}
