package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner (System.in);
		
		double ladoQuadrado;
		
System.out.println("Digite a medida do lado do quadrado: ");

ladoQuadrado = scan.nextDouble();

System.out.println ("A �rea deste quadrado �: " + ladoQuadrado * ladoQuadrado);

System.out.println ("O dobro da �rea deste quadrado �: " + ladoQuadrado * ladoQuadrado * 2);
				

	}

}
