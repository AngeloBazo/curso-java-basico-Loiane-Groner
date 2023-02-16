package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println ("Entre com um número positivo ou negativo:" );
		
		int numeroDigitado = scan.nextInt ();
		
		if ( numeroDigitado < 0) {
			
			System.out.println ("O número digitado é: negativo " );
		
		} else if (numeroDigitado > 0) {
			
			System.out.println ("Número digitado é: positivo" );
					
			
		}		else 	
		
{		
			System.out.println ("Número digitado é ZERO");
		
		}
	
	}
	

}
