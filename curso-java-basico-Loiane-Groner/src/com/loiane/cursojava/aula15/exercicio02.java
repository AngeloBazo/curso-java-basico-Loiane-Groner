package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println ("Entre com um n�mero positivo ou negativo:" );
		
		int numeroDigitado = scan.nextInt ();
		
		if ( numeroDigitado < 0) {
			
			System.out.println ("O n�mero digitado �: negativo " );
		
		} else if (numeroDigitado > 0) {
			
			System.out.println ("N�mero digitado �: positivo" );
					
			
		}		else 	
		
{		
			System.out.println ("N�mero digitado � ZERO");
		
		}
	
	}
	

}
