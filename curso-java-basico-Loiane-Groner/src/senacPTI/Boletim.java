package senacPTI;

import java.util.Scanner;

public class Boletim {

	public Boletim (float n, int f, String s) {
		
		float nota = n;
		int frequencia = f;
		String status = s;
			
	}
	
	public Boletim (String st) {
		
		int nota = 10;
		int frequencia = 100;
		String status = st;
		
		
	}

	
	public Boletim () {
		
}

public static void main (String [] args) {
	
	float nota;
	int freq;
	String st;

	Scanner ler = new Scanner (System.in);
	
	System.out.println("Insira nota de início : ");
	nota = ler.nextFloat();
	
	System.out.println("Insira a frequência de início : ");
	freq = ler.nextInt();
	
	System.out.println("Insira o status de início : ");
	st = ler.next();

Boletim B1 = new Boletim (nota,freq,st);
Boletim B2 = new Boletim ();
Boletim B3 = new Boletim ("Aprovado");

}
}

