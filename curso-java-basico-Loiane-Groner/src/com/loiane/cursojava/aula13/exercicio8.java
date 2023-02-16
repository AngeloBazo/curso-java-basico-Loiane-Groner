package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
		
		double valorHora, horasTrabalhadas;
		
System.out.println("Digite qto vc ganha por hora: ");

valorHora = scan.nextDouble();

System.out.println("Digite qtas horas vc trabalha por Mês: ");

horasTrabalhadas = scan.nextDouble();


System.out.println ("Seu salário mensal é: " + horasTrabalhadas * valorHora);

	}

}
