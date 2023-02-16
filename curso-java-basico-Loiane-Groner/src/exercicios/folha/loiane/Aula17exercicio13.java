package exercicios.folha.loiane;

import java.util.Scanner;

public class Aula17exercicio13 {

	public static void main(String[] args) {
		
		int base1, base2, resSoma, count;
				
		Scanner scan = new Scanner (System.in);

		System.out.print("Digite a base : ");
		
		int baseDigitada = scan.nextInt();
		
		System.out.print("\nDigite o expoente : ");
		
		int expoenteDigitado = scan.nextInt();

		System.out.println(" ");
		
		base1 = baseDigitada;
		base2 = baseDigitada;
				
		if (expoenteDigitado == 1) {
			
			System.out.println("O resultado é : " + baseDigitada);
			
		}
		
		if (expoenteDigitado == 0) {
			
			System.out.println("O resultado é : 1 ");
			
		}
		
		if (baseDigitada == 0) {
			
			System.out.println("O resultado é : nulo!!! ");
			
		}
		
		for (count = 2; count <= expoenteDigitado; count++) {

			resSoma = base1*base2;
			base1=resSoma;
			
				
		}

		System.out.println("Resultado de " + baseDigitada + " com expoente " + expoenteDigitado + " é igual a " + base1);		
				
	}
}
