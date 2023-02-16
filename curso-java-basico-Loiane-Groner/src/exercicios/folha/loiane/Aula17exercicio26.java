
package exercicios.folha.loiane;

import java.util.Scanner;

public class Aula17exercicio26 {

	public static void main(String[] args) {
					
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite um numero para saber seu fatorial : ");
				
		int numeroDigitado = scan.nextInt();
		
		int contDecrescente, contCrescente, result;
					
		result = 1;
		
		System.out.println("");
		
		System.out.print("Fatorial de " + numeroDigitado +  "! = ");
		
		for (contDecrescente = numeroDigitado; 
				contDecrescente > 0; 
					result *= contDecrescente--) {
		
			System.out.print("" + contDecrescente + " x ");			
	
		}	


		System.out.print(" = " + result);
		
		
	}

}
