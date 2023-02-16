package exercicios.folha.loiane;

import java.util.Scanner;

public class Aula17exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); 

		int maiorN = 0; 
		
		System.out.println("Digite um número :");
		int n1 = scan.nextInt();
		
		System.out.println("Digite um número :");
		int n2 = scan.nextInt();
		
		System.out.println("Digite um número :");
		int n3 = scan.nextInt();
		
		System.out.println("Digite um número :");
		int n4 = scan.nextInt();
		
		System.out.println("Digite um número :");
		int n5 = scan.nextInt();

		if (n1>maiorN) {
			maiorN = n1;
			
		} 
		
		if (n2>maiorN) {
				maiorN = n2;
			}
			
		if (n3>maiorN) {
			maiorN = n3;
		}
			
		if (n4>maiorN) {
			maiorN = n4;
		}
			
		if (n5>maiorN) {
			maiorN = n5;
		}
		
		
		System.out.println("O maior n digitado foi :" + maiorN);
		
	}

}
