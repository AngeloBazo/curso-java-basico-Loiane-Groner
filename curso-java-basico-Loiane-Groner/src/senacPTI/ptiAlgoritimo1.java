package senacPTI;

import java.util.Scanner;

public class ptiAlgoritimo1 {

	public static void main(String[] args) 
	
	throws java.io.IOException {
	
		char ch;
		
	do {

		System.out.println ("PROGRAMA PARA CALCULAR COMBUSTÍVEL\n");
		
								
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite preço da gasolina: ");
		
		double precoGasolina  = scan.nextDouble();

		System.out.println ("Digite preço do álcool: ");
		
		double precoAlcool  = scan.nextDouble();

		System.out.println ("O preço da gasolina é: " + precoGasolina);
		
		System.out.println ("O preço do álcool é: " + precoAlcool);
		
		double resultadoDivisao = precoAlcool / precoGasolina;

		System.out.println ("Valor resultado: " + resultadoDivisao);
	
		if (resultadoDivisao > 0.7) {
		
			System.out.println ("Melhor Abastecer com gasolina" );
			
		} else if (resultadoDivisao < 0.7) {
			
			System.out.println ("Melhor Abastecer com álcool" );
			
		} else if (resultadoDivisao == 0.7) {
		
			System.out.println ("Tanto faz" );
		} 

					
		System.out.println ("\nDeseja fazer novo cálculo?  Digite:\n 'S' para SIM \n 'N' para NÃO\n");
		
		ch = (char) System.in.read();
	
	}  while (ch != 'N');
		
	System.out.println ("Bye, Bye, Babe! See you later!");
	
		}		
	}
	


		

