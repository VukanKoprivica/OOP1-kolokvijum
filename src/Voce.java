
public class Voce implements Comparable<Voce> {
	private String naziv;
	private double zapremina;
	
	public Voce(String naziv, double zapremina) {
		
		this.naziv = naziv;
		this.zapremina = zapremina;
	}

	public double getZapremina() {
		return zapremina;
	}

	@Override
	public String toString() {
		return "Voce ["+ naziv + + zapremina + "]";
	}
	
	public int compareTo(Voce o ) {
		return Double.compare(getZapremina(), o.getZapremina());
	}

}
