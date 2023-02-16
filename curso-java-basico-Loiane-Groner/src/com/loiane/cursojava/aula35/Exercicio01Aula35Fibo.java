package com.loiane.cursojava.aula35;

public class Exercicio01Aula35Fibo {

	public static int fibo(int num) {

		int a = 0;
		int b = 1;
		int c = 0;
		
		for (int count = 0; count < num; count++) {

			System.out.print(" " + a + " ");

			c = a + b;
			a = b;
			b = c;

			if (count == 14) {
				return 1;
			}
		
		}
		
		return fibo (a);

	}

}
