package com.loiane.cursojava.aula35;

public class Exer01Aula35_metodo {

	static int a = 0;
	static int b = 1;
	static int c;

	public static int fibo(int n) {

		System.out.print(" [ " + a + " ] ");
				
		for (int count = 0; count < n; count++) {
			
			c = a + b;
			a = b;
			b = c;
			
			System.out.print(" [ " + c + " ] ");
		
		}

		return c;

	}

}
