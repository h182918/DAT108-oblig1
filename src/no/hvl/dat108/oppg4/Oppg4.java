/**
 * 
 */
package no.hvl.dat108.oppg4;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
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
		Ansatt a2 = new Ansatt("Petter", "Bø", 'M', "IT", 150000);
		Ansatt a3 = new Ansatt("Kari", "Mø", 'K', "Tele", 460000);
		Ansatt a4 = new Ansatt("Are", "Lie", 'M', "Salg", 350000);
		Ansatt a5 = new Ansatt("Lars", "Moe", 'M', "Sjef", 1000000);
		Ansatt a6 = new Ansatt("Trine", "Lie", 'K', "Tele", 490000);
		Ansatt a7 = new Ansatt("Knut", "Jonsen", 'M', "Salg", 410000);
		Ansatt a8 = new Ansatt("Siri", "Sjur", 'K', "Sjef", 600000);
		
		List<Ansatt> ansatte = new ArrayList<Ansatt>();
		ansatte.add(a1);
		ansatte.add(a2);
		ansatte.add(a3);
		ansatte.add(a4);
		ansatte.add(a5);
		ansatte.add(a6);
		ansatte.add(a7);
		ansatte.add(a8);
		
		//Liste av Heltall 1-1000
				List<Integer> heltall = new ArrayList<Integer>();
				for(int i = 1; i < 1000; i++) {
					heltall.add(i);
				}
				
				
//		a) Lag en ny liste som kun inneholder etternavnene til de ansatte.
		System.out.println("Listen sortert etter etternavn: ");
		Stream<Object> minStream = ansatte.stream().map(x -> x.getEtternavn());
		minStream.forEach(System.out :: println); 			
	
		
//		b) Finn ut antall kvinner blant de ansatte.
		Stream<Ansatt> AlleDamene = ansatte.stream().filter(n -> n.getKjonn() == 'K');
		int sum = (int) AlleDamene.count();
		System.out.println("Antall Damer: " +sum);
		

//		c) Regn ut gjennomsnittslønnen til kvinnene.
		Stream<Ansatt> Damene = ansatte.stream().filter(n -> n.getKjonn() == 'K');
		Damene.mapToDouble(n -> n.getAarslonn()).average().ifPresent( x -> System.out.println(x));
	
		
//		d) Gi alle sjefer (stilling = "sjef") en lønnsøkning på 7% (Bruk løsning fra Oppg3)
		System.out.println("Lønn til sjefene etter økning: ");
		ansatte.stream().filter(n -> n.getStilling() == "Sjef")
			.peek(n -> n.setAarslonn(n.getAarslonn()*1.07))			
			.forEach(n -> System.out.println(n.toString()));		
		
		
//		e) Finn ut (true|false) om det er noen ansatte som tjener mer enn 800.000,-
		System.out.println("Det finnes en eller flere personer som har lønn over 800 000kr: ");
		boolean merEnn = ansatte.stream().anyMatch(x -> x.getAarslonn() > 800000);
		System.out.println(merEnn);
		
//		f) Skriv ut alle de ansatte med System.out.println() uten å bruke løkke.
		System.out.println("Skriver ut alle de ansatte: ");
		ansatte.stream().forEach(a -> System.out.println(a));
		
//		g) Finn og skriv ut den/de ansatte som har lavest lønn.
		System.out.println("De ansatt(e) med lavest lønn er: ");
		Double minst = ansatte.stream().min((p1,p2) -> Double.compare(p1.getAarslonn(), p2.getAarslonn())).get().getAarslonn();
		System.out.println(ansatte.stream().filter(x -> x.getAarslonn() == minst).collect(toList()));
	
//		h) Finn og skriv ut summen av alle heltall i [1, 1000> som er delelig med 3 eller 5.
		Stream<Integer> htall = heltall.stream().filter(x ->(x % 3 == 0 || x % 5 == 0));
		List<Integer> delelig = htall.collect(Collectors.toList());
		int summen = delelig.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("Summen av heltall delelig på 3 og 5 er: " + summen);	
			
		
		
	}

}
