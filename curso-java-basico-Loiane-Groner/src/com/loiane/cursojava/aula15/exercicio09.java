package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);
			
		System.out.println ("Entre com o primeiro número: " );
		double primeiroNumero = scan.nextDouble ();
						

		System.out.println ("Entre com o segundo número: " );
		double segundoNumero = scan.nextDouble ();
		

		System.out.println ("Entre com o terceiro número: " );
		double terceiroNumero = scan.nextDouble ();
				
		
		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			
			System.out.println (" " + primeiroNumero);
		
		} else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
		
			System.out.println ("comprar o SEGUNDO preço" + segundoNumero );
		
		} else if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) { 
		
			System.out.println ("comprar o TERCEIRO preço" + terceiroNumero );

		

	}


	}

}
