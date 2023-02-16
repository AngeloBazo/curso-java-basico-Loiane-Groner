package com.loiane.cursojava.aula35;

public class Exercicio02Aula35 {

	public static int soma(int num) {
		
		if( num == 1) {
			return 1;
		}
 
		return num + soma(num - 1);

	}

}
