package com.loiane.cursojava.aula33;

import java.util.Scanner;

public class Exercicio01Aula33LampadaMain {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		Exercicio01Aula33Lampada lampada01 = new Exercicio01Aula33Lampada(false);
		
		System.out.println("A lampada está ligada? : " + lampada01.isLampadaLigada());
		System.out.println("");
		System.out.println("Deseja ligar a lampada? : 1) Sim ou 2) Não");
		
		int opcaoDigitada = teclado.nextInt();
		
		if (opcaoDigitada == 1) {
			lampada01.ligarLampada();	
		}
				
		System.out.println("A lampada está ligada? : " + lampada01.isLampadaLigada());

	}

}
