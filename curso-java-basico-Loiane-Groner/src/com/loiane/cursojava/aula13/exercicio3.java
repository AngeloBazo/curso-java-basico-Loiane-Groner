package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
						
				Scanner scan = new Scanner (System.in);
				
				
				
				System.out.println("Digite um n�mero: ");
				
				int numero1 = scan.nextInt();
								
				System.out.println ("O n�mero informado foi: " + numero1);
				
				
				
System.out.println("Digite outro n�mero: ");
				
				int numero2 = scan.nextInt();
								
				System.out.println ("O outro numero informado foi: " + numero2);

				
				System.out.println ("A soma de ambos n�meros �: " + (numero1 + numero2));				

				}

}
