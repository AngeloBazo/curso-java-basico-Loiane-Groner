package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
				
				System.out.println ("Entre com o primeiro numero: " );
				int primeiroNumero = scan.nextInt ();
								

				System.out.println ("Entre com o segundo numero: " );
				int segundoNumero = scan.nextInt ();


				System.out.println ("Entre com o terceiro numero: " );
				int terceiroNumero = scan.nextInt ();
		
										
				if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
					
					System.out.println ("Numero um é maior:" + primeiroNumero);
				
				} else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
				
					System.out.println ("dois é maior" + segundoNumero );
				
				} else if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) { 
				
					System.out.println ("terceiro É MAiOR:" + terceiroNumero );
				
				}	
				
}

}
