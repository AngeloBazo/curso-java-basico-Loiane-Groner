package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Entre a primeira nota:" );
		
		double primeiraNota = scan.nextDouble ();
		
System.out.println ("Entre a segunda nota:" );
		
		double segundaNota = scan.nextDouble ();
		
		double mediaNota = (primeiraNota + segundaNota) /2; 
		
		System.out.println ("Sua média foi:" + mediaNota);
		
			
		
		if ( mediaNota >= 7 && mediaNota <=9.9) {
			
			System.out.println ("APROVADO " );
		
		} else if (mediaNota < 7) {
			
			System.out.println ("REPROVADO " );
		
		} else {
			
			System.out.println ("Aprovado com LOUVOR " );
					
	
		}
}
}	
	