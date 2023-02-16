package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner (System.in);
		
		double ladoQuadrado;
		
System.out.println("Digite a medida do lado do quadrado: ");

ladoQuadrado = scan.nextDouble();

System.out.println ("A área deste quadrado é: " + ladoQuadrado * ladoQuadrado);

System.out.println ("O dobro da área deste quadrado é: " + ladoQuadrado * ladoQuadrado * 2);
				

	}

}
