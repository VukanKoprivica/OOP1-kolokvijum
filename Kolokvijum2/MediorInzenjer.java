package Kolokvijum;

public class MediorInzenjer extends SoftverskiInzenjer {
	private int godineIskustva;

	public MediorInzenjer(String ime, String prezime, String jmbg, String omiljeniJezik, int godineIskustva) {
		super(ime, prezime, jmbg, omiljeniJezik);
		this.godineIskustva = godineIskustva;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int radi() {
		// TODO Auto-generated method stu
		return Random(20,50);
		
	
		
	}

	public int Random(int min,int max) {
		return (int)((Math.random() * (max-min))+ min );
		
	}


	public int getGodineIskustva() {
		return godineIskustva;
	}


	public void setGodineIskustva(int godineIskustva) {
		if(godineIskustva > 3)
		this.godineIskustva = godineIskustva;
	}
}
