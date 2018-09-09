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
		Ansatt b = new Ansatt("Pål", "Askeladden", 'M', "Tele", 500000);
		Ansatt c = new Ansatt("Espen", "Askeladden", 'M', "Grøtspising", 900000);
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
		 
		
		Function<Double, Double> fastKrone = n -> n + 20000;
		Function<Double, Double> prosentTillegg = n -> n * 1.07;
		
		a.endreLonn(fastKrone);
		b.endreLonn(prosentTillegg);
		c.endreLonn(metode());
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
	public static Function<Double, Double> metode() {
		return (n -> n * 2);
	}

}
