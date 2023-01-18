package Kolokvijum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tim {
	private String naziv;
	private String metodologija;
	private SoftverskiInzenjer[] inzinjeri;
	public Tim(String file) throws IOException {
		
		BufferedReader in =new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(file)));
		
		String prvalinija[] = in.readLine().split(",");
	
		this.naziv = prvalinija[0].trim();
		this.metodologija = prvalinija[1].trim();
		
		int n = Integer.parseInt(in.readLine().trim());
		this.inzinjeri = new SoftverskiInzenjer[n];
		for(int i = 0;i<n;i++) {
			String[] elementiLinije = in.readLine().split(",");
			String zvanje = elementiLinije[0].trim();
			String ime = elementiLinije[1].trim();
			String prezime = elementiLinije[2].trim();
			String jmbg = elementiLinije[3].trim();
			String omiljeniJezik = elementiLinije[4].trim();
			if(zvanje.equals("junior")) {
				inzinjeri[i] = new JuniorInzenjer(ime, prezime, jmbg, omiljeniJezik);
				
			}else if(zvanje.equals("medior")) {
				int godineIskustva =Integer.parseInt( elementiLinije[5].trim());
					inzinjeri[i] = new MediorInzenjer(ime, prezime, jmbg, omiljeniJezik,godineIskustva);
					
			}else if(zvanje.equals("senior")) {
					int godineIskustva =Integer.parseInt( elementiLinije[5].trim());
					inzinjeri[i] = new SeniorInzenjer(ime, prezime, jmbg, omiljeniJezik, godineIskustva);
				}
			}
			
			
			
		
		in.close();
		
	}
	
	public int radiNaProjektu(int brojDana) {
		int suma = 0;
		
		for(int i = 0;i < brojDana ;i++) {
			for(int j = 0;j<inzinjeri.length;j++) {
				suma += inzinjeri[j].radi();
				
			}
			
		}
			
		return suma;
	}
	
	
}
