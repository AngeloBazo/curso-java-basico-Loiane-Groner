package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
						
				Scanner scan = new Scanner (System.in);
				
				
				
				System.out.println("Digite um número: ");
				
				int numero1 = scan.nextInt();
								
				System.out.println ("O número informado foi: " + numero1);
				
				
				
System.out.println("Digite outro número: ");
				
				int numero2 = scan.nextInt();
								
				System.out.println ("O outro numero informado foi: " + numero2);

				
				System.out.println ("A soma de ambos números é: " + (numero1 + numero2));				

				}

}
