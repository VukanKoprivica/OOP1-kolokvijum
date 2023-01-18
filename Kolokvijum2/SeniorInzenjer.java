package Kolokvijum;

public class SeniorInzenjer extends SoftverskiInzenjer {

	private int godineIskustva;
	
	public SeniorInzenjer(String ime, String prezime, String jmbg, String omiljeniJezik, int godineIskustva) {
		super(ime, prezime, jmbg, omiljeniJezik);
		this.godineIskustva = godineIskustva;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int radi() {
		// TODO Auto-generated method stub
		return  Random(30,100);
		
	}
	public int Random(int min,int max) {
		return (int)((Math.random() * (max-min))+ min );
		
	}


	public int getGodineIskustva() {
		return godineIskustva;
	}


	public void setGodineIskustva(int godineIskustva) {
		if(godineIskustva > 6)
			this.godineIskustva = godineIskustva;
	}

}
