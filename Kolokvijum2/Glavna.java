package Kolokvijum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Glavna {
	
	

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		Tim tim1 = new Tim("tim.txt");
		
		System.out.println(tim1.radiNaProjektu(10));
		
	}

}
