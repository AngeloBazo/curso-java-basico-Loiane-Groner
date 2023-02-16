package exercicios.folha.loiane;

import java.util.Scanner;

public class Aula17exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int notaDigitada;
		
		do {
					
			System.out.print("Digite uma nota entre ZERO e DEZ : ");

			notaDigitada = scan.nextInt();
			
				if ((notaDigitada < 0) || (notaDigitada > 10)) {
		
					System.out.println("\nNota inválida, digite novamente\n");
		
					}

				
		} while (notaDigitada < 0 || notaDigitada > 10); 
		
		
		System.out.println(" \nNOTA VÁLIDA - FIM DO PROGRAMA ");
		
	}
}
