/**
 * 
 */
package no.hvl.dat108.oppg4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import no.hvl.dat108.oppg3.Ansatt;

/**
 * @author jocef
 *
 */
public class Oppg4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ansatt a1 = new Ansatt("Anne", "Bø", 'K', "Salg", 150000);
		Ansatt a2 = new Ansatt("Petter", "Bø", 'M', "IT", 458000);
		Ansatt a3 = new Ansatt("Kari", "Mø", 'K', "Tele", 460000);
		Ansatt a4 = new Ansatt("Are", "Lie", 'M', "Salg", 350000);
		Ansatt a5 = new Ansatt("Lars", "Moe", 'M', "Sjef", 1000000);
		Ansatt a6 = new Ansatt("Trine", "Lie", 'K', "Tele", 490000);
		Ansatt a7 = new Ansatt("Knut", "Jonsen", 'M', "Salg", 410000);
		Ansatt a8 = new Ansatt("Siri", "Sjur", 'K', "Sjef", 600000);
		
		List<Ansatt> listen = new ArrayList<Ansatt>();
		listen.add(a1);
		listen.add(a2);
		listen.add(a3);
		listen.add(a4);
		listen.add(a5);
		listen.add(a6);
		listen.add(a7);
		listen.add(a8);
		
//		a) Lag en ny liste som kun inneholder etternavnene til de ansatte.
		
		
		
		Stream<Object> kunEtternavn = listen.stream().map(x -> x.getEtternavn());
		kunEtternavn.forEach(System.out::println);
//		b) Finn ut antall kvinner blant de ansatte.
		
		long antallKvinner = listen.stream().filter(x -> x.getKjonn() == 'K').count();
		System.out.println(antallKvinner);
//		c) Regn ut gjennomsnittslønnen til kvinnene.
		double snittLonnKvinner = listen.stream().mapToDouble(x -> x.getAarslonn()).average().getAsDouble();	
		System.out.println("snittlønn kvinner: " + snittLonnKvinner);
//		d) Gi alle sjefer (stilling = "sjef") en lønnsøkning på 7% (Bruk løsning fra Oppg3)
		listen.stream().filter(x -> x.getStilling() == "Sjef").forEach(x -> x.endreLonn(n -> n * 1.07));
		System.out.println(a5.getAarslonn());
//		e) Finn ut (true|false) om det er noen ansatte som tjener mer enn 800.000,-
		boolean merEnn = listen.stream().anyMatch(x -> x.getAarslonn() > 800000);
		System.out.println(merEnn);
//		f) Skriv ut alle de ansatte med System.out.println() uten å bruke løkke.
		listen.stream().forEach(x -> System.out.println(x));
//		g) Finn og skriv ut den/de ansatte som har lavest lønn.
		double lavesteLonn = listen.stream().mapToDouble(v -> v.getAarslonn()).min().orElseThrow(NoSuchElementException::new);
		System.out.println(lavesteLonn);
//		h) Finn og skriv ut summen av alle heltall i [1, 1000> som er delelig med 3 eller 5.

	}

}
