package exercicios.folha.loiane;

import java.util.Scanner;

public class Aula17exercicio8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in); 

		int somaN; 
		int mediaN;
		
		System.out.println("Digite um n�mero :");
		int n1 = scan.nextInt();
		System.out.println("Digite um n�mero :");
		int n2 = scan.nextInt();
		System.out.println("Digite um n�mero :");
		int n3 = scan.nextInt();
		System.out.println("Digite um n�mero :");
		int n4 = scan.nextInt();
		System.out.println("Digite um n�mero :");
		int n5 = scan.nextInt();
		
		somaN = n1+n2+n3+n4+n5;
		
		mediaN = somaN / 5;
		
		System.out.println("Soma dos ns : " + somaN);
		System.out.println("");
		System.out.println("M�dia ns : " + mediaN);

	}

}
