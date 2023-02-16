package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
		
	int primeiroNumero, segundoNumero, terceiroNumero, a, b;
	
	double c;
		
System.out.println("Digite o primeiroNumero: ");

primeiroNumero = scan.nextInt();

System.out.println("Digite o segundoNumero: ");

segundoNumero = scan.nextInt();

System.out.println("Digite o terceiroNumero: ");

terceiroNumero = scan.nextInt();

a = ((primeiroNumero * 2) * (segundoNumero/2));

System.out.println ("a) o produto do dobro do primeiro com a metade do segundo: " + a);

b = ((primeiroNumero*3) + terceiroNumero);

System.out.println ("b) a soma do triplo do primeiro com o terceiro: " + b);

c = Math.pow (terceiroNumero, 3);

System.out.println ("c) o terceiro elevado ao cubo: " + c);



	}

}
