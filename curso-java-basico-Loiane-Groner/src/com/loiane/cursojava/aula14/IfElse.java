package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Entre com sua idade :" );
		
		int idade = scan.nextInt ();
		
	
		if (idade >= 18){
		
			System.out.println ("é maior de idade" );
		
		} else {
				
				System.out.println ("é menor de idade" ); }
		
		
		
		//barato: <=10
		// pedir desconto: 10< valor < 15
		// pesquisar mais: 15 <== valor 17
		// muito caro: >= 17
		
		
		System.out.println ("Entre com o valor do item:" );
		
	double valor = scan.nextDouble();
	
	if (valor <= 10) {
		System.out.println ("Barato - pode comprar" );
				
	} else if (valor > 10 && valor <15) {
		
		System.out.println ("Pedir desconto:" );
		
	} else if (valor >= 15 && valor < 17) {
		System.out.println ("Pesquisar mais:" );
		
		} else { // valor >= 17 
			
			System.out.println ("Muito caro:" );
		}
	}
}




