package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println ("Entre com o primeiro n�mero :" );
		
		int primeiroNumero = scan.nextInt ();
		
System.out.println ("Entre com o segundo n�mero : " );
		
		int segundoNumero = scan.nextInt ();
		
		if ( primeiroNumero < segundoNumero) {
			
			System.out.println ("Maior numero �: " + segundoNumero);
		
		} else 	
		
{		
			System.out.println ("Maior numero �: " + primeiroNumero);
		
		}
	
	}
	

}
