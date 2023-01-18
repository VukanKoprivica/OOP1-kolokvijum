import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Glavna {
	
	private Voce[] ucitajVoce(String file) throws  IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(file)));
		int n = Integer.parseInt(in.readLine().trim());
		Voce[] voce = new Voce[n];
		for(int i = 0;i<n;i++) {
			String[] elementiLinije = in.readLine().split(",");
			String naziv = elementiLinije[0].trim();
			double zapremina = Double.parseDouble(elementiLinije[1].trim());
			if(elementiLinije.length == 3) {
				boolean crvljiva = elementiLinije[2].trim().equals("da");
				voce[i] = new Jabuka(zapremina, crvljiva);
				
			}else if(naziv.equals("Ananas")) {
				voce[i] = new Ananas(zapremina);
				
			}else {
				voce[i] = new Voce(naziv, zapremina);
			}
		}
		in.close();
		Arrays.sort(voce);
		return voce;
		
	}
	
	
	public static void main(String args[]) throws IOException {
		Sokovnik sokovnik = new Sokovnik(1.0, new Glavna().ucitajVoce("Voce.txt"));
		sokovnik.cedi();
	}

}
