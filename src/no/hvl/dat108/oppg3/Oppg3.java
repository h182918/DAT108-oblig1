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

		Ansatt a = new Ansatt("Per", "Askeladden", 'M', "Salg", 300000);
		Ansatt b = new Ansatt("Pål", "Askeladden", 'M', "Tele", 500000);
		Ansatt c = new Ansatt("Espen", "Askeladden", 'M', "Grøtspising", 900000);
		System.out.println("De ansatt er: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		Function<Double, Double> fastKroneLavLonn = n -> {
			if (n < 300000) {
				n = n * 1.5;
			}
			return n;
		};

		
		Function<Double, Double> prosentTillegg = n -> n * 1.07;

		a.endreLonn(fastKroneLavLonn);
		b.endreLonn(prosentTillegg);
		c.endreLonn(fastKrone());

		System.out.println("Etter gjennomgang av lønn: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


	}

	public static Function<Double, Double> fastKrone() {
		return (n -> n + 20000);


	}

}
