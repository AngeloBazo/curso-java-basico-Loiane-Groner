package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);
			
		System.out.println ("Entre com o primeiro n�mero: " );
		double primeiroNumero = scan.nextDouble ();
						

		System.out.println ("Entre com o segundo n�mero: " );
		double segundoNumero = scan.nextDouble ();
		

		System.out.println ("Entre com o terceiro n�mero: " );
		double terceiroNumero = scan.nextDouble ();
				
		
		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			
			System.out.println (" " + primeiroNumero);
		
		} else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
		
			System.out.println ("comprar o SEGUNDO pre�o" + segundoNumero );
		
		} else if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) { 
		
			System.out.println ("comprar o TERCEIRO pre�o" + terceiroNumero );

		

	}


	}

}
