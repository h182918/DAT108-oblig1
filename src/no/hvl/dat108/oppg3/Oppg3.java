/**
 * 
 */
package no.hvl.dat108.oppg3;

import java.util.function.Function;

/**
 * @author jocef
 *
 */
public class Oppg3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ansatt a = new Ansatt("Per", "Askeladden", 'M', "Salg", 600000);
		Ansatt b = new Ansatt("P�l", "Askeladden", 'M', "Tele", 500000);
		Ansatt c = new Ansatt("Espen", "Askeladden", 'M', "Gr�tspising", 900000);
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
		
		Function<Double, Double> fastKrone = n -> n + 20000;
		Function<Double, Double> prosentTillegg = n -> n * 1.04;
		
		a.endreLonn(fastKrone);
		b.endreLonn(prosentTillegg);
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		
		

	}

}
