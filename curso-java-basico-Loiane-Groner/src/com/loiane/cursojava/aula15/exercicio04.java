package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		System.out.println ("Entre com uma letra: ");

		String letraDigitada = scan.next();

		// pode ser assim
		
		// if (letraDigitada.equalsIgnoreCase("a") || if (letraDigitada.equalsIgnoreCase("b")) {) {
		
		
		if (letraDigitada.equalsIgnoreCase("a")) {
			
			System.out.println ("A letra digitada é uma vogal: " );
		
		}	else if (letraDigitada.equalsIgnoreCase("e")) {
			
			System.out.println ("A letra digitada é uma vogal: ");

		}	else if (letraDigitada.equalsIgnoreCase("i")) {
			
			System.out.println ("A letra digitada é uma vogal: ");

		}	else if (letraDigitada.equalsIgnoreCase("o")) {
			
			System.out.println ("A letra digitada é uma vogal: ");

		}	else if (letraDigitada.equalsIgnoreCase("u")) {
			
			System.out.println ("A letra digitada é uma vogal: ");
						
		}		else {
					
					System.out.println ("Consoante: " );


			}

		

	}

}
