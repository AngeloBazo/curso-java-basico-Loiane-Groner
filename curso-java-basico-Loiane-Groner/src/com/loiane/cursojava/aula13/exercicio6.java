package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
	
		double raioCirculo, areaCirculo;
				
		Scanner scan = new Scanner (System.in);
				
System.out.println("Digite o raio do circulo: ");

raioCirculo = scan.nextDouble();

// areaCirculo = 3.14 * raioCirculo * raioCirculo;

areaCirculo = Math.PI * Math.pow (raioCirculo,2);

System.out.println ("A área deste círculo é: " + areaCirculo);

	}

}
