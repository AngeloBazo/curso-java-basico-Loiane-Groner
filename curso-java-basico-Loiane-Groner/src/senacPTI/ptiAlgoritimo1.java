package senacPTI;

import java.util.Scanner;

public class ptiAlgoritimo1 {

	public static void main(String[] args) 
	
	throws java.io.IOException {
	
		char ch;
		
	do {

		System.out.println ("PROGRAMA PARA CALCULAR COMBUST�VEL\n");
		
								
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite pre�o da gasolina: ");
		
		double precoGasolina  = scan.nextDouble();

		System.out.println ("Digite pre�o do �lcool: ");
		
		double precoAlcool  = scan.nextDouble();

		System.out.println ("O pre�o da gasolina �: " + precoGasolina);
		
		System.out.println ("O pre�o do �lcool �: " + precoAlcool);
		
		double resultadoDivisao = precoAlcool / precoGasolina;

		System.out.println ("Valor resultado: " + resultadoDivisao);
	
		if (resultadoDivisao > 0.7) {
		
			System.out.println ("Melhor Abastecer com gasolina" );
			
		} else if (resultadoDivisao < 0.7) {
			
			System.out.println ("Melhor Abastecer com �lcool" );
			
		} else if (resultadoDivisao == 0.7) {
		
			System.out.println ("Tanto faz" );
		} 

					
		System.out.println ("\nDeseja fazer novo c�lculo?  Digite:\n 'S' para SIM \n 'N' para N�O\n");
		
		ch = (char) System.in.read();
	
	}  while (ch != 'N');
		
	System.out.println ("Bye, Bye, Babe! See you later!");
	
		}		
	}
	


		

