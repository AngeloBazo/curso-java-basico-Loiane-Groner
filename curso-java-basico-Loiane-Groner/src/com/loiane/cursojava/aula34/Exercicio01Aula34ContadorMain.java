package com.loiane.cursojava.aula34;

public class Exercicio01Aula34ContadorMain {

	public static void main(String[] args) {

		System.out.println("valor inicial do contador : " + Exercicio01Aula34Contador.contadorInicial);

		Exercicio01Aula34Contador.incrementarContador();

		System.out.println("valor ap�s incremento : " + Exercicio01Aula34Contador.contadorInicial);

		Exercicio01Aula34Contador.incrementarContador();

		System.out.println("valor ap�s incremento : " + Exercicio01Aula34Contador.contadorInicial);

		Exercicio01Aula34Contador.decrementarContador();

		System.out.println("valor ap�s decremento : " + Exercicio01Aula34Contador.contadorInicial);

		Exercicio01Aula34Contador.zerarContador();

		System.out.println("valor ap�s zerar : " + Exercicio01Aula34Contador.contadorInicial);

		Exercicio01Aula34Contador.numerarContador(500);
		
		System.out.println("Valor ap�s numerar : " + Exercicio01Aula34Contador.contadorInicial);
	
		System.out.println("---- testes ----");
		
		int [] testeVetor01 = new int [5];
		
		for (int count = 0; count < testeVetor01.length; count++) {
			
			testeVetor01[count] = count * 50;
			
			System.out.println("Posi��o " + count + " : \t" +  testeVetor01[count]);
		
			
		}
		


			System.out.println("FIM");
			
		}

}



