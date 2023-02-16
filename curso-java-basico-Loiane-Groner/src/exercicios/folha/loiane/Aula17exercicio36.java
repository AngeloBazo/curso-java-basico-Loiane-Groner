package exercicios.folha.loiane;

import java.util.Scanner;

public class Aula17exercicio36 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o N : ");

		double nDigitado = teclado.nextDouble();
		
		System.out.println("--------------------");

		double h1 = 1;

		double h2, h3 = 0;

		int count;

		for (count = 1; count <= nDigitado; count++) {

			h2 = h1 / count;

			h3 = h3 + h2;

			System.out.println("Denominador " +  count + ":  -  1/" + count + " = " + h2);

		}

		System.out.println("--------------------");
		
		System.out.println("A soma de todos é = " + (h1 + h3));

	}

}
