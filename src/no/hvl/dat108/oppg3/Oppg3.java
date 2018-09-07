/**
 * 
 */
package no.hvl.dat108.oppg3;

/**
 * @author jocef
 *
 */
public class Oppg3 {
	
	public void lonn(LønnInterface Inter) {
		Inter.endreLonnen();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oppg3 endre = new Oppg3();
		Ansatt a = new Ansatt("Per", "Askeladden", 'M', "Salg", 500000);
		Ansatt b = new Ansatt("Ola", "Ask", 'M', "Salg", 250000);
		Ansatt c = new Ansatt("Kari", "Aske", 'F', "Salg", 450000);
		Ansatt[] ansattList = new Ansatt[10];
		ansattList[0] = a;
		ansattList[1] = b;
		ansattList[2] = c;
		
		// hvilken ansatt skal endres
		int test = 0;
		System.out.println(ansattList[test]);
        LønnInterface endreLonnen = () -> {
		   ansattList[test].setAarslonn(ansattList[test].getAarslonn() + 1);
		};
		endre.lonn(endreLonnen);
		System.out.println(ansattList[test]);
	}
}
