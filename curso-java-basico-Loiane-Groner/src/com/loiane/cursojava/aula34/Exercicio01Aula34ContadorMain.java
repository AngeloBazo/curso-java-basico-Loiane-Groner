package com.loiane.cursojava.aula34;

public class Exercicio01Aula34ContadorMain {

	public static void main(String[] args) {

		System.out.println("valor inicial do contador : " + Exercicio01Aula34Contador.contadorInicial);

		Exercicio01Aula34Contador.incrementarContador();

		System.out.println("valor após incremento : " + Exercicio01Aula34Contador.contadorInicial);

		Exercicio01Aula34Contador.incrementarContador();

		System.out.println("valor após incremento : " + Exercicio01Aula34Contador.contadorInicial);

		Exercicio01Aula34Contador.decrementarContador();

		System.out.println("valor após decremento : " + Exercicio01Aula34Contador.contadorInicial);

		Exercicio01Aula34Contador.zerarContador();

		System.out.println("valor após zerar : " + Exercicio01Aula34Contador.contadorInicial);

		Exercicio01Aula34Contador.numerarContador(500);
		
		System.out.println("Valor após numerar : " + Exercicio01Aula34Contador.contadorInicial);
	
		System.out.println("---- testes ----");
		
		int [] testeVetor01 = new int [5];
		
		for (int count = 0; count < testeVetor01.length; count++) {
			
			testeVetor01[count] = count * 50;
			
			System.out.println("Posição " + count + " : \t" +  testeVetor01[count]);
		
			
		}
		


			System.out.println("FIM");
			
		}

}



