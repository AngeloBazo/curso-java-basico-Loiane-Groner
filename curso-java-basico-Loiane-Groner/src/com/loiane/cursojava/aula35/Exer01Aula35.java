package com.loiane.cursojava.aula35;

import java.util.Scanner;

public class Exer01Aula35 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um n�mero da sequ�ncia FIBO: ");

		int nDigitado = teclado.nextInt();

		System.out.println("SEQ:");
		Exer01Aula35_metodo.fibo(nDigitado-1);
		
		System.out.println("");
		System.out.println("Na seq fibo o N equivalente � o n�: " + Exer01Aula35_metodo.c);
		
	
	
	
	}

}
