/**
 * 
 */
package no.hvl.dat108.oppg3;

/**
 * @author jocef
 *
 */
public class Ansatt{
	
	private String fornavn;
	private String etternavn;
	private char kjonn;
	private String stilling;
	private double aarslonn;
	
	public Ansatt() {
		
	}
	
	public Ansatt(String fornavn, String etternavn, char kjonn, String stilling, int aarslonn) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.kjonn = kjonn;
		this.stilling = stilling;
		this.aarslonn = aarslonn;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public char getKjonn() {
		return kjonn;
	}

	public void setKjonn(char kjonn) {
		this.kjonn = kjonn;
	}

	public String getStilling() {
		return stilling;
	}

	public void setStilling(String stilling) {
		this.stilling = stilling;
	}

	public double getAarslonn() {
		return aarslonn;
	}

	public void setAarslonn(double aarslonn) {
		this.aarslonn = aarslonn;
	}
	
	public void endreLonn(double tall) {
		double tillegg = 0;
		double prosent = 0;
		// setter maks %-økning til 100%
		if(tall > 1 && tall <= 1) {
		    prosent = 1 + tall;
		}else {
			 tillegg = tall;
		}
		//endre med fast kronetillegg
        if(tillegg > 1) {
        	aarslonn += tillegg;
        //endre hvis lønn er for lav
        }else if(aarslonn < 300000) {
        	aarslonn += 50000;
        // endre hvis lønn med %
        }else {
        	aarslonn = aarslonn * prosent;
        }
	}

	@Override
	public String toString() {
		return "Ansatt [fornavn=" + fornavn + ", etternavn=" + etternavn + ", kjonn=" + kjonn + ", stilling=" + stilling
				+ ", aarslonn=" + aarslonn + "]";
	}
	

}
