package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println ("Entre com o primeiro pre�o: " );
		double primeiroNumero = scan.nextDouble ();
						

		System.out.println ("Entre com o segundo pre�o: " );
		double segundoNumero = scan.nextDouble ();
		

		System.out.println ("Entre com o terceiro pre�o: " );
		double terceiroNumero = scan.nextDouble ();
				
		
		if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
			
			System.out.println ("comprar o PRIMEIRO pre�o:" + primeiroNumero);
		
		} else if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
		
			System.out.println ("comprar o SEGUNDO pre�o" + segundoNumero );
		
		} else if (terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero) { 
		
			System.out.println ("comprar o TERCEIRO pre�o" + terceiroNumero );

		

	}
	}
}
