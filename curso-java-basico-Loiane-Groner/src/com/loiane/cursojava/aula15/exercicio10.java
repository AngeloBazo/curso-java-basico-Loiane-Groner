package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println ("Que turno vc estuda: M - Matutino, V - Vespertino, N - noturno ");
		
		String turno = scan.nextLine();
		
		switch (turno) {
		
		case "M": System.out.println ("Bom dia!" ); break;
		case "m": System.out.println ("Bom dia!" ); break;
		case "V": System.out.println ("Boa tarde!" ); break;
		case "v": System.out.println ("Boa tarde!" ); break;
		case "N": System.out.println ("Boa noite!" ); break;
		case "n": System.out.println ("Boa noite!" ); break;
		default: System.out.println ("Valor inválido:"); 
		}

		

	}

}
