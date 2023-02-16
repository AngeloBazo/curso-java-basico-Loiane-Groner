package com.loiane.cursojava.aula34;

public class Exercicio01Aula34Contador {

	public static int contadorInicial = 0;
	
	public static void zerarContador() {
		contadorInicial = 0;
	}

	public static void incrementarContador() {
		contadorInicial += 1;
	}
	
	public static void decrementarContador() {
		contadorInicial -= 1;
	}

	public static int numerarContador (int numero) {
		
		contadorInicial = numero;
		
		return contadorInicial; 
		
	}
	
}
