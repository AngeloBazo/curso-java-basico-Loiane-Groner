package exercicios.folha.loiane;

import java.util.Scanner;

public class Aula17exercicio14 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		int count;
		
		int qtPar = 0;
		int qtImpar = 0;
		
		for (count = 1; count <=10; count++) { 
			
			System.out.print("Digite um número inteiro : " );
			
			int numeroDigitado = scan.nextInt();
				
			
			if (numeroDigitado % 2 == 0) { 
				
				qtPar = qtPar + 1; 
			
			} else 	
				qtImpar = qtImpar + 1; 
			
	
		}

		System.out.println("Par: " + qtPar );
		
		System.out.println("Impar: " + qtImpar );
		
	}

}
