package Kolokvijum;

public class JuniorInzenjer extends SoftverskiInzenjer {
	
	
	

	public JuniorInzenjer(String ime, String prezime, String jmbg, String omiljeniJezik) {
		super(ime, prezime, jmbg, omiljeniJezik);
		// TODO Auto-generated constructor stub
	}
	public int radi() {
		return Random(5,10);
		
		
	}
	public int Random(int min,int max) {
		return (int)((Math.random() * (max-min))+ min );
		
	}

}
