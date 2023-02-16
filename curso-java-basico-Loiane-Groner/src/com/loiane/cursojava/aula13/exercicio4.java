package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
						
		
				System.out.println("Digite a nota do 1 bimestre: ");
		
		double nota1bimestre = scan.nextDouble();
						
System.out.println("Digite a nota do 2 bimestre: ");
		
		double nota2bimestre = scan.nextDouble();
		
System.out.println("Digite a nota do 3 bimestre: ");
		
		double nota3bimestre = scan.nextDouble();
		
System.out.println("Digite a nota do 4 bimestre: ");
		
		double nota4bimestre = scan.nextDouble();
		
		
		
		System.out.println ("A média de suas notas é: " + (nota1bimestre + nota2bimestre + nota3bimestre + nota4bimestre)/4);

		
	}

}
