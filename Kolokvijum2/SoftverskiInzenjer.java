package Kolokvijum;

public abstract class SoftverskiInzenjer {

	private String ime;
	private String prezime; 
	private String jmbg ;
	private String omiljeniJezik;
	
	
	
	public SoftverskiInzenjer(String ime, String prezime, String jmbg, String omiljeniJezik) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.omiljeniJezik = omiljeniJezik;
	}

	

	abstract public int radi();

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getOmiljeniJezik() {
		return omiljeniJezik;
	}

	public void setOmiljeniJezik(String omiljeniJezik) {
		this.omiljeniJezik = omiljeniJezik;
	}
	
	
	
}
