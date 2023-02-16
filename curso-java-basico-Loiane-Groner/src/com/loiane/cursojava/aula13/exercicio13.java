package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double ganhoHora, horasTrabalhadas, salarioBruto, descontoInss, descontoSindicato, salarioLiquido;
			
	System.out.println("Digite qto ganha por hora: ");

	ganhoHora = scan.nextDouble();

	System.out.println("Digite qtas horas trabalha no mês: ");

	horasTrabalhadas = scan.nextDouble();

	salarioBruto = ganhoHora * horasTrabalhadas;
	
	descontoInss = salarioBruto / 100 * 11; 
	
	descontoSindicato = salarioBruto / 100 * 5;
	
	salarioLiquido = salarioBruto - descontoInss - descontoSindicato; 
	
	System.out.println("Salário bruto mensal é: " + salarioBruto );

	System.out.println("Desconto INSS - 11%: " + descontoInss);
	
	System.out.println("Desconto Sindicato - 5%: " + descontoSindicato);
	
	System.out.println("Salário líquido: " + salarioLiquido);
	
	}

}
