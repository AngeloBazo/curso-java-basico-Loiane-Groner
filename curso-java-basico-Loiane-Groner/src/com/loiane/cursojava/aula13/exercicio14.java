package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);

		double tamanhoArquivo, velocidadeLink, resultadoTempo;
			
	System.out.println("Digite o tamanho do arquivo para download: ");

	tamanhoArquivo = scan.nextDouble();
	
		System.out.println("Digite a velocidad para baixar em Mbps: " );
	
	velocidadeLink = scan.nextDouble();

	resultadoTempo = tamanhoArquivo / velocidadeLink;

	System.out.println("Tempo esperado em segundos: " + resultadoTempo );
	
		
	System.out.println("Tempo esperado em minutos: " + resultadoTempo /60 );
	
		
	}

}
