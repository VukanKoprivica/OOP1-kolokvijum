
public class Sokovnik implements Cediljka,Kontejner{

	
	private double zapremina;
	private int brojKomada;
	private Voce[] voce;
	
	
	
	public Sokovnik(double zapremina, Voce[] voce) {
		super();
		this.zapremina = zapremina;
		this.brojKomada = 0;
		this.voce = new Voce[voce.length];
		double ubaceno = 0.0;
		for(int i = 0;i < voce.length && ubaceno + voce[i].getZapremina() <= zapremina;i++ ) {
			if(voce[i] instanceof Jabuka && ((Jabuka) voce[i]).isCrvljiva()) {
				continue;
			} 
			else {
				this.voce[brojKomada++]= voce[i];
				ubaceno += voce[i].getZapremina();
			}
		}
	}

	@Override
	public double zapremina() {
		// TODO Auto-generated method stub
		return zapremina;
	}

	@Override
	public int komada() {
		// TODO Auto-generated method stub
		return brojKomada;
	}

	@Override
	public void cedi() {
		// TODO Auto-generated method stub
		
		System.out.println("Cedim...");
		int i = 0;
		while(i < brojKomada && voce[i] != null) {
				System.out.println(voce[i++]);
		}
	}

}
