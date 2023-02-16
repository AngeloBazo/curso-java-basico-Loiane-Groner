package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);

System.out.println ("Entre com a letra \' F\' ou com a letra \' M\' : ");

String letraDigitada = scan.next();

if (letraDigitada.equalsIgnoreCase("F")) {
	
	System.out.println ("O sexo digitado foi FEMININO: " );

}	else if (letraDigitada.equalsIgnoreCase("M")) {
		
		System.out.println ("O sexo digitado foi MASCULINO: " );

}		else {
			
			System.out.println ("Sexo INVÁLIDO: " );


	}
	
	}
	}
